package module6;

public class TestAccount {

	public static void main(String[] args) { 
		Account account = new Account();
		System.out.println(account);
		account.setAccNo(1);
		account.setAccName("pratima");
		account.setAccBalance(788987);
		System.out.println(account);
	
		System.out.println("===============");
		System.out.println("creating 2nd obj");
		Account account2 = new Account(1,"pratima",8000);
		System.out.println(account2);
	}

}
