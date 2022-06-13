package classroomFour;

import java.time.LocalDate;
import java.util.Date;

public class Rinkis {
    final double PI = 3.14;
    double radiuss;

    Rinkis () {
        System.out.println("Veidoju rinki......");
    }

    Rinkis(double radiuss){
        System.out.println("Veidoju rinki ar rādiusu " + radiuss);
        this.radiuss = radiuss;
    }

    public double rinkaLaukums () {
        return PI * (radiuss * radiuss);
    }

    public double diametrs () {
        return radiuss + radiuss;
    }


}
