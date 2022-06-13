package classHomework;
// 1.uzdevums
public class Trissturis {
    //1.1
    int mala1;
    int mala2;
    int mala3;
    double laukums;

    //1.2
    Trissturis() {
        System.out.println("Veidoju trīsstūri!");
    }
    //1.3
    Trissturis(int mala1, int mala2, int mala3) {
        this.mala1 = mala1;
        this.mala2 = mala2;
        this.mala3 = mala3;

        System.out.println("Mala viens ir " + mala1 + ", mala divi ir " + mala2 + ", mala trīs ir " + mala3);
    }
    public double laukums(){
        double pusePerimetra = (mala1 + mala2 + mala3)/2;
        System.out.println("Trīsstūra laukums ir: ");
        return laukums = Math.sqrt(pusePerimetra *(pusePerimetra - mala1) * (pusePerimetra - mala2) * (pusePerimetra - mala3));
    }
    //1.4
    static boolean irVienadmalu(){
        int mala1 = 8;
        int mala2 = 8;
        int mala3 = 8;
        if (mala1 == mala2 && mala2 == mala3){
            return true;
        }else{
            return false;
        }
    }
    //1.5
    static boolean irVienadsanu(){
        int mala11 = 8;
        int mala22 = 8;
        int mala33 = 9;
        if ((mala11 == mala22 && mala22 != mala33) || (mala11 == mala33 && mala22 != mala33) ||  (mala22 == mala33 && mala11 != mala33)){
            return true;
        }else{
            return false;
        }
    }





}
