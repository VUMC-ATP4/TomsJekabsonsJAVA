package homeworkThree;

import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        //1.uzdevums
        System.out.println("Pirmais uzdevums!");
        int vesSkaitli = 0;
        while (vesSkaitli <= 100){
            System.out.println("Ievadi veselu skaitli: ");
            int sk = scanner.nextInt();
            vesSkaitli = vesSkaitli + sk;
        }
        System.out.println("Gatavs!");

        //2.uzdevums
        System.out.println("Otrais uzdevums!");
        boolean g = false;
        System.out.println("Ievadi veselu skaitli: ");
        int c = scanner.nextInt();
        for (int i = 2; i <= c/2; ++i) {
            if(c % i == 0){
                g = true;
                break;
            }
        }
        if (c<2) {
            System.out.println("Nav pirmskaitlis!");
        } else if (!g) {
            System.out.println("Ir pirmskaitlis!");
        } else{
            System.out.println("Nav pirmskaitlis!");
        }

        //3.uzdevums
        System.out.println("Trešais uzdevums");

        int[] skaitluMasivs = {1,2,3,4,5,6,7,8,9,10,33};
        String[] masinuMasivs = {"BMW", "Audi", "Mercedes", "Subaru"};
        char[] simboluMasivs = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')'};

        System.out.println("Skaitļu masīvs: \n");
        int a = 0;
        while (a < skaitluMasivs.length){
            System.out.println(skaitluMasivs[a]);
            a++;
        }
        int b = 0;
        do {
            System.out.println(skaitluMasivs[b]);
            b++;
        }while (b < skaitluMasivs.length);

        for (int i = 0; i < skaitluMasivs.length; i++) {
            System.out.println(skaitluMasivs[i]);
        }

        System.out.println("Mašīnu masīvs: \n");
        int l = 0;
        while (l < masinuMasivs.length){
            System.out.println(masinuMasivs[l]);
            l++;
        }
        int d = 0;
        do {
            System.out.println(masinuMasivs[d]);
            d++;
        }while (d < masinuMasivs.length);

        for (int i = 0; i < masinuMasivs.length; i++) {
            System.out.println(masinuMasivs[i]);
        }

        System.out.println("Simbolu masīvs: \n");
        int e = 0;
        while (e < simboluMasivs.length){
            System.out.println(simboluMasivs[e]);
            e++;
        }
        int f = 0;
        do {
            System.out.println(simboluMasivs[f]);
            f++;
        }while (f < simboluMasivs.length);

        for (int i = 0; i < simboluMasivs.length; i++) {
            System.out.println(simboluMasivs[i]);
        }

        //4.uzdevums
        System.out.println("Ceturtais uzdevums");

        int[] saraksts = new int[100];
        for (int i = 1; i < saraksts.length; i++) {
            if (i % 2 ==0){
                System.out.println(i);
            }
        }

        //5.uzdevums
        System.out.println("Piektais uzdevums!");

        System.out.println("Ievadi veselu skaitli: ");
        int skaitlis = scanner.nextInt();
        int faktorSk = 1;
        int faktorRez = 1;
        for (faktorSk = 1; faktorSk <= skaitlis; faktorSk++){
            faktorRez = faktorRez * faktorSk;
        }
        System.out.println("Faktoriāls " + skaitlis + " = " + faktorRez);

        //6.uzdevums
        System.out.println("Sestais uzdevums!");
        final int pin = 1234;
        int reizes = 0;
        int kods = 0;
        while(reizes++ < 3 && pin != kods){
            System.out.print("Lūdzu ievadiet PIN kodu: ");
            kods = scanner.nextInt();
            if (kods == pin)
                System.out.println("PIN ir pieņemts,laipni lūdzam atpakaļ!");
            else if (reizes == 3)
                System.out.println("Atvainojiet, bet Jūs esat bloķēts!");
            else
                System.out.println("Nepareizs PIN, mēģiniet vēlreiz!");
        }

    }
}
