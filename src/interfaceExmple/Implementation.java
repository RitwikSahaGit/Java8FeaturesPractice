package interfaceExmple;

public class Implementation implements Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interface obj= new Implementation();
		Interface.staticMethod();
		
		
		
		obj.defaultMethod();
		obj.show();

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Abstact method defined in Implementation class");
		
	}
	
	public void defaultMethod() {
		System.out.println("Ovverridden in Implementation class");
	}

}
