package Nivetha;
import java.util.*;
public class Looping {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
		System.out.println("Even Numbers from 2 to 50");
		
		for (int i = 2; i <= 50; i += 2) {
            System.out.println(i);
        }
		System.out.println("Counting the Positive Numbers");
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;

        for (; num > 0; num = num / 10) {
            count++;
        }

        System.out.println("Number of digits: " + count);

	}

}
