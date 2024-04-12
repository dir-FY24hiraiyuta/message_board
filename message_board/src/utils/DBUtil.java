package utils;

public class DBUtil {
    private static final String PERSISTENCE_UNIT_NAME_STRING = "message_board";
    private static EntityManagerFactory emf;
    
    public static EntityManager createEntityManager() {
        return getEntityManagerFactory.createEntityManager();
    }
    
    private static EntityManagerFactory getEntityManagerFactory() {
        if(emf == null) {
            emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        }

        return emf;
    }
    

}
