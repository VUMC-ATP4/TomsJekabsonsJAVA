package classroomFour;

public class Velosipeds {
    int atrums = 0;
    int atrumi = 21;
    String nosaukums = "Speacialized";
    String krasa = "Zaļa";
    int svarsGramos;
    double rataIzmers;
    String bremzuTips = "";

    public void bremze(){
        if (bremzuTips.equals("V - veida")){
            atrums = atrums - 2;
        } else if (bremzuTips.equals("Disku")){
            atrums = atrums - 3;
        } else {
            atrums = atrums - 1;
        }
    }

    public void spiedPedalus(){
        atrums = atrums + 5;
    }
}
