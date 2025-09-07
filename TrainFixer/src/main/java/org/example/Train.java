package org.example;

import java.util.LinkedList;

public class Train<T> {

    private String name;
    private int trainId;
    LinkedList<T> train;

    public Train(String name, int trainId) {
        this.name = name;
        this.trainId = trainId;
        train = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTrainId() {
        return trainId;
    }

    public void setTrainId(int trainId) {
        this.trainId = trainId;
    }

    public LinkedList<T> getTrain() {
        return train;
    }

    public void setTrain(LinkedList<T> train) {
        this.train = train;
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainId=" + trainId +
                ", name='" + name + '\'' +
                '}';
    }
}
