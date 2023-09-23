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
			  if(tmp1.getContactName().equals(contactName)||tmp1.getPhoneNumber().equals(phoneNumber))
				  return;
			  tmp1=tmp1.getNext();
		  }
		  tmp=current.getNext();
		  current.setNext(new Contact(contactName, phoneNumber, email, address, birthday, notes));
		  current=current.getNext();
		  current.setNext(tmp);
		  
	  }
	  System.out.println("Contact added successfully!");
		
	}
	@Override
	public void remove( String name) {
		Contact tmp=head;
			while(tmp!=null) {
				
				
				if(tmp.getContactName().equals(name)) {
					if(tmp==head) {
						head=head.getNext();
					}else {
						Contact tmp1=head;
						while(tmp1.getNext()!=tmp)
							tmp1=tmp1.getNext();
					tmp1.setNext(tmp.getNext());
					}
					if(current.getNext()==null)
						current=head;
					if(tmp==current)
					current=current.getNext();
					break;
				}
	
				tmp=tmp.getNext();
					
			}
			
		
		
	}
	public void SearchByName(String val) {
		Contact tmp=head;
		while(tmp!=null) {
			if(tmp.getContactName().equalsIgnoreCase(val)) {
				System.out.println("Name: "+tmp.getContactName());
				System.out.println("Phone: "+tmp.getPhoneNumber());
				System.out.println("Email: "+tmp.getEmail());
				System.out.println("Adress: "+tmp.getAddress());
				System.out.println("Birthday: "+tmp.getBirthday());
				System.out.println("Notes: "+tmp.getNotes());
			}
			tmp=tmp.getNext();
		}
	}
		public void SearchByPhoneNumber(String val) {
			Contact tmp=head;
			while(tmp!=null) {
				if(tmp.getPhoneNumber().equals(val)) {
				System.out.println("Name: "+tmp.getContactName());
				System.out.println("Phone: "+tmp.getPhoneNumber());
				System.out.println("Email: "+tmp.getEmail());
				System.out.println("Adress: "+tmp.getAddress());
				System.out.println("Birthday: "+tmp.getBirthday());
				System.out.println("Notes: "+tmp.getNotes());
				}
				tmp=tmp.getNext();
			}}
			public void SearchByEmailAdress(String val) {
				Contact tmp=head;
				while(tmp!=null) {
					if(tmp.getEmail().equals(val)) {
					System.out.println("Name: "+tmp.getContactName());
					System.out.println("Phone: "+tmp.getPhoneNumber());
					System.out.println("Email: "+tmp.getEmail());
					System.out.println("Adress: "+tmp.getAddress());
					System.out.println("Birthday: "+tmp.getBirthday());
					System.out.println("Notes: "+tmp.getNotes());
					}
					tmp=tmp.getNext();
				}}
			public void SearchByAdress(String val) {
				Contact tmp=head;
				while(tmp!=null) {
					if(tmp.getAddress().equals(val)) {
					System.out.println("Name: "+tmp.getContactName());
					System.out.println("Phone: "+tmp.getPhoneNumber());
					System.out.println("Email: "+tmp.getEmail());
					System.out.println("Adress: "+tmp.getAddress());
					System.out.println("Birthday: "+tmp.getBirthday());
					System.out.println("Notes: "+tmp.getNotes());
					}
					tmp=tmp.getNext();
				}}
			public void SearchByBirthday(String val) {
				Contact tmp=head;
				while(tmp!=null) {
			if(tmp.getBirthday().equals(val)) {
			System.out.println("Name: "+tmp.getContactName());
			System.out.println("Phone: "+tmp.getPhoneNumber());
			System.out.println("Email: "+tmp.getEmail());
			System.out.println("Adress: "+tmp.getAddress());
			System.out.println("Birthday: "+tmp.getBirthday());
			System.out.println("Notes: "+tmp.getNotes());
			}
			tmp=tmp.getNext();
	}}

	

	

}
