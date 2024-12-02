package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("C:/Users/sarth/Documents/Emp.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Object obj = ois.readObject();
		Employee emp = (Employee) obj;

		System.out.println("Employee Id: " + emp.id);
		System.out.println("Employee Name: " + emp.name);
		System.out.println("Employee Salary: " + emp.salary);
		System.out.println("Employee SSN: " + emp.ssn);//not available because of transient keyword, hence default value used 

	}

}
