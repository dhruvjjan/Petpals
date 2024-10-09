package entity.model;

import exception.AdoptionException;

public class Pet {
   
    private String name;
    private int age;
    private String breed;

 
    public Pet(String name, int age, String breed) throws AdoptionException {
        if (name == null || name.isEmpty()) {
            throw new AdoptionException("Pet name cannot be null or empty.");
        }
        if (age <= 0) {
            throw new AdoptionException("Pet age must be a positive integer.");
        }
        if (breed == null || breed.isEmpty()) {
            throw new AdoptionException("Pet breed cannot be null or empty.");
        }
        this.name = name;
        this.age = age;
        this.breed = breed;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) throws AdoptionException {
        if (name == null || name.isEmpty()) {
            throw new AdoptionException("Pet name cannot be null or empty.");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AdoptionException {
        if (age <= 0) {
            throw new AdoptionException("Pet age must be a positive integer.");
        }
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) throws AdoptionException {
        if (breed == null || breed.isEmpty()) {
            throw new AdoptionException("Pet breed cannot be null or empty.");
        }
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Pet [Name=" + name + ", Age=" + age + ", Breed=" + breed + "]";
    }
}
