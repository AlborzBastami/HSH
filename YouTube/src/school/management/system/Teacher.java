package school.management.system;

/**
 * @author Alborz This class is responsible for keeping track of the teacher's
 *         name, id, salary
 */
public class Teacher {
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;

	/**
	 * @param id     for the teacher
	 * @param name   of the teacher
	 * @param salary of the teacher
	 */
	public Teacher(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.salaryEarned = 0;
	}
	
	public int getId() {
		return this.id;
	}
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return this.name;
	}
	
	/**
	 * Adds to salary
	 * Removes from the total money earned by the school
	 * @param salary
	 */
	public void receiveSalary(int salary) {
		salaryEarned+=salary;
		School.updateTotalMoneySpent(salary);
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", salary=" + salary + ", salaryEarned=" + salaryEarned + "]";
	}
	
	
	
}
