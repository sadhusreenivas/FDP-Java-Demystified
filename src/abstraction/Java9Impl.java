package abstraction;

public class Java9Impl implements Java9 {

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		System.out.println("Its abstract and implemented here");
	}
	
	public static void main(String[] args) {
		
		Java9Impl obj = new Java9Impl();
		obj.fun();
		obj.test(); // pvtMethod
		Java9.stMethod();
		System.out.println(Java9.msg);
		
	}

}
