package hu.unideb.inf;

import java.util.List;

public interface AnimalDAO {
    //C
    public void saveAnimal(Animal a);
    //R
    public List<Animal> getAnimals();
    public void updateAnimal(Animal a);
    public void deleteAnimal(Animal a);
    public void saveZoo(Zoo zoo);
}
