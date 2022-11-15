package com.company;

public class Main {

    public static void main(String[] args) {


            Family GrandFather = createObject("GrandFather");
            System.out.println(GrandFather);
            GrandFather.print();
            System.out.println();
            Family Father = createObject("Father");
            System.out.println(Father);
            Father.print();
            System.out.println();
            Family Son = createObject("Son");
            System.out.println(Son);
            Son.print();





        }private static Family createObject(String className){
            switch (className){
                case "GrandFather":
                    return new Grandfather("Pavel",79,"Архитектор",CharacteristicEnum.ACTIVE);
                case "Father":
                    return new Father("Tolya", 52, "Доктор",CharacteristicEnum.OPTIMISM);
                default:
                    return new Son("Alan", 20, "Бездельник", CharacteristicEnum.HUMOR);
            }
        }
    }
