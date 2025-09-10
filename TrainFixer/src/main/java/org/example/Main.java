package org.example;

import org.example.LinkedList.MyLinkedList;
import org.example.TrainCars.FreightCar;
import org.example.TrainCars.Locomotive;
import org.example.TrainCars.TrainCar;

public class Main {
    public static void main(String[] args) {

        MyLinkedList<TrainCar> testList = new MyLinkedList<TrainCar>();
        testList.add(new TrainCar(1, "test"));
        testList.add(new TrainCar(2, "test"));

        System.out.println(testList.size());

        System.out.println(testList.get(1));

    }
}