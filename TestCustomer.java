package module6;

public class TestCustomer {

	public static void main(String[] args) {
	
		Customer customer = new Customer();
		System.out.println(customer);
//		System.out.println("custId is "+customer.getCustId());
//		System.out.println("name is "+ customer.getName());
//		System.err.println("mobile is "+customer.getMobile());
//		System.out.println("address is "+customer.getAddress());
//		
		System.out.println("=======================");
		
		System.out.println("creating 2nd object");
		Customer customer1 = new Customer(2,"pratima",2344,"nashik");
//		System.out.println("Displaying the details");
//		System.out.println("custId is "+customer1.getCustId());
//		System.out.println("name is "+ customer1.getName());
//		System.err.println("mobile is "+customer1.getMobile());
//		System.out.println("address is "+customer1.getAddress());
		System.out.println(customer1); //   call toString method                        
}
}