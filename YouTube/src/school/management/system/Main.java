package school.management.system;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Teacher lizzy = new Teacher(1, "Lizzy", 500);
		Teacher melissa = new Teacher(2, "Melissa", 700);
		Teacher vanderhorn = new Teacher(3, "Vanderhorn", 600);

		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(lizzy);
		teacherList.add(melissa);
		teacherList.add(vanderhorn);

		Student tamasha = new Student(1, "Tamasha", 4);
		Student rakshith = new Student(2, "Rakshith Vasudev", 12);
		Student rabbi = new Student(3, "Rabbi", 5);

		List<Student> studentList = new ArrayList<>();
		studentList.add(tamasha);
		studentList.add(rakshith);
		studentList.add(rabbi);

		School ghs = new School(teacherList, studentList);
		System.out.println("GHS has earned $ " + ghs.getTotalMoneyEarned());

		tamasha.payFees(5000);
		System.out.println("GHS has earned $ " + ghs.getTotalMoneyEarned());

		rakshith.payFees(6000);
		System.out.println("GHS has earned $ " + ghs.getTotalMoneyEarned());

		System.out.println("----------Making School pay salary----------");
		lizzy.receiveSalary(lizzy.getSalary());
		System.out.println("GHS has spent for salary to " + lizzy.getName() + ", $ " + lizzy.getSalary() + ".");
		System.out.println("GHS has earned $ " + ghs.getTotalMoneyEarned());
		
		vanderhorn.receiveSalary(vanderhorn.getSalary());
		System.out.println("GHS has spent for salary to " + vanderhorn.getName() + ", $ " + vanderhorn.getSalary() + ".");
		System.out.println("GHS has earned $ " + ghs.getTotalMoneyEarned());
		
		System.out.println(rakshith);
		System.out.println(vanderhorn);
	}

}
