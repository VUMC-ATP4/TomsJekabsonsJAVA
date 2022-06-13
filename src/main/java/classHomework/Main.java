package classHomework;

import static classHomework.Trissturis.irVienadmalu;
import static classHomework.Trissturis.irVienadsanu;
// 2.uzdevums
public class Main {
    public static void main(String[] args) {
        //2.1
        System.out.println("Uzdevums 2.1.");
        Trissturis trissturis1 = new Trissturis();
        trissturis1.mala1 = 8;
        trissturis1.mala2 = 8;
        trissturis1.mala3 = 9;
        System.out.println("Mala viens ir: " + trissturis1.mala1 + " , mala divi ir: " + trissturis1.mala2 + " , mala trīs ir: " + trissturis1.mala3);
        System.out.println(trissturis1.laukums());
        System.out.println(irVienadmalu());


        //2.2
        System.out.println("\nUzdevums 2.2.");
        Trissturis trissturis2 = new Trissturis(8, 8, 8);
        System.out.println(trissturis2.laukums());
        System.out.println(irVienadmalu());
        System.out.println(irVienadsanu());
    }

}
