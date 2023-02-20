package utilities;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EMUtil {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("personUnit");
	
	public static EntityManager provideEntityManager() {
		return emf.createEntityManager();
	}

}
