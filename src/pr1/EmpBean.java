package pr1;

public class EmpBean {

	int id;
	String name;
	int sal;
	
	public EmpBean() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public EmpBean(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.sal+"";
	}
	
}
