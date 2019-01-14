package com.netcracker.injectionOfPrimitives;

public class Dog {
    private Animal Animal;
    private int weight;

    public Dog(Animal Animal, int weight) {
        this.Animal = Animal;
        this.weight = weight;
    }

    public Animal getAnimal() {
        return Animal;
    }

    public int getWeight() {
        return weight;
    }

    public void setAnimal(com.netcracker.injectionOfPrimitives.Animal animal) {
        Animal = animal;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
