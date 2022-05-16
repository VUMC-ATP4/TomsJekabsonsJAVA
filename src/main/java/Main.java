public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Toms Java 1 Lekcija");

        // integer - vesels skaitlis, bez komentiem
        int x = 5;
        int y = 10;

        System.out.println("X ir vienāds ar:");
        System.out.println(x);
        System.out.println("Y ir vienāds ar:");
        System.out.println(y);
        System.out.println("X + Y ir vienāds ar:");
        System.out.println(x+y);



        //[Mainīgā tips] [Mainīgā nosaukums] = [vērtība];
        // Vārdi un teikumi java valodā tiek saglabāti mainīgā tipā 'String'
        String dogName = "Reksis";

        //Veseli skaitļi tiek definēti ar mainīgā tipu 'int'
        int dogAge = 15;

        //piemēri skaitļiem
        byte age = 10;
        short deepestSeaLevel = 11500;
        int budzets = 2147483647;
        long garumsMax = 2100122022122010L;

        //Daļskaitļi tiek definēti ar mainīgā tipu 'double' vai 'float'
        double dogWeigth = 15.5;

        String dogBreed = "VAS";

        //Jā - true, nē - false jautājums tiek definēts ar mainīgā tipu 'boolean'
        boolean isDogHungry = true;

        //Vienu simbolu definē ar mainīgā tipu 'char'
        char dogGender = 'M';

        //Piemērs ar kombināciju
        int dogPrice = 100;
        char currency = '$';

        //Printouti terminālī!
        System.out.println("Suņa vārds: " +  dogName);
        System.out.println("Suņa vecums: " + dogAge);
        System.out.println("Suņa svars: " + dogWeigth);
        System.out.println("Suņa šķirne: " + dogBreed);
        System.out.println("Vai suns ir izsalcis? " + isDogHungry);
        System.out.println("Suņa dzimums ir: " + dogGender);
        System.out.println("Suņa kucēni maksā: " + dogPrice + currency);

        int summa;
        int pirmaisSkaitlis = 20;
        int otraisSkaitlis = 10;

        //Simbolu piemēri
        int starpiba = pirmaisSkaitlis - otraisSkaitlis;
        summa = pirmaisSkaitlis + otraisSkaitlis;
        int dalijums = pirmaisSkaitlis / otraisSkaitlis;
        int reizinajums = pirmaisSkaitlis * otraisSkaitlis;
        int atlikums = pirmaisSkaitlis % otraisSkaitlis;

        int a = 1;
        int b = 4;
        int c = 7;

        int vienadojums = 5+5*2;

        System.out.println("########" + b / a);

        System.out.println("Ja atlikums ir 0, tad pāra skaistlis" + b % 2);

        System.out.println("Starpība" + starpiba);
        System.out.println("summa" + summa);
        System.out.println("Dalījums" + dalijums);
        System.out.println("Reizinājums" + reizinajums);
        System.out.println("atlikum" + atlikums);



    }
}