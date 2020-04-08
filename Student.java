import java.util.List;

class Student {
	String index;
	String firstName;
	String lastName;
	List<Integer>grades;

	public Student(String index,String firstName,String lastName,List<Integer>grades) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.grades = grades;

	}

	//TODO constructor

	public String getIndex() {
		return index;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public List<Integer> getGrades() {
		return grades;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setGrades(List<Integer> grades) {
		this.grades = grades;
	}
	//TODO seters & getters

	public double getAverage() {

		int suma=0;
		float proesek=1;
		for (int i : grades) {
			suma=suma+i;
		}

		proesek=suma/grades.size();

		return proesek;

	}

	public int ECTSCredits() {

		int suma=0;
		for (int i:grades) {
			if (i>5){
				suma+=6;
			}

		}

		return suma;

		
		//TODO
	}
}
