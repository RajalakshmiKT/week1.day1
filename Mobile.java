package week1.day1;

public class Mobile {
String name = "Rajalakshmi";

void sendMsg() {	
	System.out.println("Hai "+name);
}
private long makeCall()
{
long num = 198645564L;
return num;
}
void saveContact()
{
	
	System.out.println("Contact Name : "+name);
	
}
public static void main(String[] args) {
	Mobile m = new Mobile();
	m.makeCall();
	long phNo = m.makeCall();
	System.out.println("Calling "+phNo);
	System.out.println("Mobile No: "+phNo);
	m.saveContact();
	System.out.println("Contact saved");
	m.sendMsg();
}
}
