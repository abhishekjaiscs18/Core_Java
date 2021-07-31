class Student {
    // variable declarations
    private int id; 
    private String name; 
    private String gender = "male";
   
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}		
	// Constructors
	Student(int id, String name, String gender) {
	    this.name = name;
	    this.id = id;
	    this.gender=gender;
	}
	
    // method definitions
    boolean updateProfile(String name) {
       this.name = name;
       return true;
    }
}
