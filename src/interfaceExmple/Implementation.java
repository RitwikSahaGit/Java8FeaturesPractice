package interfaceExmple;

public class Implementation implements Interface, InterfaceTwo {

	public static void main(String[] args) {
		//Static methods needs to be called by name of the interface
		Interface obj= new Implementation();
		Interface.staticMethod();
		//default and abstract method can be called by the implementation class
		obj.defaultMethod();
		obj.show();
	}

	@Override
	public void show() {
		System.out.println("Abstact method defined in Implementation class");
		
	}
	
	@Override
	public void defaultMethod() {
		Interface.super.defaultMethod();
		//If one Implementation class Implements 2 Interfaces.
		//if 2 interfaces have Same default method with the same signature.
		//then we have to mention which default method we want to call.
		//to overcome the ambiguity
		//https://www.youtube.com/watch?v=b4paTLGsJjE&list=PLA3GkZPtsafZR6arC1A3N0i968gk9RvMv&index=6
	}
}
