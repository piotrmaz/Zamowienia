package piotr.zamowienia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import piotr.zamowienia.models.User;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long>{

	public User findUserByEmail(String email);
	
	public User findUserById(int id);
	
}
