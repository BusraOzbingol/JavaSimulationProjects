package course;

public class UserManager {
	
	public void add(User user) {
		System.out.println("kullanıcı kaydedildi");
	}
	public void sendEmail(User user) {
		System.out.println("Email gönderildi");
	}	
	
	
	public void addMultiple(User[] users) {
		for(User user:users) {
			add(user);
		}
	
		
	
		

	}

}
