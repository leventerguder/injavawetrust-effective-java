package chapter02.item01;

import java.util.EnumSet;

public class Test01EnumSet {

	public static void main(String[] args) {
		EnumSet<EmployeeType> enumSet = EnumSet.allOf(EmployeeType.class);
		System.out.println(enumSet);

		System.out.println(enumSet.getClass()); // class java.util.RegularEnumSet
	}
}

enum EmployeeType {
	PART_TIME, FULL_TIME, PROJECT_BASED, INTERN, CONSULTANT
}
