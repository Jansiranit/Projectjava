package ExceptionHandling;

public class ExceptionHandling {
	public static void main(String[] args) {
		
		String username =null;
		String password="123@jansi";
		System.out.println("1. Database connection opened.");
		try {
			
			
			if (username==null) {
				throw new Exception("Username is missing");
				
			}
			if (username.equals("admin") && password.equals("123@jansi")) {
                System.out.println("Result: Login success.");
            } else {
                System.out.println("Result: Login failed.");
            }
		} catch (Exception e) {
			System.out.println(e);
				}finally {
					System.out.println("2.Connection closed successfully");
				}
		
	}

}
