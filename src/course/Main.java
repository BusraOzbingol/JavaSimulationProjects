package course;

public class Main {

	public static void main(String[] args) {
		
	Student student1= new Student();
	student1.setUserId(1);
	
	Instructor instructor1= new Instructor();
	instructor1.setUserId(2);
	
	UserManager userManager= new UserManager();
	User[] users={student1,instructor1};
	userManager.addMultiple(users);
	
		
		

	}

}
