package com.company;

public abstract class Family implements Printable{

    private String name;
    private int age;
    private String bachelor;
    private CharacteristicEnum characteristicEnum;

    public Family(String name, int age, String bachelor, CharacteristicEnum characteristicEnum) {
        this.name = name;
        this.age = age;
        this.bachelor = bachelor;
        this.characteristicEnum = characteristicEnum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBachelor() {
        return bachelor;
    }

    public void setBachelor(String bachelor) {
        this.bachelor = bachelor;
    }

    public CharacteristicEnum getCharacteristicEnum() {
        return characteristicEnum;
    }

    public void setCharacteristicEnum(CharacteristicEnum characteristicEnum) {
        this.characteristicEnum = characteristicEnum;
    }

}
