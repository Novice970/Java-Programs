import java.util.Scanner;
public class letter
    {
    public static void main(String[] args)
        {
        String name,adress,yourname;
	int phone;
        Scanner inputstring=new Scanner(System.in);
        System.out.println("enter the name of person ti invite");
        name=inputstring.nextLine();
        System.out.println("enter the address:");
        adress=inputstring.nextLine();
	System.out.println("Enter the phone number :");
	phone=inputstring.nextInt();
        System.out.println("enter the senders name");
        yourname=inputstring.nextLine();
        System.out.println();
        System.out.println();
        System.out.print(" To,\n"+adress+"\ndear "+name );
        System.out.print("\n you are coordially invited to our home to attend the birthday party of my son.\n Sincerely,\n"+yourname+"\n\n You can contact us at : "+phone);
        
        
        
    }
}