package homework11.prob1;

import java.util.Objects;

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
	public boolean equals(Object ob)
	{
		if(ob == null) return false;
		if(!(ob instanceof Key)) return false;
		Key st = (Key)ob;
		return (this.getFirstName().equals(st.getFirstName()) && this.getLastName().equals(st.getLastName()));
	}
	@Override
	public int hashCode()
	{
//		int result = 17;
//		result = result * 31 + this.firstName.hashCode();
//		result = result * 31 + this.lastName.hashCode();
		return Objects.hash(this.getFirstName(), this.getLastName());
//		return result;
	}
}
