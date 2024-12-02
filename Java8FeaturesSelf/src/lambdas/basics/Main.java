package lambdas.basics;

interface MyInterface {
    void display();
}

class MyClass implements MyInterface {
    public void display() {
        System.out.println("Hello from MyClass");
    }
}

public class Main {
    public static void main(String[] args) {
        MyInterface obj = new MyClass();  // Creating object with interface reference
        obj.display();  // Output: Hello from MyClass
    }
}
