package com.netcracker.injectionOfPrimitives;

public class Cat {
    private Animal Animal;
    private int weight;

    public Animal getAnimal() {
        return Animal;
    }

    public void setAnimal(Animal animal) {
        this.Animal = animal;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
