package hu.unideb.inf;

import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.h2.tools.Server;

public class Application {

    public static void main(String[] args) throws SQLException {
        startDatabase();

        AnimalDAO dao = new JPAAnimalDAO();

        Animal a = new Animal();
        a.setAge(20);
        a.setName("elephant");
        a.setGender(Animal.GenderType.FEMALE);

        dao.saveAnimal(a);
    }

    private static void startDatabase() throws SQLException {
        new Server().runTool("-tcp", "-web", "-ifNotExists");
    }
}
