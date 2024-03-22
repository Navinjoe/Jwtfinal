package security.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import security.model.User;

@Repository
public interface Userrepository extends JpaRepository<User,Integer> {
	
	Optional<User>findByUsername(String username);


	

}
