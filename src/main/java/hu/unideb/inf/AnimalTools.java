package hu.unideb.inf;

public class AnimalTools {

    private AnimalDAO dao;

    public AnimalTools(AnimalDAO dao) {
        this.dao = dao;
    }

    public void manageAnimals(){
        Animal a = new Animal();
        a.setAge(20);
        a.setName("elephant");
        a.setGender(Animal.GenderType.FEMALE);

        Zoo zoo = new Zoo();
        zoo.setName("Debrecen Zoo");
        zoo.getAnimals().add(a);

        dao.saveZoo(zoo);
    }
}
