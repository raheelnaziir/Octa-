package emailapp;

public class Main {
	public static void main(String[] args) {
		
		Email email1 = new Email("James", "Anderson");
		System.out.println(email1.showInfo());	
		
		Email email2 = new Email("Raheel", "Nazir");
		System.out.println(email2.showInfo());
		
		//email1.changePassword("thygf");
		//System.out.println(email1.getPassword());
	}
}
