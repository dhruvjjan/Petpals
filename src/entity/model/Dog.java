package entity.model;

import exception.AdoptionException;

public class Dog extends Pet {
    
    private String dogBreed;


    public Dog(String name, int age, String breed, String dogBreed) throws AdoptionException {
        super(name, age, breed); // Call the Pet constructor
        if (dogBreed == null || dogBreed.isEmpty()) {
            throw new AdoptionException("Dog breed cannot be null or empty.");
        }
        this.dogBreed = dogBreed;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) throws AdoptionException {
        if (dogBreed == null || dogBreed.isEmpty()) {
            throw new AdoptionException("Dog breed cannot be null or empty.");
        }
        this.dogBreed = dogBreed;
    }

    @Override
    public String toString() {
        return super.toString() + ", DogBreed=" + dogBreed;
    }
}
