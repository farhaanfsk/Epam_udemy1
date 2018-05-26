import java.util.Scanner;


public class Boiling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the temperature:");
        Scanner sc=new Scanner(System.in);
        int temp=sc.nextInt();
        if(temp>=100) System.out.println("The water is boiling");
        else System.out.println("The water is not boiling");
        sc.close();
	}

}
