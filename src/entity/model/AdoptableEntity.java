package entity.model;

import exception.AdoptionException;

public abstract class AdoptableEntity implements IAdoptable {

    private String name;

    public AdoptableEntity(String name) throws AdoptionException {
        if (name == null || name.isEmpty()) {
            throw new AdoptionException("Adoptable entity name cannot be null or empty.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws AdoptionException {
        if (name == null || name.isEmpty()) {
            throw new AdoptionException("Adoptable entity name cannot be null or empty.");
        }
        this.name = name;
    }

    @Override
    public abstract void adopt() throws AdoptionException;

    @Override
    public String toString() {
        return "AdoptableEntity [Name=" + name + "]";
    }
}
