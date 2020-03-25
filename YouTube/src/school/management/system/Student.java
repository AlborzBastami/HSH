package school.management.system;

/**
 * @author Alborz This class is responsible to keep track of students id for the
 *         student: unique name of the student grade of the student Fees for
 *         every Student is $ 30.000; feesPaid is initially 0 feesTotal
 */
public class Student {
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;

	public Student(int id, String name, int grade) {
		this.feesPaid = 0;
		this.feesTotal = 30000;
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", " + (name != null ? "name=" + name + ", " : "") + "grade=" + grade + "]" + "Fees Paid: $ " + feesPaid; 
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}

	public int getFeesPaid() {
		return feesPaid;
	}

	public int getFeesTotal() {
		return feesTotal;
	}

	/**
	 * Keep adding the fees to feesPaid field feespaid = 10.000 + 5.000 + 15.000 The
	 * school is going to receive the funds
	 * 
	 * @param fees the fees that the student pays.
	 */
	public void payFees(int fees) {
		feesPaid += fees;
		School.updateTotalMoneyEarned(feesPaid);
	}

	/**
	 * @return the remaining fees
	 */
	public int getRemainingFees() {
		return feesTotal - feesPaid;
	}

	/**
	 * @param grade new grade of the student Used to update the student's grade
	 * 
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}

}
