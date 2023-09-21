
public interface Comparable{
	public void insert(String contactName, String phoneNumber, String email, String address, String birthday, String notes);
	public void remove(String k);
	public void SearchByName(String val);
	public void SearchByPhoneNumber(String val);
	public void SearchByEmailAdress(String val);
	public void SearchByAdress(String val);
	public void SearchByBirthday(String val);
}
