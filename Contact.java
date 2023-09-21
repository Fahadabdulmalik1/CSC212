
public class Contact {
	public String contactName;
	public String phoneNumber;
	public String email;
	public String address;
	public String birthday;
	public String notes;
	public Contact next;
	public Contact(String contactName, String phoneNumber, String email, String address, String birthday, String notes) {
		this.contactName = contactName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.birthday = birthday;
		this.notes = notes;
		next=null;
	}
	

}
