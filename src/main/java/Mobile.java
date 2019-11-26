
public class Mobile {
public boolean makeCall(long number)
{
System.out.println("Make a call");
return true;
}
public String sendSMS(String SMS)
{
System.out.println("Send SMS");
return "Message ME";
}
public void shutDown()
{
System.out.println("Shut Down your Mobile");
}
public static void main(String[] args) {
	Mobile samsung=new Mobile();
	boolean call=samsung.makeCall(80236373);
System.out.println(call);
String sms=samsung.sendSMS("successful");
System.out.println(sms);
samsung.shutDown();
System.out.println("shut");
}

}