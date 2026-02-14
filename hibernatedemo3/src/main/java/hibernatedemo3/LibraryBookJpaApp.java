/**
 * 
 */
package hibernatedemo3;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;


/**
 * 
 */


public class LibraryBookJpaApp {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("myPersistenceUnit");

        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();

            // ✅ CREATE (INSERT)
            Book b1 = new Book(1, "Java Basics", "James Gosling",
                    "Programming", 500.0, true, "21-07-2013");

            Book b2 = new Book(2, "Hibernate Guide", "Gavin King",
                    "Technology", 700.0, false, "09-05-2021");

            Book b3 = new Book(3, "Spring Boot", "Rod Johnson",
                    "Framework", 900.0, true, "15-08-2022");

            em.persist(b1);
            em.persist(b2);
            em.persist(b3);

            System.out.println("✅ Books Inserted");

            Book foundBook = em.find(Book.class, 1);
            System.out.println("\n📘 Found Book:");
            System.out.println(foundBook);

            List<Book> books =
                    em.createQuery("SELECT b FROM Book b", Book.class)
                            .getResultList();

            System.out.println("\n📚 All Books:");
            books.forEach(System.out::println);

            if (foundBook != null) {
                foundBook.setPrice(550.0);
                foundBook.setAvailableStatus(true);

                em.merge(foundBook);

                System.out.println("\n✅ Updated Book:");
                System.out.println(foundBook);
            }

            // ✅ DELETE
            Book bookToDelete = em.find(Book.class, 3);

            if (bookToDelete != null) {
                em.remove(bookToDelete);
                System.out.println("\n🗑 Deleted Book:");
                System.out.println(bookToDelete);
            }

            em.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
            emf.close();
        }
    }
}
