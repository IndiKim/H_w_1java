package com.company;

final public class Son extends Family{


    public Son(String name, int age, String bachelor, CharacteristicEnum characteristicEnum) {
        super(name, age, bachelor, characteristicEnum);
    }

    @Override
    public void print() {
        System.out.println("Son{" +
                "\nname=" + getName() +
                "\nage=" + getAge() +
                "\nbachelor=" + getBachelor() +
                "\ncharacteristicEnum=" + getCharacteristicEnum() +
                '}');


    }
}
