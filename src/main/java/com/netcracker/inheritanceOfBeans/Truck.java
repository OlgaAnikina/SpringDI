package com.netcracker.inheritanceOfBeans;

public class Truck {

    private String name;
    private int countOfWheels;
    private int potencia;
    private int fuelСonsumption;

    public void setName(String name) {
        this.name = name;
    }

    public void setCountOfWheels(int countOfWheels) {
        this.countOfWheels = countOfWheels;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setFuelСonsumption(int fuelСonsumption) {
        this.fuelСonsumption = fuelСonsumption;
    }

    public String getName() {
        return name;
    }

    public int getCountOfWheels() {
        return countOfWheels;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getFuelСonsumption() {
        return fuelСonsumption;
    }
}
