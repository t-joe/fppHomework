package homework5.prob2;

public class Professor extends DeptEmployee{
	int numberOfPublications;

	public Professor(double salary)
	{
		super(salary);
	}
	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}
	
}
