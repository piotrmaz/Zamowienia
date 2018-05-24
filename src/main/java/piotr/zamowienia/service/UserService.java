package piotr.zamowienia.service;

import java.util.List;

import piotr.zamowienia.models.User;

public interface UserService {

	public User findUserByEmail(String email);
	
	public void saveUser(User user);
	
	public List<User> findAll();
	
	public User findUserById(int id);
	
	public void deleteUser(User user);
	
	public void updateUser(String rola, User user);
}
