package homework;

import java.util.concurrent.atomic.AtomicStampedReference;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println("This is homework!");

        String valstsNosaukums = "Latvija";
        int valstsIedzivotajuSkaits = 1902000;
        double valstsPlatiba = 64589.5;
        String valstsGalvaspilseta = "Rīga";
        String valstsValoda = "Latviešu";
        boolean irEsDalibvalsts = true;
        char valstsValuta = '€';

        System.out.println(valstsNosaukums);
        System.out.println(valstsGalvaspilseta);
        System.out.println(valstsIedzivotajuSkaits);
        System.out.println(valstsPlatiba);
        System.out.println(valstsValoda);
        System.out.println(valstsValuta);
        System.out.println(irEsDalibvalsts);

        //Konkatenācija

        System.out.println("Manu pilsētu sauc " + valstsGalvaspilseta + ", un tajā var norēķināties ar " + valstsValuta + " valūtu. " + valstsGalvaspilseta + " atrodas " + valstsNosaukums + ".");

        String vards = "Toms";
        String uzvards = "Jēkabsons";

        //String formāts

        String teikumsStringFormat = String.format("My name is %s %s and I live in %s, %s.",vards, uzvards, valstsGalvaspilseta, valstsNosaukums);

        System.out.println(teikumsStringFormat);

        //Aritmētiskie vienādojumi!

        int x = 20;
        int y = 30;
        int b = 40;

        int summa = x + y + b;

        System.out.println(summa);

        int vienadojums = (x * y - b);

        System.out.println(vienadojums);

        int cipari = x / y + b * 3;

        System.out.println(cipari);
    }
}
