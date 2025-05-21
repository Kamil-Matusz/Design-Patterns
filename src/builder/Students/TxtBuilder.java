package builder.Students;

public class TxtBuilder extends StudentBuilder{
    @Override
    public void setName(String name) {
        student.setName(name);
    }

    @Override
    public void setSurname(String surname) {
        student.setSurname(surname);
    }

    @Override
    public void setIndexNumber(String indexNumber) {
        student.setIndexNumber(indexNumber);
    }

    @Override
    public void setSpecialization(String specialization) {
        student.setSpecialization(specialization);
    }

    public void saveToFile(String filename) {
        try (java.io.PrintWriter writer = new java.io.PrintWriter(filename)) {
            writer.println("Name: " + student.getName());
            writer.println("Surname: " + student.getSurname());
            writer.println("Index Number: " + student.getIndexNumber());
            writer.println("Specialization: " + student.getSpecialization());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
