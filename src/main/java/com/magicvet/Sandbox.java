package main.java.com.magicvet;

import main.java.com.magicvet.comparator.PetAgeComparator;
import main.java.com.magicvet.model.Cat;
import main.java.com.magicvet.model.Dog;
import main.java.com.magicvet.model.Pet;

import java.util.Arrays;

public class Sandbox {
    public static void main(String[] args) {

        Pet[] pets = {
                new Cat("14"),
                new Dog("13"),
                new Cat("117"),
                new Dog("122"),
                new Cat("17")
        };
        Arrays.sort(pets,new PetAgeComparator());
        for(Pet pet:pets){
            System.out.println(pet.getAge());
        }
    }
}
