package it.eng.projectwork.gruppo2.model.test;

import java.util.List;

import javax.persistence.Query;

import org.junit.Test;

import it.eng.projectwork.gruppo02.model.User;

public class JpacrudTest extends JPAHibernateTest {

	
	@Test
	public void test1() {
		em.getTransaction().begin();
		
		
		User u = new User();
		u.setNome("Salvo");
		u.setCognome("Battaglia");
		u.setUsername("SalvoBatt");
		u.setEmail("group2eng@gmail.con");
		
		em.persist(u);
		
		
		em.getTransaction().commit();
		
	}
	
	@Test
	public void test2() {
		
		Query query = em.createQuery("SELECT u FROM User u WHERE u.email=:email");
		query.setParameter("email", "giancarlo.compagno@eng.it");
		List<User> users = query.getResultList();
		for(User user : users) {
			System.out.println(user);
		}
		 
	}
	
	
}
