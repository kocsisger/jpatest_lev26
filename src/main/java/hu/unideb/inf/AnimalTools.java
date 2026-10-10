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

        dao.saveAnimal(a);
    }
}
