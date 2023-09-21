public class LinkedListADT implements Comparable {
	public Contact head;
	public Contact current;
	public LinkedListADT() {
		
		this.head = null;
		this.current = null;
	}
	@Override
	public void insert(String contactName, String phoneNumber, String email, String address, String birthday, String notes) {
		Contact tmp1=head;
		Contact tmp;
	  if(head==null)
		  current=head=new Contact(contactName, phoneNumber, email, address, birthday, notes);
	  else {
		  while(tmp1!=null) {
			  if(tmp1.contactName.equals(contactName)||tmp1.phoneNumber.equals(phoneNumber))
				  return;
			  tmp1=tmp1.next;
		  }
		  tmp=current.next;
		  current.next=new Contact(contactName, phoneNumber, email, address, birthday, notes);
		  current=current.next;
		  current.next=tmp;
		  
	  }
	  System.out.println("Contact added successfully!");
		
	}
	@Override
	public void remove( String name) {
		Contact tmp=head;
			while(tmp!=null) {
				
				
				if(tmp.contactName.equals(name)) {
					if(tmp==head) {
						head=head.next;
					}else {
						Contact tmp1=head;
						while(tmp1.next!=tmp)
							tmp1=tmp1.next;
					tmp1.next=tmp.next;
					}
					if(current.next==null)
						current=head;
					if(tmp==current)
					current=current.next;
					break;
				}
	
				tmp=tmp.next;
					
			}
			
		
		
	}
	public void SearchByName(String val) {
		Contact tmp=head;
		while(tmp!=null) {
			if(tmp.contactName.equalsIgnoreCase(val)) {
			System.out.println("Name: "+tmp.contactName);
			System.out.println("PhoneNumber: "+tmp.phoneNumber);
			System.out.println("Email: "+tmp.email);
			System.out.println("Adress: "+tmp.address);
			System.out.println("Birthday: "+tmp.birthday);
			System.out.println("Notes: "+tmp.notes);
			}
			tmp=tmp.next;
		}
	}
		public void SearchByPhoneNumber(String val) {
			Contact tmp=head;
			while(tmp!=null) {
				if(tmp.phoneNumber.equals(val)) {
				System.out.println("Name: "+tmp.contactName);
				System.out.println("Phone: "+tmp.phoneNumber);
				System.out.println("Email: "+tmp.email);
				System.out.println("Adress: "+tmp.address);
				System.out.println("Birthday: "+tmp.birthday);
				System.out.println("Notes: "+tmp.notes);
				}
				tmp=tmp.next;
			}}
			public void SearchByEmailAdress(String val) {
				Contact tmp=head;
				while(tmp!=null) {
					if(tmp.email.equals(val)) {
					System.out.println("Name: "+tmp.contactName);
					System.out.println("Phone: "+tmp.phoneNumber);
					System.out.println("Email: "+tmp.email);
					System.out.println("Adress: "+tmp.address);
					System.out.println("Birthday: "+tmp.birthday);
					System.out.println("Notes: "+tmp.notes);
					}
					tmp=tmp.next;
				}}
			public void SearchByAdress(String val) {
				Contact tmp=head;
				while(tmp!=null) {
					if(tmp.address.equals(val)) {
					System.out.println("Name: "+tmp.contactName);
					System.out.println("Phone: "+tmp.phoneNumber);
					System.out.println("Email: "+tmp.email);
					System.out.println("Adress: "+tmp.address);
					System.out.println("Birthday: "+tmp.birthday);
					System.out.println("Notes: "+tmp.notes);
					}
					tmp=tmp.next;
				}}
public void SearchByBirthday(String val) {
	Contact tmp=head;
	while(tmp!=null) {
		if(tmp.birthday.equals(val)) {
		System.out.println("Name: "+tmp.contactName);
		System.out.println("Phone: "+tmp.phoneNumber);
		System.out.println("Email: "+tmp.email);
		System.out.println("Adress: "+tmp.address);
		System.out.println("Birthday: "+tmp.birthday);
		System.out.println("Notes: "+tmp.notes);
		}
		tmp=tmp.next;
	}}

	

}
