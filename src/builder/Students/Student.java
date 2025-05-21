package builder.Students;

public class Student {

    private String name;
    private String surname;
    private String indexNumber;
    private String specialization;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void show() {
        System.out.println("Name " + name);
        System.out.println("Surname " + surname);
        System.out.println("Index Number " + indexNumber);
        System.out.println("Specialization " + specialization);
    }
}
