public class Student {
	String name;

	public Student(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Student s1 = new Student("John");
		System.out.println(s1.name);
		Student s2 = new Student("Raj");
		System.out.println(s2.name);
		Student s3 = s2;
		System.out.println(s3.name);
		System.out.println(s2.name);
		s2 = new Student("Anita");
		System.out.println(s2.name);
		s2 = s1;
		System.out.println(s2.name);
		System.out.println(s1.name);
	}
}
