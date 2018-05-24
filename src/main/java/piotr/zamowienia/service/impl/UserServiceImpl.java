package piotr.zamowienia.service.impl;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import piotr.zamowienia.models.Role;
import piotr.zamowienia.models.User;
import piotr.zamowienia.repository.RoleRepository;
import piotr.zamowienia.repository.UserRepository;
import piotr.zamowienia.service.UserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	
	@Override
	public User findUserByEmail(String email) { 
		return userRepository.findUserByEmail(email);
	}

	@Override
	public void saveUser(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setActive(1);
        Role userRole = roleRepository.findByRole("ROLE_USER");
        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
		userRepository.save(user);
	}

	@Override
	public List<User> findAll() {
		List<User> userList = null;
		userList = userRepository.findAll();
		return userList;
	}

	@Override
	public User findUserById(int id) {
		return userRepository.findUserById(id);
	}
	
	@Override
	public void deleteUser(User user) {

      //  userRepository.findUserById(id);
        
        userRepository.delete(user);
       
            
	}
	
	@Override
	public void updateUser(String rola, User user) {
		Role userRole = roleRepository.findByRole(rola);
		user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
		userRepository.save(user);
		
	}


}
