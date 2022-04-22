package com.company;
public class Main {
    public static void main(String[] args) {
        Veterinary vet = new Veterinary();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Ест мясо", "ул.Пушкино", "Никита","Алабай");
        animals[1] = new Cat("Ест корм", "ул.Беляева", "Женский",3);
        animals[2] = new Horse("Ест яблоко", "село Кулой,",173, 6);

        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }
    }
}
 abstract class Animal {
     String food;
     String location;

     Animal(String food, String location) {
         this.food = food;
         this.location = location;
     }
     public void makeNoise() {
         System.out.println("Сидит");
     }
     public void eat() {
         System.out.println("Ест");
     }
     public void sleep() {
         System.out.println("Спит");
     }
 }
    class Dog extends Animal {
        String name;
        String breed;

        Dog(String food, String location, String name, String breed) {
            super(food, location);
            this.name = name;
            this.breed = breed;
        }
        public void makeNoise() {
            System.out.println("Гаф");
        }
        public void sleep() {
            System.out.println("Спит");
        }
    }
    class Cat extends Animal {
        String floor;
        int weight;

        Cat(String food, String location, String floor, int weight) {
            super(food, location);
            this.floor = floor;
            this.weight = weight;
        }
        public void makeNoise() {
            System.out.println("Мяу");
        }
        public void sleep() {
            System.out.println("Спит");
        }
    }
    class Horse extends Animal {
        int growth;
        int age;

        Horse(String food, String location, int growth, int age) {
            super(food, location);
            this.growth = growth;
            this.age = age;
        }
        public void makeNoise() {
            System.out.println("Иго-го");
        }
        public void eat() {
            System.out.println("Ест яблоко");
        }
    }
    class Veterinary {
        void treatAnimal(Animal animal) {
            System.out.print(animal.food + " ");
            System.out.println(animal.location);
        }
    }