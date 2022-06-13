package classroomFour;

public class House {
    String ielasNosaukums;
    int majasNumurs;
    int stavuSkaits;
    int ieejuSkaits;
    int istabuSkaits;
    double platiba;
    boolean irStavieta;
    Cena cena;
    public double cenaKvadratmetra(){
        return cena.cena/platiba;
    }

    public void printetAdresi(){ //iekavās var nepadot vērtības
        System.out.println("Mājas adrese ir: " + ielasNosaukums + " " + majasNumurs);
    }
    public void printetParejo(){
        System.out.println("Stāvu skaits: " + stavuSkaits +
                "\nIstabu skaits: " + istabuSkaits +
                "\nieeju skaits: " + ieejuSkaits +
                "\nStāvieta: " + irStavieta +
                "\nPlatība: " + platiba +
                "\nCena: " + "\nCena Kvadrātmetrā ir: " +
                "\n");
    }

}
