package org.example.Utils;

import org.example.LinkedList.MyLinkedList;
import org.example.TrainCars.TrainCar;

import java.util.LinkedList;

public class Utils {

    public static int trainChecker(MyLinkedList<TrainCar> trainCars) {
        if(trainCars.size() <= 10 && !trainCars.get(0).getTrainCarType().equals("Lokomotiv")) {
            return 1;
        }

        return 0;
    }

    public static void trainFixer() {

        /*
         * Switch statement
         * trainChecker(trainCars)
         *  case 1:
         *      fix locomotive
         *  case 2:
         *      fix freightcar
         *  case 3:
         *      osv.
         */
    }

}
