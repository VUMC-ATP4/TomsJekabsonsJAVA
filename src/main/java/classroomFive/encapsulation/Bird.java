package classroomFive.encapsulation;

// klase
 public class Bird {

     private String colour;
     private String name = "Pollija";


    public void setColour(String colour) {
        this.colour = colour;
    }
    public String getColour() {
        return colour;
    }




    //metode
    // public visur pieejama
     public void printText(){
         System.out.println("Šī ir publiska metode");
         System.out.println("Printēju putnu");
         printTextSpecial();
     }

     //Private pieejama tikai klasē
     private void printTextSpecial(){
         System.out.println("Šī ir privāta metode");
     }

     //default pieejama pakotnē
     void defaultMethodExample(){
         System.out.println("Šī ir default metode");
     }


}
