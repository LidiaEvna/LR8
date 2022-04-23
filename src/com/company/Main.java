package com.company;
public class Main {
    public static void main(String[] args) {
        Veterinary vet = new Veterinary();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog(" Мясом", " ул.Пушкино ", " Никита"," Алабай");
        animals[1] = new Cat(" Кормом", " ул.Циолковского ", " Мася"," Британка");
        animals[2] = new Horse(" Яблоками", " село Кулой,"," Коктель", " Мустанг");

        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }
    }
}
 abstract class Animal {
     String food;
     String location;
     String name;
     String breed;

     Animal(String food, String location,String name,String breed) {
         this.food = food;
         this.location = location;
         this.name = name;
         this.breed =breed;
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

        Dog(String food, String location, String name, String breed) {
            super(food, location, name,breed);

        }
        @Override
        public void makeNoise() {
            System.out.printf("Name: %s \n breed: %s \n speaking: гаф");
        }
        @Override
        public void sleep() {
            System.out.printf("Собака спит");
        }
    }
    class Cat extends Animal {

        Cat(String food, String location, String name, String breed) {
            super(food, location, name,breed);

        }
        @Override
        public void makeNoise() {
            System.out.printf("Name: %s \n breed: %s \n speaking: мяу");
        }
        @Override
        public void sleep() {
            System.out.printf("Кошка спит");
        }
    }
    class Horse extends Animal {

        public Horse(String food, String location, String name, String breed) {
            super(food, location, name,breed);
        }
        @Override
        public void makeNoise() {
            System.out.printf("Name: %s \n breed: %s \n speaking: иго-го");
        }
        @Override
        public void eat() {
            System.out.printf("Лошадь ест");
        }
    }
    class Veterinary {
        void treatAnimal(Animal animal) {
            System.out.println("На приеме у ветеринара ,была " +animal.name);
            System.out.println("Кличка" +animal.name);
            System.out.println("Порода" +animal.breed);
            System.out.println( "Питается " +animal.food);
            System.out.println("Питомец находится" +animal.location);
            System.out.println();
        }
    }