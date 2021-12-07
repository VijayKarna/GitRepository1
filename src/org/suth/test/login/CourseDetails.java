package org.suth.test.login;

public class CourseDetails {
	// Methods
	private void javaCourse() {
		// Logic
		System.out.println("Java course started");
	}

	private void oracleCourse() {
		System.out.println("Oracale Course not started");
	}

	// Execution starts
	public static void main(String[] args) {
		// ClassName ObjectName = new className();
		CourseDetails cd = new CourseDetails();
		// Method calling -->objectName.methodName();
		cd.javaCourse();
		cd.oracleCourse();
	}
}
