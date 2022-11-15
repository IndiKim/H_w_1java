package com.company;

public class Father extends Family{

    public Father(String name, int age, String bachelor, CharacteristicEnum characteristicEnum) {
        super(name, age, bachelor, characteristicEnum);
    }

    @Override
    public void print() {
        System.out.println("Father{" +
                "\nname=" + getName() +
                "\nage=" + getAge() +
                "\nbachelor=" + getBachelor() +
                "\ncharacteristicEnum=" + getCharacteristicEnum() +
                '}');


    }
}
