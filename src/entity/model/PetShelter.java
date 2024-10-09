package entity.model;

import exception.AdoptionException;
import java.util.ArrayList;
import java.util.List;

public class PetShelter {
 
    private List<Pet> availablePets;

    public PetShelter() {
        availablePets = new ArrayList<>();
    }

    public void addPet(Pet pet) throws AdoptionException {
        if (pet == null) {
            throw new AdoptionException("Cannot add a null pet to the shelter.");
        }
        if (pet.getAge() <= 0) {
            throw new AdoptionException("Invalid pet age. Cannot add pet to the shelter.");
        }
        availablePets.add(pet);
        System.out.println(pet.getName() + " has been added to the shelter.");
    }

    public void removePet(Pet pet) throws AdoptionException {
        if (pet == null || !availablePets.contains(pet)) {
            throw new AdoptionException("Cannot remove pet. The pet is not in the shelter.");
        }
        availablePets.remove(pet);
        System.out.println(pet.getName() + " has been removed from the shelter.");
    }


    public void listAvailablePets() {
        if (availablePets.isEmpty()) {
            System.out.println("No pets are available for adoption at the moment.");
            return;
        }

        System.out.println("Available pets for adoption:");
        for (Pet pet : availablePets) {
            try {
                if (pet.getName() == null || pet.getBreed() == null) {
                    throw new NullPointerException("Pet information is incomplete.");
                }
                System.out.println(pet);
            } catch (NullPointerException e) {
                System.out.println("Error: " + e.getMessage() + " Please check pet details.");
            }
        }
    }
}
