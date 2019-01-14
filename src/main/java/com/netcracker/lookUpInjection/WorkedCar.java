package com.netcracker.lookUpInjection;

public class WorkedCar implements ICar {
    private Car workedCar;

    public void setWorkedCar(Car workedCar) {
        this.workedCar = workedCar;
    }

    public Car getCar() {
        return this.workedCar;
    }
}
