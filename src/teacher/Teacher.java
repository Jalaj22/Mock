package teacher;

public class Teacher {

	
	private int emp_id;
	private String name;
	private int salary;
	
	
	public void setValues(int a,String b,int c){
		emp_id=a;
		name=b;
		salary=c;
	}
	
	
	public void getValues(){
		System.out.println("Employee Id:"+emp_id);
		System.out.println("Employee name:"+name);
		System.out.println("Actual salary is:"+salary);
	}
	
	public void totalsal(){
		int da=salary/50;
		System.out.println("da:"+da);
		int hra=salary/20;
		System.out.println("hra:"+hra);
		int salary=da+hra;
		
		System.out.println("Basic salary is:"+salary);
	}

	
	
}
