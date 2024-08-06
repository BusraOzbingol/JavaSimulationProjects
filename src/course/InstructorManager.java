package course;

public class InstructorManager extends UserManager {
	
	
	public void addNewCourse(Instructor instructor) {
		System.out.println("Yeni kurs eklendi");
		
	}

	@Override
	public void sendEmail(User user) {
		System.out.println("Eğitmen bilgilendirme maili yollandı");
	}
	
	
	
	
	


}
