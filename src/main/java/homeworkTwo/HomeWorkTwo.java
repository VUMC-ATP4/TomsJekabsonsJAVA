package homeworkTwo;

public class HomeWorkTwo {
    public static void main(String[] args) {
        int x = 1;
        System.out.println(x > 0);
        System.out.println(x > 5);
        System.out.println(x > 5 == x > 10);
        System.out.println(x <= 5 && x < 10);
        System.out.println(x == 0 || x == 10);
        System.out.println(x * x > 10); // nezinu īsti kā 1*1 var būt lielāks, ja uzdevums prasa true

        //2. uzdevums
        int month = 3;
        switch (month) {
            case 1:
                System.out.println("Janvāris");
                break;
            case 2:
                System.out.println("Februāris");
                break;
            case 3:
                System.out.println("Marts");
                break;
            case 4:
                System.out.println("Aprīlis");
                break;
            case 5:
                System.out.println("Maijs");
                break;
            case 6:
                System.out.println("Jūnijs");
                break;
            case 7:
                System.out.println("Jūlijs");
                break;
            case 8:
                System.out.println("Augusts");
                break;
            case 9:
                System.out.println("Septembris");
                break;
            case 10:
                System.out.println("Oktobris");
                break;
            case 11:
                System.out.println("Novembris");
                break;
            case 12:
                System.out.println("Decembris");
            default:
                System.out.println("Mēnesis " + month + " nav definēts!");
        }

        //3. uzdevums

        int skaitliss = 25;

        if (skaitliss > 30) {
            System.out.println("Skaitlis ir lielāks par 30");
        } else if (skaitliss > 45) {
            System.out.println("Skaitlis ir lielāks par 45");
        } else if (skaitliss > 55) {
            System.out.println("Skaitlis ir lielāks par 55");
        }else {
            System.out.println("Skaitlis nav lielāks par norādītajiem skaitļiem!");
        }

        //4.uzdevums

        String colorOne = "Sarkana";
        String colorTwo = "Dzeltena";
        String colorThree = "Zaļš";

        System.out.println(colorOne + " - Kustību nevar veikt!");
        System.out.println(colorTwo + " - Kustību var veikt!");
        System.out.println(colorThree + " - Kustība jau notiek!");

//        String colorLuksofors
//        colorOne = scanner.next();
//
//        if (colorLuksofors == "Sarkans"){
//            System.out.println("STOP");
//        } else if (colorLuksofors == "Dzeltens"){
//            System.out.println("Var sākt kustību");
//        } else if (colorLuksofors == "Zaļš"){
//            System.out.println("Var kustēties");
//        } else {
//            System.out.println("Ja nav iedegtas gaismas veikt kustību uzmanīgi");
//        }


        //5.uzdevums

        printBusinessCard();
        printBusinessCard();
        printBusinessCard();

        //6.uzdevums

        printBusinessCardTwo("Toms", "Jēkabsons", "+371 2999000", "1995");

        //7.uzdevums
        int a = 4;
        int b = 10;
        int summa = sum(a, b);
        System.out.println(summa);

        // 8.uzdevums

        System.out.println(average(10,2,4));
    }

    static void printBusinessCard() {
        // 5.uzdevums
        System.out.println("Vizītkarte");
        System.out.println("##########");
        System.out.println("Vārds: Toms");
        System.out.println("Uzvārds: Jēkabsons");
        System.out.println("Telefona numurs: +371 29990000");
        System.out.println("Dzimšanas gads: 1995");
        System.out.println("##########");
    }
    static void printBusinessCardTwo(String vards, String uzvards, String telefons, String dzimsanasGads){
        // 6.uzdevums
        System.out.println("Ievadām vārdu " + vards);
        System.out.println("Ievadām uzvārdu " + uzvards);
        System.out.println("Ievadām telefona numuru " + telefons);
        System.out.println("Ievadām dzimšanas gadu " + dzimsanasGads);
    }
    static int sum(int a, int b){
        // 7.uzdevums
        return a + b;
    }

    static int average(double q, double w, double e){
        // 8.uzdevums - neizdodas nekādīgi :D
        // ja average ieliek int strādā viss! ieliekot double vislaik kaut kas nepatīk?!
        return q + w + e;
    }
}
