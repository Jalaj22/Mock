package test;

import test1.Test1;
import test2.Test2;

public class Test {

	public static void main(String[] args) {
		
		Test1 t=new Test1();
		t.display();
		
		t.setStr("hello");
		System.out.println(t.getStr());
		//System.out.println("hi");
		t.setStr("abc");
		System.out.println(t.getStr());
		
		
		
		
		
		
		/*Test2 t2=new Test2();
		t2.display();*/
	}

}
