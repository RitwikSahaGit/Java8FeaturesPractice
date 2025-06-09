package interfaceExmple;

public interface Interface {
	
	

	static void staticMethod() {
		System.out.println("In Static methos of the Interface" );
	}
	
	public void show();
	
	default void defaultMethod() {
		System.out.println("In default Method of the Interface");
	}
}
