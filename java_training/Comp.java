package java_training;

import java.util.Comparator;
import java.util.Scanner;

import java_training.Comparators.AccountAsc;
import java_training.Comparators.AccountDesc;;


public class Comp {

	public static Comparator<Account> getComparator(int choice){
		//System.out.println("1.Ascending 2.Descending");
		//Scanner scanner=new Scanner(System.in);
		//int choice = scanner.nextInt();
		if(choice==1) {
		return new AccountAsc();
		}
		else {
			return new AccountDesc();
			
		}
	}
}
