package classroomFour;

public class Kompanija {
    String nosaukums;
    String adrese;
    int darbiniekuSkaits;
    int nestradajosoDarbiniekuSkaits;
    boolean irStavieta;

    public void parKompaniju(){
        System.out.println("Kompānijas nosaukums ir " + nosaukums + "\nKompānijas adrese ir " + adrese + "\nKompānijā strādā " + darbiniekuSkaits + " kuriem ir " + irStavieta + " stāvieta!\n");
    }
}
