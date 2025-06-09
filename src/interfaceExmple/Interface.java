package interfaceExmple;

//This annotation ensures that This is the "Functional Interface"
@FunctionalInterface
public interface Interface {
	
	
	//In functionalInterface any number of Static and Default method 
	static void staticMethod() {
		System.out.println("In Static methos of the Interface" );
	}
	//Only one Abstract method. SAM = Single Abstract Method
	public void show();
	
	default void defaultMethod() {
		System.out.println("In default Method of the Interface");
	}
}
