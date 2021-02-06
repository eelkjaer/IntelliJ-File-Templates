package ${PACKAGE_NAME};

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

public class ${NAME}Facade {

  private static ${NAME}Facade instance;
  private static EntityManagerFactory emf;

  // Private Constructor to ensure Singleton
  private ${NAME}Facade() {}

  /**
   * @param _emf
   * @return an instance of this facade class.
   */
  public static ${NAME}Facade get${NAME}Facade(EntityManagerFactory _emf) {
    if (instance == null) {
      emf = _emf;
      instance = new ${NAME}Facade();
    }
    return instance;
  }

  private EntityManager getEntityManager() {
    return emf.createEntityManager();
  }

  public List<${ENTITY_NAME}> getAll() {
      EntityManager em = emf.createEntityManager();
      try {
        TypedQuery<${ENTITY_NAME}> query =
            em.createQuery(
                "SELECT QUERY HERE", ${ENTITY_NAME}.class);
        return query.getResultList();
      } finally {
        em.close();
      }
  }
}
