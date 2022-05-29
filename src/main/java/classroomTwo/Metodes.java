package classroomTwo;

public class Metodes {
    public static void main(String[] args) {
        // metode printetText
        System.out.println("Sākās koda izpilde");
        printetText();
        System.out.println("Beidzās koda izpilde");


        // metode calculateArea
        int a = 10;
        int b = 50;
        int laukums = calculateArea(a,b);
        System.out.println(laukums);


        //metode loginInPage
        loginInPage("Jānis", "parole123");
    }

    static void loginInPage (String username, String password){
        System.out.println("Ievadām lietotāja vārdu " + username);
        System.out.println("Ievadām paroli " + password);
    }

    static int calculateArea(int a, int b){
        return a * b;
    }

    static void printetText(){
        System.out.println("Šī ir mana metode sākums");
        System.out.println("Es izsaucu šo metodi beigas");
    }
}
