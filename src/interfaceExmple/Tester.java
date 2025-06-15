package interfaceExmple;

public class Tester {

	public static void main(String[] args) {
		
			//Static methods needs to be called by name of the interface
//			Interface obj= new Implementation();
//			Interface.staticMethod();
//			//default and abstract method can be called by the implementation class
//			obj.defaultMethod();
//			obj.show();
		
		Interface i = ()->System.out.println("Inside the Snow of Interface");	
		i.show();

	}

}
