import java.util.Scanner;

class Contact{
	Scanner s = new Scanner(System.in);
	private int contact_id;
	private String name;
	private int phone_number;
    private String email;
	private String address;

	Contact(int contact_id,String name,int phone_number,String email,String address){
		this.contact_id = contact_id;
		this.name = name;
		this.phone_number = phone_number;
		this.email = email;
		this.address = address;
	}

	void display_contact() {
		System.out.println("----Contact Details ----");
		System.out.println("Name: "+name);
		System.out.println("Contact Id: " +contact_id);
		System.out.println("Phone number: "+phone_number);
    	System.out.println("Email address is: "+email);
		System.out.print("Address of the contact: "+address);

	}

	void update_phone_number() {
		System.out.print("Enter the New Phone Number: ");
		int new_number = s.nextInt();
		System.out.println("The New Phone Number: "+new_number);
	}

	void update_email(String email) {
		this.email = email;
		System.out.println("Enter the new email: ");
		email = s.nextLine();
		System.out.println("The new email address: "+email);

	}

}
public class ContactBook{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Name: ");
		String name = s.nextLine();
		System.out.print("Enter Contact Id: ");
		int id = s.nextInt();
		System.out.print("Enter Phone Number: ");
		int number = s.nextInt();
		s.nextLine();
		System.out.print("Enter Email address: ");
		String email = s.nextLine();
		System.out.print("Enter Address: ");
		String address = s.nextLine();

		Contact c = new Contact(id, name, number, email, address);
		
		int choice;
		do {
			System.out.println("\n----Contact Management Menu----");
			System.out.println("1. Display Contact info");
			System.out.println("2. Update Phone Number");
			System.out.println("3. Update Email Address");
			System.out.println("4. Exit");
			System.out.print("Enter your Choice: ");
			choice = s.nextInt();
			s.nextLine();	

		switch (choice) {
	    	case 1:
				c.display_contact();
				break;
			case 2: 
				c.update_phone_number();
				break;
			case 3: 
				c.update_email(email);
				break;
			case 4:
				System.out.println("Exiting.... Goodbye!");
				break;
			default:
				System.out.println("Invalid choice! Please Try Again.");
				break;
				
		}
		}while (true);

	}

}

