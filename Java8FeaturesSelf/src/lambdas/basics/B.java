package lambdas.basics;

@FunctionalInterface
public interface B extends A {
	//for B to be FI, B must not have any new methods defined
	void myMethod();//this one is allowed as its the one inherited from A
}
