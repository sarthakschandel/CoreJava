public class MyGenericClass<T> {

	T obj;

	MyGenericClass(T obj) {
		this.obj = obj;
	}//generic constructor 

	public void displayObjectDetails() {
		System.out.println("The type of object: " + obj.getClass().getName());
	}//displays the type of object used 

	public T getObject() {
		return obj;
	}//used to get the object passed by the Test class

}
