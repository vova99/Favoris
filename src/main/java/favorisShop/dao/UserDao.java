package favorisShop.dao;

import favorisShop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface UserDao extends JpaRepository<User, Integer> {
    @Query("select u from User u where u.username like  ?1")
    User selectByUsername(String username);
}
