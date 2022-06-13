package classroomFour;

public class Main {
    public static void main(String[] args) {

        //Praktiskais darbs

        Kompanija parKompaniju2 = new Kompanija();
        parKompaniju2.nosaukums = "SIA Dzirnavas";
        parKompaniju2.adrese = "Gaileņu iela";
        parKompaniju2.darbiniekuSkaits = 290;
        parKompaniju2.irStavieta = true;
        parKompaniju2.nestradajosoDarbiniekuSkaits = 100;

        parKompaniju2.parKompaniju();


        //Objekts 1
        House majaViens = new House(); // House - class name OOP
        majaViens.majasNumurs = 1;
        majaViens.ielasNosaukums = "Brīvības iela";
        majaViens.stavuSkaits = 4;
        majaViens.ieejuSkaits = 3;
        majaViens.istabuSkaits = 5;
        majaViens.platiba = 100;
        majaViens.irStavieta = true;

        majaViens.printetAdresi(); //printēt adresi

        //Objekts 2
        House majaDivi = new House();
        majaDivi.majasNumurs = 2;
        majaDivi.ielasNosaukums = "Ģertrūdes iela";
        majaDivi.stavuSkaits = 9;
        majaDivi.ieejuSkaits = 1;
        majaDivi.istabuSkaits = 10;
        majaDivi.platiba = 400;
        majaDivi.irStavieta = false;

        majaDivi.printetAdresi(); //printēt adresi
        majaDivi.printetParejo(); //printēt parējo





        // Velosipēda projekts izmantojot klasi Velosipeds
        Velosipeds velosipeds1 = new Velosipeds();
        Velosipeds velosipeds2 = new Velosipeds();


        velosipeds2.bremzuTips = "Disku";
        velosipeds2.spiedPedalus();
        velosipeds2.spiedPedalus();
        velosipeds2.spiedPedalus();
        System.out.println("Velosipēda2 ātrums ir " + velosipeds2.atrums);
        velosipeds2.bremze();
        velosipeds2.bremze();
        System.out.println("\n");



        System.out.println(velosipeds1.atrumi);
        System.out.println(velosipeds1.nosaukums);
        System.out.println("Velosipēda ātrums ir " + velosipeds1.atrums);
        velosipeds1.spiedPedalus();
        velosipeds1.spiedPedalus();
        velosipeds1.spiedPedalus();
        velosipeds1.spiedPedalus();
        System.out.println("Priekšā gājējs");
        velosipeds1.bremze();
        System.out.println("Velosipēda ātrums ir " + velosipeds1.atrums);
        velosipeds1.bremze();
        velosipeds1.bremze();
        velosipeds1.bremze();
        System.out.println("Velosipēda ātrums ir " + velosipeds1.atrums);


        System.out.println("####################");

        Rinkis rinkis1 = new Rinkis(5.34);


        Rinkis rinkis2 = new Rinkis();
        rinkis2.radiuss = 15.30;
        System.out.println("####################");

        //laukuma aprēķins rinkim izvade
        System.out.println(rinkis1.rinkaLaukums());
        System.out.println(rinkis2.rinkaLaukums());
        //diametra aprēķinas rinkim izvade
        System.out.println(rinkis1.diametrs());
        System.out.println(rinkis2.diametrs());


    }
}
