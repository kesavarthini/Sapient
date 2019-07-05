package java_training;

import java.util.Comparator;

public class Comparators{
	

public static class AccountAsc implements Comparator <Account>{
	@Override
	public int compare(Account e1,Account e2) {
		return Long.valueOf(e1.getAccountId()).compareTo(e2.getAccountId());
	}
}


public static class AccountDesc implements Comparator <Account>{
	@Override
	public  int compare(Account e1,Account e2) {
		return  Long.valueOf(e2.getAccountId()).compareTo(e1.getAccountId());
	}
}


}