import java.util.*;

class User {
	int id;
	String name;
	int salary;

	User(int userId, String userName) { 
		id = userId;
     		name = userName;
	}
	User(int userId, String userName, int userSalary) { 
         		this(userId, userName);
		salary = userSalary;
     	}   
	 
	 public static void main(String[] args) {
		User instructor1 = new User(1002, "Dheeru");
		User instructor2 = new User(1002, "Dheeru", 50000);
		System.out.println(instructor1.id + " , " + instructor1.name );
		System.out.println(instructor2.id + " , " + instructor2.name  + " , " + instructor2.salary);
	 }
}