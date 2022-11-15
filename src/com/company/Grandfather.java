package com.company;

public class Grandfather extends Family{


    public Grandfather(String name, int age, String bachelor, CharacteristicEnum characteristicEnum) {
        super(name, age, bachelor, characteristicEnum);
    }

    @Override
    public void print() {
        System.out.println("Grandfather{" +
                "\nname=" + getName() +
                "\nage=" + getAge() +
                "\nbachelor=" + getBachelor() +
                "\ncharacteristicEnum=" + getCharacteristicEnum() +
                '}');

    }
}


