package dasd;

public class Event {
public Event head;
public Event current;	
public String eventtitle;
public String datetime;
public String location;
public String Contact;
public Event next;
public Event(String title, String dateTime, String location, String contact) {
    this.eventtitle = title;
    this.datetime = dateTime;
    this.location = location;
    this.Contact = contact;
    next=null;
}
public void insert(String title, String dateTime, String location, String contact) {
	Event tmp1=head;
	Event tmp;
  if(head==null)
	  current=head=new Event(title, dateTime, location, contact);
  else {
	  while(tmp1!=null) {
		  if(tmp1.Contact.equals(contact))
			  return;
		  tmp1=tmp1.next;
	  }
	  tmp=current.next;
	  current.next=new Event(title, dateTime, location, contact);
	  current=current.next;
	  current.next=tmp;
	  
  }
}

public void display() {
	System.out.println(eventtitle);
	System.out.println(datetime);
	System.out.println(location);
	System.out.println(Contact);
}
public Event() {
	super();

}

}
