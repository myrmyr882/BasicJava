package Basic4;

public class Student {
	private String name;
	private int Rollno;
	private int standard;
	
	
	public Student(String name, int rollno, int standard) {
		super();
		this.name = name;
		Rollno = rollno;
		this.standard = standard;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", Rollno=" + Rollno + ", standard=" + standard + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Rollno;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + standard;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (Rollno != other.Rollno)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (standard != other.standard)
			return false;
		return true;
	}

	
	
	
	
	
}
