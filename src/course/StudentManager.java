package course;

public class StudentManager extends UserManager{
	
	public void addCourse(Student student) {
		System.out.println("Kursa kaydoldunuz");
		
	}

	@Override
	public void sendEmail(User user) {
		System.out.println("Öğrenci bilgilendirme maili yollandı.");
	}
	
	

}
