class StudentTest {
    
	public static void main(String[] args) {
	    int[] studentIds = new int[] {1001, 1002, 1003};
		
		Student student1 = new Student(studentIds[0], "joan","male");
		Student student2 = new Student(studentIds[1], "raj","male");
		Student student3 = new Student(studentIds[2], "anita","female");
		System.out.println("ID of student1: " + student1.getId() + "| Name of student1: " + student1.getName() +"| Gender of student1: " + student1.getGender());
		System.out.println("ID of student2: " + student2.getId() + "| Name of student2: " + student2.getName() +"| Gender of student2: " + student2.getGender());
		System.out.println("ID of student3: " + student3.getId() + "| Name of student3: " + student3.getName() +"| Gender of student3: " + student3.getGender());
		
		student1.setName("john");
		System.out.println("Updated name of student1: " + student1.getName());
		
		if(student1 == student2)
			System.out.println("Student1 and student2 are referencing same object.");
		
		if(student1 != student2)
			System.out.println("Student1 and student2 are referencing different object.");

		Student student5=null;
		student5 = student1;		

		if(student5!=null && (student5==student2) || (student5==student1))
			System.out.println("Name of student5: " + student5.getName());  

		Student student4 = student1;
		System.out.println("ID of student4: " + student4.getId() + "| Name of student4: " + student4.getName() +"| Gender of student4: " + student4.getGender());
		
		student4.setName("mike");
		System.out.println("Name of student4: " + student4.getName());
		
		student4 = student2;
		System.out.println("Name of student4: " + student4.getName());
		
		student2 = student1;
		System.out.println("Name of student4: " + student4.getName());
		System.out.println("Name of student2: " + student2.getName());
		
		student4 = new Student(54321,"Alex","male");
		System.out.println("Name of student4: " + student4.getName());
		System.out.println("Name of student2: " + student2.getName());
		System.out.println("Name of student1: " + student1.getName());
		
	}
}
