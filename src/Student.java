class Student{
	int id;
	String name;
	String gender;

	boolean updateProfile(String newName){
		name=newName;
		return true;
	}
}
class Main{
	public static void main(String args[]){
		Student s=new Student();
		s.id=100;
		s.name="Abhi";
		s.gender="Male";
		System.out.println("Newly created student has \n ID : " + s.id + "\n Name : "+s.name+"\n Gender : " + s.gender); 
		s.updateProfile("Abhishek");
		System.out.println("After updation student has \n ID : " + s.id + "\n Name : "+s.name+"\n Gender : " + s.gender); 
	}
}