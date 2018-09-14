import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int one = sc.nextInt();
	    int two = sc.nextInt();
	    int five = sc.nextInt();
	    int ten = sc.nextInt();
	    
	    int x = sc.nextInt();
	    
	    int total = (one*1)+(two*2)+(five*5)+(ten*10);
	    
	    if(x==total)
	        System.out.println("Paid");
	    else if(x<=total)
	        System.out.println("Paid "+(total-x));
	    else
	        System.out.println("Not Paid "+(total));

	}
}
