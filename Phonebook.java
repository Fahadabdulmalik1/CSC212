import java.util.Scanner;
//#####  Remeaining is opertions from 3 to 8 in menue plus Class(event).
//#####  Exception still not complete 
public class Phonebook {
	public Phonebook() {
		
	}
public void UI() {
Scanner input=new Scanner(System.in);
		
		int ch=0;
		
		LinkedListADT l1=new LinkedListADT();
		System.out.println("Welcome to the Linked Tree Phonebook! ");
		System.out.println();
		try {
		while(ch!=8) {
		System.out.println("Please choose an option: ");
		System.out.println("1. Add a contact ");
		System.out.println("2. Search for a contact ");
		System.out.println("3. Delete a contact ");
		System.out.println("4. Schedule an event ");
		System.out.println("5. Print event details ");
		System.out.println("6. Print contacts by first name ");	
		System.out.println("7. Print all events alphabetically ");
		System.out.println("8. Exit");
		System.out.print("Enter your choice: ");
		ch=input.nextInt();	
		if(ch==1) {
			System.out.print("Enter the contact's name: ");
			String s1=input.next();
			System.out.print("Enter the contact's phone number:");
			String s2=input.next();
			System.out.print("Enter the contact's email address:");
			String s3=input.next();
			System.out.print("Enter the contact's address:");
			String s4=input.next();
			System.out.print("Enter the contact's birthday:");
			String s5=input.next();
			System.out.print("Enter any notes for the contact: ");
			String s6=input.next();
			l1.insert(s1, s2, s3, s4, s5, s6);
			System.out.println();
		}
		else if(ch==2) {
			try {
			System.out.println("Enter search criteria:");
			int v=0;
			System.out.println("1. Name ");
			System.out.println("2. Phone Number");
			System.out.println("3. Email Address ");
			System.out.println("4. Address ");
			System.out.println("5. Birthday ");
			System.out.print("Enter your choice: ");
			v=input.nextInt();
			if(v==1) {
				System.out.print("Enter the contact's name:");
				String name=input.next();
				l1.SearchByName(name);
			}
			else if(v==2) {
				System.out.print("Enter the contact's PhoneNumber:");
				String pnumber=input.next();
				l1.SearchByPhoneNumber(pnumber);
			}
			else if(v==3) {
				System.out.print("Enter the contact's EmailAdress");
				String email=input.next();
				l1.SearchByEmailAdress(email);
			}
			else if(v==4) {
				System.out.print("Enter the contact's Adress");
				String adress=input.next();
				l1.SearchByAdress(adress);
			}
			else if(v==5) {
				System.out.print("Enter the contact's Birthday");
				String dob=input.next();
				l1.SearchByBirthday(dob);
			}
			}catch(Exception e) {System.out.println("Invalid input! Choose a number between 1 and 5");}
		}
			else if(ch==3) {
			System.out.println("Enter the contact's name: ");
			l1.remove(input.next());
			
		}
		
		}
		}catch(Exception e){System.out.println("Invalid input! Enter a number between 1 and 8");}
	}

}
