package entity.model;

import exception.AdoptionException;

public interface IAdoptable {
    // Method to handle the adoption process
    void adopt() throws AdoptionException;
}
