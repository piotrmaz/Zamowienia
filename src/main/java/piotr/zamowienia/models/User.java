package piotr.zamowienia.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "users")
public class User {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="users_seq")
	@SequenceGenerator(name="users_seq", sequenceName="users_seq", allocationSize=1)
	@Column(name = "user_id")
	private int id;

	@Column(name = "email")
	@Email(message = "Podaj adres email")
	@NotEmpty(message = "Adres email jest wymagany")
	private String email;

	@Column(name = "password")
	@Length(min = 5, message = "Hasło musi zawierać min. 5 znaków")
	@NotEmpty(message = "Hasło jest wymagane")
	private String password;

	@Column(name = "name")
	@NotEmpty(message = "Podaj swoje imię")
	private String name;

	@Column(name = "last_name")
	@NotEmpty(message = "Podaj swoje nazwisko")
	private String lastName;
	
	@Column(name = "active")
	private int active;

	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="user_role", joinColumns = @JoinColumn(name="user_id"), inverseJoinColumns = @JoinColumn(name="role_id"))
	private Set<Role> roles;
	
	@Transient
	private int rolaInt;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public int getRolaInt() {
		return rolaInt;
	}

	public void setRolaInt(int rolaInt) {
		this.rolaInt = rolaInt;
	}

	
}
