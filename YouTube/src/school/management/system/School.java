package school.management.system;

import java.util.*;

/**
 * Many teachers, many students. Implements teachers and student using an
 * ArrayList.
 * 
 * @author Alborz
 * 
 */
public class School {
	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;

	public School(List<Teacher> teacher, List<Student> student) {
		this.teachers = teacher;
		this.students = student;
		totalMoneyEarned = 0;
		totalMoneySpent = 0;
	}

	public List<Teacher> getTeacher() {
		return teachers;
	}

	/**
	 * @param teacher Adds a teacher to the school
	 */
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

	public List<Student> getStudent() {
		return students;
	}

	/**
	 * Adds a student to the school
	 * 
	 * @param student the student to be added
	 */
	public void addStudent(Student student) {
		students.add(student);
	}

	/**
	 * @returns the total money earned by the school
	 */
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	/**
	 * Adds the total money earned by the school
	 * 
	 * @param moneyEarned
	 */
	public static void updateTotalMoneyEarned(int moneyEarned) {
		totalMoneyEarned += moneyEarned;
	}
	

	/**
	 * @returns the total money spent by the school
	 */
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}

	/**
	 * update the money that is spent by the school which is the salary given by the
	 * school to its teachers
	 * 
	 * @param totalMoneySpent
	 */
	public static void updateTotalMoneySpent(int moneySpent) {
		totalMoneyEarned -= moneySpent;
	}

}
