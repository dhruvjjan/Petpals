package entity.model;

import exception.AdoptionException;

public class Cat extends Pet {

    private String catColor;

    public Cat(String name, int age, String breed, String catColor) throws AdoptionException {
        super(name, age, breed); // Call the Pet constructor
        if (catColor == null || catColor.isEmpty()) {
            throw new AdoptionException("Cat color cannot be null or empty.");
        }
        this.catColor = catColor;
    }


    public String getCatColor() {
        return catColor;
    }

    public void setCatColor(String catColor) throws AdoptionException {
        if (catColor == null || catColor.isEmpty()) {
            throw new AdoptionException("Cat color cannot be null or empty.");
        }
        this.catColor = catColor;
    }


    @Override
    public String toString() {
        return super.toString() + ", CatColor=" + catColor;
    }
}
