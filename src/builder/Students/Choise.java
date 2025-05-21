package builder.Students;

import java.util.Scanner;

public class Choise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Director director = new Director();
        TxtBuilder builder = new TxtBuilder();

        System.out.print("Podaj imię: ");
        String name = scanner.nextLine();

        System.out.print("Podaj nazwisko: ");
        String surname = scanner.nextLine();

        System.out.print("Podaj numer indeksu: ");
        String indexNumber = scanner.nextLine();

        System.out.println("Wybierz specjalność:");
        System.out.println("1 - Sieci komputerowe");
        System.out.println("2 - Grafika");
        System.out.println("3 - Technologie wytwarzania oprogramowania");
        System.out.println("4 - Inżynieria systemów informatycznych");

        int choice = scanner.nextInt();
        scanner.nextLine();

        String specialization = switch (choice) {
            case 1 -> "Sieci komputerowe";
            case 2 -> "Grafika";
            case 3 -> "Technologie wytwarzania oprogramowania";
            case 4 -> "Inżynieria systemów informatycznych";
            default -> "Nieznana";
        };

        director.setBuilder(builder);
        Student student = director.constructStudent(name, surname, indexNumber, specialization);

        student.show();
        ((TxtBuilder) builder).saveToFile("student.txt");
    }
}

