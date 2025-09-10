package org.example.TrainCars;

/**
 * Generic train car class. Each instantiation functions as a node in the linked list.
 */
public class TrainCar{

    protected int trainCarId;
    protected String trainCarType;

    public TrainCar(int carId, String trainCarType) {
        this.trainCarId = carId;
        this.trainCarType = trainCarType;
    }

    public int getTrainCarId() {
        return trainCarId;
    }

    public void setTrainCarId(int trainCarId) {
        this.trainCarId = trainCarId;
    }

    public String getTrainCarType() {
        return trainCarType;
    }

    public void setTrainCarType(String trainCarType) {
        this.trainCarType = trainCarType;
    }

    @Override
    public String toString() {
        return "Train{" +
                "Train Car ID=" + trainCarId +
                ", Train Car Type=" + trainCarType +
                '}';
    }
}
