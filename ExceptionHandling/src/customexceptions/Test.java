package customexceptions;

public class Test {

	public static void main(String[] args)  {
		
		throw new UncheckedCustomException("Business Exception occured");
		//psvm mein no dikkat as this is runtime exception :)
		
		//throw new CheckedCustomException("Business Exception that needs to be handled");
		//psvm mein throws CheckedCustomException
	}

}
