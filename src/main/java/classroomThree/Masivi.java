package classroomThree;

import java.util.Scanner;

public class Masivi {
    public static void main(String[] args) {
        //PIEMĒRS MASĪVIEM
        // izmērs 10
        // ciparuSaraksts = 10,20,30,40,50,60,70,80,90,100
        //ciparuSaraksts[0] atbilde būs 10;
        //ciparuSaraksts[8] atbilde būs 90;

        String[] gadalaiki = {"Pavasaris", "Vasara", "Rudens", "Ziema"};
        int[] fibonnacciNumbers = {0,1,1,2,3,5,8,13,21,34};
        double[] randomSkaitli = {21.3,323.23,412.25};

        //Noteikt garumu ar length
        System.out.println("Masīva garums ir: " + gadalaiki.length);

        System.out.println(gadalaiki[0]);
        System.out.println(gadalaiki[1]);
        System.out.println(gadalaiki[2]);
        System.out.println(gadalaiki[3]);

        System.out.println(fibonnacciNumbers[4]);
        System.out.println(randomSkaitli[2]);

        //Nomainīt indexa nosaukumu!
        gadalaiki[1] = "TOMS";
        System.out.println(gadalaiki[1]);

        //Uzdevums pirms pauzes!
        String[] cilvēki = {"Juris", "Pēteris", "Anna"};
        int[] vecums = {33, 40, 29};
//        System.out.println("Vārds: " + cilvēki[0] + "\n" + "Vecums " + vecums[0]);
        printCilvēks(cilvēki,vecums,1);


        //jauns masīvs
        //obligāti jānosaka String lielums
//        String[] germanCars = new String[4]; // string 4 nosauka cik vietas masīvā! vēl jāaizpilda
//        germanCars[0] = "Mercedes";
//        germanCars[1] = "Audi";
//        germanCars[2] = "BMW";
//        germanCars[3] = "Opel";
//
//        System.out.println(germanCars[3]);
//
//        //Vērtību ievade ar skeneri
//        //Ievadi skaitli 1, ievadi skaitli 2, ievadi skaitli 3
//        int[] mansMasīvs = generateArray();
//        System.out.println(mansMasīvs[0] + "" + mansMasīvs[1] + "" + mansMasīvs[2]);


        // Cikli
//        int i = 0;
//        while(i<5){
//            System.out.println("I ir: " + i);
//            //i = i + 1;
//            i++; // increments +1 - vai tas pats kas  i = i + 1
//        }
//
//        int q = 10;
//        while(q > 1){
//            System.out.println("Q ir: " + q);
//            q--; // ir tas pats kas q = q - 1;
//        }

//        while(true){
//            int r = 0;
//            r++;
//            System.out.println(r);
//        }

//        int[] bingoLotoLaimigieSkaitli = {3,5,48,8,6,31};
//        int counter = 0;
//        while(counter < bingoLotoLaimigieSkaitli.length){
//            System.out.println(bingoLotoLaimigieSkaitli[counter]);
//            counter++;
//        }
//
//        String [] kartis = {"Pīķa dūzis", "Ercena kalps", "Kārava dāma"}; // izprintēt visus masīva vērtības
//        int karts = 0;
//        System.out.println("Masīva izmērs: " + kartis.length);
//        while (karts < kartis.length){
//            System.out.println(kartis[karts]);
//            karts++;
//        }

//        sumPositiveNumbers();

        Scanner scanner = new Scanner(System.in);
//        String parole = "Parole123";
//        String lietotajaParole;
//        do {
//            System.out.println("Ievadi paroli");
//            lietotajaParole = scanner.nextLine();
//            System.out.println("Pārbaudām paroli");
//        } while (!lietotajaParole.equals(parole));
//        System.out.println("Pareiza parole");

//        int number;
//        do {
//            System.out.println("Ievadi skaitli lielāku par 0, bet mazāku par 10");
//            number = scanner.nextInt();
//        } while (number < 0 && number > 10);
//


        //FOR cikli
//        for (int j = 0; j < 10; j++) {
//            System.out.println(j);
//        }

//        for (int i = 0; i <= 10; i=i+2) {
//            System.out.println(i);
//        }

//        for (int i = 0; i < gadalaiki.length; i++) {
//            System.out.println(gadalaiki[i]);
//        }

        //Uzdevums!!!
        for (int i = 1; i <= 50; i++) {
            if ((i%3 == 0) || (i%5 == 0)) {
                System.out.println("Šis numurs mums neder! " + i);
            } else {
                System.out.println("Šis numurs mums der! " + i);
            }
        }

        int [] skaitlos = {1,2,3,4,5,6,7,8,9,3,6,7,8,4,3};
        int summa = 0;
        // For each cikls
        for(int skaitlis : skaitlos){
            summa = summa + skaitlis;
        }
        System.out.println(summa);

        String[] vardi = {"Ābols", "Bumbiers", "Burkāns"};
        for (String vards : vardi){
            System.out.println(vards);
        }

        // Break pārtraukuma paziņojums
        for (int i = 0; i < 10; i++) {
            if (i == 5){
                break;
            }
            System.out.println(i);
        }

        System.out.println("=================================");
        int[] skaitluMasivs = {1,2,3,4,5,6,7,2,3,4,5,6,-3,5,4,};
        for (int i = 0; i < skaitluMasivs.length; i++) {
            if (skaitluMasivs[i] == -3) {
                System.out.println(skaitluMasivs[i]);
                break;
            }
        }

        // Turpināt paziņojums (continue)
        System.out.println("=================================");
        for (int i = 0; i <= 10; i++) {
            if (i > 4 && i < 8){
                continue;
            }
            System.out.println(i);
        }



        //Main metode !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    }

    static int sumPositiveNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ieraksti skaitli: ");
        int number = scanner.nextInt();
        int summa = 0;
        while (number >= 0){
            summa = summa + number;
            System.out.println("Ieraksti skaitli: ");
            number = scanner.nextInt();
        }
        System.out.println("Pozitīvo skaitļu summa ir: " + summa);
        return summa;
    }

    static void printIntArray(int[] randomMasivs){
        int counter = 0;
        while(counter < randomMasivs.length){
            System.out.println(randomMasivs[counter]);
            counter++;
        }
    }

    static int[] generateArray(){
        // metode skenera ievadei
        Scanner scanner = new Scanner(System.in);// nodefinēt skeneri
        System.out.println("Ievadi pirmo skaitli....");
        int a = scanner.nextInt();
        System.out.println("Ievadi otro skaitli....");
        int b = scanner.nextInt();
        System.out.println("Ievadi trešo skaitli....");
        int c = scanner.nextInt();
        int[] skaitluMasivs = {a, b, c};
        return skaitluMasivs;
    }

    static void printCilvēks(String[] humans, int[] ages, int index){
        //Uzdevums pirms pauzes!
        System.out.println("Vārds: " + humans[index] + "\n" + "Vecums " + ages[index]);
    }


}
