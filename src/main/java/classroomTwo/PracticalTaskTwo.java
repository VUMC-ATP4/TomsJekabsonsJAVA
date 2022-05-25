package classroomTwo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PracticalTaskTwo {
    public static void main(String[] args) {

//        int skaitliss = 25;
//
//        if (skaitliss == 10) {
//            System.out.println("Skaitlis ir " + skaitliss);
//        } else if (skaitliss == 15) {
//            System.out.println("1Skaitlis ir " + skaitliss);
//        } else if (skaitliss == 20) {
//            System.out.println("2Skaitlis ir " + skaitliss);
//        }else {
//            System.out.println("Skaitlis ir nezināms");
//        }


        // ne priekš auto testiem!
        //tips nosaukums deklarācija
//        Scanner scanner = new Scanner(System.in);

        // mainīgie
//        int vecums;
//        boolean canVote = false;
//        // IF statementi
//        System.out.println("Tavs vecums?");
//        vecums = scanner.nextInt();
//        if (vecums >= 18){
//            canVote = true;
//        }
//
//        if (canVote) {
//            System.out.println("cilvēks var balsot");
//        } else {
//            System.out.println("Cilvēks nevar balsot");
//        }
//
//        int month = 2;
//        switch (month) {
//            case 1:
//                System.out.println("Janvāris");
//                break;
//            case 2:
//                System.out.println("Februāris");
//                break;
//            case 12:
//                System.out.println("Decembris");
//            default:
//                System.out.println("Mēnesis " + month + " nav definēts!");
//        }



//        int x = 10;
//        int y = 20;
//
//        if (y > x && x > 5) {
//            System.out.println(true);
//        }
//        if (y > x || x > 25) {
//            System.out.println(true); // būs true jo viens izpildās!
//        }
//
//            // if ar else
//        int skaitlis = -5;
//
//        if (skaitlis > 0){
//            System.out.println(skaitlis + " ir pozitīvs!");
//        }else if (skaitlis < 0){
//            System.out.println(skaitlis + " ir negatīvs!");
//        }else {
//            System.out.println(skaitlis + " ir nulle!");
//        }



//        System.out.println("Ievadi savu vārdu");
//
//        String name = scanner.nextLine();
//        System.out.println("Labdien " + name + "!");
//        System.out.println("Esi sveicināts kalkulatora programmā!");

//        int a;
//        int b;
//        int summa;
//
//        System.out.println("Ievadi skaitli a");
//        a = scanner.nextInt();
//        System.out.println("Ievadi skaitli b");
//        b = scanner.nextInt();
//        System.out.println(a > b);
//        System.out.println("Šeit jābūt nepatiesam " + (5>10));
//        System.out.println(5<10); // true
//        System.out.println(6==5); // false
//        System.out.println(5==5); // true
//        System.out.println(6!=5); // true
//        System.out.println(5!=5); // false
//        int vecums = 18;
//        System.out.println(vecums >= 18); // true
//        int bernaVecums = 5;
//        System.out.println(bernaVecums <= 5); // true, ja nav = false
//        System.out.println(vecums > bernaVecums);
//        boolean isEligibleToVote = vecums >= 18;
//        System.out.println("Vai cilvēks drīkst balsot? " + isEligibleToVote);
//
//        String name = "Toms";
//        String nameTwo = "Toms";
//        System.out.println("Vai vārds ir vienāds ar vārdu? " + name.equals(nameTwo));
//
//        System.out.println("Ievadi X");
//        int x = 4;
//        int summa = 10;
//        boolean vaiIrPatiess = (x < 5  && x < 10);
//        x = 5;
//        System.out.println((x < 5 && x < 10));
//        System.out.println((x < 5 || x < 10));
//
//        System.out.println(vaiIrPatiess);

//        summa = a + b;
//        System.out.println(String.format("%s + %s = %s", a, b, summa));




        // Vecie ieraksti

//        System.out.println("Šī ir otrā Java lekcija!");
//        String teksts;
//        String name = "Juris";
//        teksts = String.format("Mani sauc %s", name);
//
//        double a = 100.25;
//        int b = 10;
//
//        //System.out.println("a-b=" + (a - b));
//        System.out.println(String.format("%.2f",(b / a)));
//
//        System.out.println(teksts);
//
//        String nameDivi = "Toms";
//        String surname = "Jekabsons";
//        String role = "skolēns";
//        double videjaAtzime = 7.312;
//
//        String concatTeikums = "Mani sauc " + nameDivi + "." + "Mans uzvārds ir " + surname + "." + "Mana loma " + role + ".";
//        String teikums = String.format("Mani sauc %s. Mans uzvārds ir %s. Es esmu %s. Mana vidējā atdzīme",nameDivi,surname,role);
//
//        System.out.println(teikums);
//        System.out.println(concatTeikums);
//
//
//        int a = 10;
//        int b = 20;
//        int c = 20;
//        int d = 0;
//        System.out.println((a < b) && (b == c));  // && un
//        System.out.println(a > b || c == d); // || vai
//        System.out.println(!(a > b));  // ! nē



        // Uzdevumu izpilde!!!!!!!!
        int q = 10;

        if (q > 0) {
            System.out.println(true);
        }

        int cilvekaVecums = 65;
        char dzimums = 'S';
        boolean drikstDoties = false;
        if (dzimums == 'V' && cilvekaVecums >=65){
            drikstDoties = true;
        } else if (dzimums == 'S' && cilvekaVecums >= 60){
            drikstDoties = true;
        }
        System.out.println("Cilvēks drīkst doties pensijā " + drikstDoties);



        // Pāru skaitļu pārbaude

        // 12 % 2 = 0
        // 13 % 2 = 1
        // 15 % 2 = 1

        int skaitlisX = 15;
        if (skaitlisX % 2 == 0){
            System.out.println("Skaitlis ir pāra");
        } else {
            System.out.println("Skaitlis ir nepāra");
        }
    }
}
