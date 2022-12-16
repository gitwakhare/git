package interface1;


public class implement implements interface2 {

	public static void main(String[] args) {
		implement im=new implement();
		im.m1();
		im.m2();
		im.m3();
	}

	@Override
	public void m1() {
System.out.println("abc");	
	}

	@Override
	public void m2() {
System.out.println(" abc1");		
	}
public void m3 () {
	System.out.println("abc2");
}
}
