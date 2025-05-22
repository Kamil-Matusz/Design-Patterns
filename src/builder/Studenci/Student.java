package builder.Studenci;

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

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void showStudent() {
        System.out.println("Imie: " + name);
        System.out.println("Nazwisko: " + surname);
        System.out.println("Indeks: " + indexNumber);
        System.out.println("Specjalizacja: " + specialization);
    }
}
