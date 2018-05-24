package piotr.zamowienia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import piotr.zamowienia.models.Role;

@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role, Integer> {

	public Role findByRole(String role);
}
