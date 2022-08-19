package com.xworkz.cartooncharacter.dao;

import static com.xworkz.cartooncharacter.util.Factory.getFactory;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.cartooncharacter.entity.CartoonCharacterEntity;

public class CartoonCharacterImpl implements CartoonCharacterDAO {
	EntityManagerFactory factory = getFactory();

	@Override
	public boolean addAll(List<CartoonCharacterEntity> entities) {

		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			System.out.println("hai");
			tx.begin();
			for (CartoonCharacterEntity cartoonCharacterEntity : entities) {

				manager.persist(cartoonCharacterEntity);

			}
			tx.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return false;
	}

	@Override
	public CartoonCharacterEntity findByName(String name) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findAuthorByName");
			query.setParameter("an", name);
			Object obj = query.getSingleResult();
			// System.out.println("manoj1");
			if (obj != null) {
				// System.out.println("manoj2");
				CartoonCharacterEntity cartoonCharacterEntity = (CartoonCharacterEntity) obj;
				return cartoonCharacterEntity;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public CartoonCharacterEntity findByNameAndCountryAndGenderAndAuthor(String name, String country, String gender,
			String author) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByNameAndCountryAndGenderAndAuthor");
			query.setParameter("nm", name);
			Object obj = query.getSingleResult();
			if (obj != null) {
				CartoonCharacterEntity cartoonCharacterEntity = (CartoonCharacterEntity) obj;
				return cartoonCharacterEntity;
			}
			{
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public String findAuthorByName(String name) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findAuthorByName");
			query.setParameter("an", name);
			Object obj = query.getSingleResult();
			if (obj != null) {
				String cartoon = (String) obj;
				return cartoon;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public Object[] findNameAndCountryByAuthor(String author) {
		EntityManager manager = factory.createEntityManager();
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findNameAndCountryByAuthor");
			query.setParameter("at", author);
			Object obj = query.getSingleResult();
			Object[] cartoon = (Object[]) obj;
			return cartoon;

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public LocalDate findCreatedDateByAuthor(String author) {
		EntityManager manager = factory.createEntityManager();
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findCreatedDateByAuthor");
			query.setParameter("au", author);
			Object obj = query.getSingleResult();
			if (obj != null) {
				LocalDate cartoon = (LocalDate) obj;
				return cartoon;
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public void updateAuthorByName(String newAuthor, String name) {
		EntityManager manager = factory.createEntityManager();
		try {
			manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			Query query = manager.createNamedQuery("updateAuthor");
			query.setParameter("nm", name);
			query.setParameter("at", newAuthor);
			query.executeUpdate();
			transaction.commit();

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			manager.close();
		}

	}

	@Override
	public List<CartoonCharacterEntity> findAllByAuthor(String Author) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findAllByAuthor");
			query.setParameter("au", Author);
			List<CartoonCharacterEntity> obj = query.getResultList();
			if (obj != null) {

				return obj;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public List<CartoonCharacterEntity> findAllByAuthorAndGender(String author, String gender) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findAllByAuthorAndGender");
			query.setParameter("au", author);
			query.setParameter("ge", gender);
			List<CartoonCharacterEntity> obj = query.getResultList();
			if (obj != null) {

				return obj;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;

	}

	@Override
	public List<String> findAllCountry() {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findAllCountry");

			List<String> obj = query.getResultList();
			if (obj != null) {

				return obj;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public List<Object> findAllNameAndCountry() {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findAllNameAndCountry");

			List<Object[]> obj = query.getResultList();
			obj.forEach(objt -> System.out.println(objt[0] + "::" + objt[1]));

			if (obj != null) {

				return null;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public List<String> findAllName() {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findAllName");

			List<String> obj = query.getResultList();
			if (obj != null) {

				return obj;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public List<CartoonCharacterEntity> findAll() {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findAll");

			List<CartoonCharacterEntity> obj = query.getResultList();
			if (obj != null) {

				return obj;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public List<Object[]> findAllNameAndCountryAndAuthor() {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findAllNameAndCountryAndAuthor");

			List<Object[]> obj = query.getResultList();

			if (obj != null) {

				return obj;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
			return null;
		}
	}

	@Override
	public void updateTypeByName(String name, String type) {
		EntityManager manager = factory.createEntityManager();
		try {
			manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			Query query = manager.createNamedQuery("updateTypeByName");
			query.setParameter("name", name);
			query.setParameter("type", type);
			query.executeUpdate();
			transaction.commit();

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			manager.close();
		}
		
	}

	@Override
	public void deleteByName(String name) {
		EntityManager manager = factory.createEntityManager();
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			Query query = manager.createNamedQuery("deleteByName");
			query.setParameter("dname", name);
			query.executeUpdate();
			System.out.println("The Deleted Name Of Row of Table is :" + name);
			tx.commit();
		} catch (PersistenceException p) {
			p.printStackTrace();
		} finally {
			manager.close();
		}		
	}
}
