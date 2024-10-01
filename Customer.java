package module6;

public class Customer {

	private int custId;
	private String name;
	private int mobile;
	private String Address;
	
		 //def cont
	public  Customer() {
		custId=0;
		name=null;
		mobile=0;
		Address=null;
	}
	
    //parameterized constructor                                     
	public Customer(int custId, String name, int mobile, String address) {
		super();
		this.custId = custId;
		this.name = name;
		this.mobile = mobile;
		Address = address;
		
		
	}



	public int getCustId() {
		return custId;
	}



	public void setCustId(int custId) {
		this.custId = custId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getMobile() {
		return mobile;
	}



	public void setMobile(int mobile) {
		this.mobile = mobile;
	}



	public String getAddress() {
		return Address;
	}



	public void setAddress(String address) {
		Address = address;
	}

	public String toString() {
		return"custId is "+ custId +"and name is "+ name +"and mobile is "+ mobile + "and address is " +Address;
	}
	}	
		
	
	

	

	
	


