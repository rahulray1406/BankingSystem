import java.util.Scanner;
public class BankingSystem {
    static String name;
    private static int pin=1406;
    static  double  bal;
    static long Acc_no;
    static boolean run=true;
	public static void main(String[] args) {
		System.out.println("********Enter Your Choice******");
		System.out.println("--------------------");
		System.out.println("Enter 1 for Creating Account");
		System.out.println("Enter 2 for view profile");
		System.out.println("Enter 3 for Deposite balance");
		System.out.println("Enter 4 for Withdraw balance");
		System.out.println("Enter 5 for Current balance");
		System.out.println("Enter 6 to --EXIT--");
		
		while(run)
		{
	 System.out.println("********Enter Your Choice******");		
	 Scanner s =new Scanner(System.in);
	 int num=s.nextInt();
	switch(num)
	{
	case 1: creatAccount();
break;
	case 2: viewProfile();
	break;
	case 3: deBal();
	break;
	case 4: wiBal();
	break;
	case 5: curBal();
	break;
	case 6:
		run=false;
		break;
	default: System.out.println("You Entered Wrong choise");
	}
		}

	}

public static void creatAccount()
{
	Scanner S1=new Scanner(System.in);
	System.out.println("Enter Account holder's name");
	BankingSystem.name=S1.nextLine();
	System.out.println("Create your PIN");
	BankingSystem.pin=S1.nextInt();
	System.out.println("Enter your Account Number");
	BankingSystem.Acc_no=S1.nextLong();
	System.out.println("Account Created Sucessfully");
	System.out.println("---WelCome To Our Bank---");
}
public static void viewProfile()
{
	System.out.println("Enter your PIN to View Profile");
	Scanner S2=new Scanner(System.in);
	int temp=S2.nextInt();
	if(BankingSystem.pin==temp)
	{
		System.out.println("Name is :"+BankingSystem.name);
		System.out.println("Account number is :"+BankingSystem.Acc_no);
		System.out.println("Your balance is :"+BankingSystem.bal);
	}
	else
	{
		System.out.println("PIN miss matched");
		run=false;
		
	}
}
public static void deBal()
{  Scanner S3=new Scanner(System.in);
	float temp2;
	int temp;
	System.out.println("Enter Amount to deposite");
	temp2=S3.nextFloat();
	System.out.println("Enter your PIN to Deposite ");
    temp=S3.nextInt();
    if(BankingSystem.pin==temp)
	{BankingSystem.bal+=temp2;
	System.out.println("Your current balance is "+BankingSystem.bal);
}
    else
    {
    	System.out.println("Incorrect PIN");
    	run=false;
		
    }
}
public static void wiBal()
{   Scanner S4=new Scanner(System.in);
System.out.println("Enter Amount to Withdraw");
float temp3=S4.nextFloat();
System.out.println("enter your PIN");
int temp=S4.nextInt();
if(BankingSystem.pin==temp)
{
	if(BankingSystem.bal==0.0)
	{
		System.out.println("Insufficient Balance");
	}
	else
	{
		BankingSystem.bal-=temp3;
		System.out.println("your Current balance is "+BankingSystem.bal);
	}
}
else 
{
	System.out.println("Incorrect PIN");
	run=false;
	
}
}
public static void curBal()
{
	Scanner S5=new Scanner(System.in);
	System.out.println("Enter your PIN to check current balance");
	int temp = S5.nextInt();
	if(BankingSystem.pin==temp)
	{
		System.out.println("YOUR currnt baLANCE is "+BankingSystem.bal);
	}
	else
	{
		System.out.println("Incorrect PIN");
		run=false;
		
	}
}
}
