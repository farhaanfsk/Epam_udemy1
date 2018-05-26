import java.util.Scanner;


public class BoilFrez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Enter the temperature:");
        Scanner sc=new Scanner(System.in);
        int temp=sc.nextInt();
        if(temp>=100) System.out.println("The water is boiling");
        else if(temp<=0) System.out.println("The water is freezing");
        else if(temp<100 && temp>0) System.out.println("The water is in normal state");
        sc.close();
	}

}
