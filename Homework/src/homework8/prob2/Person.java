package homework8.prob2;

public class Person {
	private String lastName;
	private String firstName;
	private int age;
	int size = 0;
	private static Person[] persons;
	
	public Person()
	{
		persons = new Person[10];
	}
	// --------------------------------------------------------------
	public Person(String last, String first, int a) { // constructor
		lastName = last;
		firstName = first;
		age = a;
	}
	public void add(Person s){
		if(size == persons.length) resize();
		persons[size++] = s;
	}
	public Person get(int i){
		if(i < 0 || i >= size){
			return null;
		}
		return persons[i];
	}
	
	public boolean find(String lastName){
		for(Person test : persons){
			if(test.getLast().equals(lastName)) return true;
		}
		return false;
	}
	
	public void insert(Person s, int pos){
		if(pos > size) return;
		if(pos >= persons.length||size+1 > persons.length) {
			resize();
		}
		// can be improved by shifting every elements 1 position.
		shiftArray(pos, s);
		/*Person[] temp = new Person[persons.length+1];
		System.arraycopy(persons,0,temp,0,pos);
		temp[pos] = s;
		
		System.arraycopy(persons,pos,temp,pos+1, persons.length - pos);
		persons = temp;
		*/
		++size;
		
	}
	
	private void shiftArray(int pos, Person p)
	{
		if(pos >= persons.length || persons[pos] == null)
		{
			persons[pos] = p;
			return;
		}
		Person prs = persons[pos];
		persons[pos] = p;
		shiftArray(++pos, prs);
	}
	
	public boolean remove(String s){
		if(size == 0) return false;
		int index = -1;
		for(int i = 0; i < size; ++i ){
			if(persons[i].getLast().equals(s)){
				index = i;
				break;
			}
		}
		if(index==-1) return false;
		Person[] temp = new Person[persons.length];
		System.arraycopy(persons,0,temp,0,index);
		System.arraycopy(persons,index+1,temp,index,persons.length-(index+1));
		persons = temp;
		--size;
		return true;
	}
	
	
	private void resize(){
		System.out.println("resizing");
		int len = persons.length;
		int newlen = 2*len;
		Person[] temp = new Person[newlen];
		System.arraycopy(persons,0,temp,0,len);
		persons = temp;
	}

	// --------------------------------------------------------------
	public String getLast() // get last name
	{
		return lastName;
	}

	public Person[] getPersons()
	{
		return persons;
	}
	@Override
	public String toString() {
		return "Person [lastName=" + lastName + "\n FirstName=" + firstName + "\nAge=" + age + "]";
	}
	
}
