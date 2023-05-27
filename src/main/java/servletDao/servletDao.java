package servletDao;

import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import servletDto.servletDto;

public class servletDao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	public void create(servletDto dto) {
		et.begin();
		em.persist(dto);
		et.commit();
	}

	public String remove(int d) {
		servletDto std = em.find(servletDto.class, d);
		if (std != null) {
			et.begin();
			em.remove(std);
			et.commit();
			return "<h1>Data is deleted </h1>";
		} else {
			return "<h1>Data not found</h1>";
		}
	}

	public void update(servletDto dto) {
		et.begin();
		em.merge(dto);
		et.commit();
	}

	public String fetch(int id) {
		servletDto dto = em.find(servletDto.class, id);
		if (dto!=null) {
			return dto.toString();
		} else {
         return "data not found";
		}
		
	}

	public List<servletDto> fetchAll() {
		Query q1 = em.createQuery("select data from Student data");

		List<servletDto> l1 = q1.getResultList();
		return l1;

	}
}
