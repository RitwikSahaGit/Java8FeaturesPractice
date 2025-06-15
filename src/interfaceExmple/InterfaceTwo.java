package interfaceExmple;


public interface InterfaceTwo {
	
	default void defaultMethod() {
		System.out.println("In default Method of the InterfaceTwo");
	}

}
