package ProjetoMavenMV.ProjetoMavenMV;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import dao.SorveteDAO;
import dao.SorveteDAOImpl;
import entidade.Sorvete;
import util.JpaUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SorveteDAO sorveteDAO = new SorveteDAOImpl();
        
        sorveteDAO.listarSorvetes();
    }
}
