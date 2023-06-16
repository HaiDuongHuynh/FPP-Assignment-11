package prob1;

import java.util.Objects;

import static java.util.Objects.hash;

public class Key {
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Key(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}

	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(ob.getClass() != Key.class) return false;
		Key k = (Key)ob;
		return k.firstName.equals(firstName) && k.lastName.equals(lastName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName);
	}

	@Override
	public String toString() {
		return "Key{" +
				"firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				'}';
	}
}
