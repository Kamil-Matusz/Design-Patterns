package visitor.StudentWinners;

public class ProgramNagrod implements Visitor {
    @Override
    public void odwiedz(StudentMagister studentMagister) {
        boolean kwalifikujeSie =
                studentMagister.getSrednia() >= 4.75 ||
                        (studentMagister.getSrednia() >= 4.5 && studentMagister.isWszystkoZaliczoneW1Termin()) ||
                        studentMagister.isLaureatKonkursu();

        if (kwalifikujeSie) {
            System.out.println("🎓 Student " + studentMagister.getImie() + " kwalifikuje się do programu nagród:");
            System.out.println("- Zwolnienie z części czesnego");
            System.out.println("- Karnet na siłownię");
            System.out.println("- Większy limit w bibliotece");
            System.out.println("- Dostęp do strzelnicy multimedialnej\n");
        } else {
            System.out.println("❌ Student " + studentMagister.getImie() + " nie kwalifikuje się do programu nagród.\n");
        }
    }

    @Override
    public void odwiedz(StudentInzynier studentInzynier) {
        boolean kwalifikujeSie =
                studentInzynier.getSrednia() >= 4.75 ||
                        (studentInzynier.getSrednia() >= 4.5 && studentInzynier.isWszystkoZaliczoneW1Termin()) ||
                        studentInzynier.isLaureatKonkursu();

        if (kwalifikujeSie) {
            System.out.println("🎓 Student " + studentInzynier.getImie() + " kwalifikuje się do programu nagród:");
            System.out.println("- Zwolnienie z części czesnego");
            System.out.println("- Karnet na siłownię");
            System.out.println("- Większy limit w bibliotece");
            System.out.println("- Dostęp do strzelnicy multimedialnej\n");
        } else {
            System.out.println("❌ Student " + studentInzynier.getImie() + " nie kwalifikuje się do programu nagród.\n");
        }
    }
}
