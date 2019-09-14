package student;

public class Student {
	
	private int rollno;
	private String name;
	private int sub1;
	private int sub2;
	private int sub3;
	
	
	public void setValue(int a,String b,int c,int d,int e){
		
		rollno=a;
		name=b;
		sub1=c;
		sub2=d;
		sub3=e;
	}
	
	public void calculator(){
		int total=sub1+sub2+sub3;
		System.out.println("Total is:"+total);
		int per=total/3;
		System.out.println("Percentage is:"+per+"%");
	}
	
	
	/*public void getValue(){
		System.out.print(rollno+" ");
		System.out.print(name+" ");
		System.out.print(sub1+" ");
		System.out.print(sub2+" ");
		System.out.println(sub3);
		
		
	}*/
	public String getvalue(){
		
		return(rollno+" "+name+" "+sub1+" "+sub2+" "+sub3);
	}
	
	
	
	
}
