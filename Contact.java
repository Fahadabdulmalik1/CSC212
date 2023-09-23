
public class Contact {
	private String contactName;
	private String phoneNumber;
	private String email;
	private String address;
	private String birthday;
	private String notes;
	private Contact next;
	public Contact(String contactName, String phoneNumber, String email, String address, String birthday, String notes) {
		this.contactName = contactName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.birthday = birthday;
		this.notes = notes;
		next=null;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public Contact getNext() {
		return next;
	}
	public void setNext(Contact next) {
		this.next = next;
	}
	


}
