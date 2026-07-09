package ExceptionHandling1;

public class NewConnection extends ElectricityConnection {

	@Override void applyConnection() throws Exception{

	boolean aadhar = false;
	boolean addressproof = true;
	boolean passsizephoto = true;
	
	if(!(aadhar&&addressproof&&passsizephoto))
	{
		throw new Exception("Required Documents Are Missing");

	}else
	{
		System.out.println("Documents Verified Successfully");
		System.out.println("Electricity Connection Approved");
	}
}
	public static void main(String[] args) {
		NewConnection nc = new NewConnection() ;
		//nc.applyConnection();
		try {
			nc.applyConnection();
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Application process completed");
		}
	}
}

