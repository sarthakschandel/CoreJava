
public class ThrowKeyword {

	public static void main(String[] args) {
		
		try{
		throw new Exception("Funds not available");
		}
		catch(Exception e){
			System.out.println("This is the catch block");
		}finally {
			System.out.println("This is finally block");
		}

	}

}
