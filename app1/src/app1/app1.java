package app1;

import java.util.Scanner;
 
public class app1 {
    public static void main(String[] args) {
    	
        Scanner scan = new Scanner(System.in);
        
        int number = scan.nextInt();
        // int number = Integer.parseInt(scan.nextLine());
 
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < number; i++){
            int currentNumber = scan.nextInt();
            sum += currentNumber;
            if(currentNumber > max)
                max = currentNumber;
        }
 
        //System.out.println("Max " + max);
        //System.out.println("Sum " + sum);
 
        int diff = sum - max;
 
        if(diff == max)
            System.out.println("Yes"
            		+ "\nSum = " + max);
        else
            System.out.println("No"
            		+ "\nDiff = " + Math.abs(diff - max));
        
        scan.close();
    }
}
