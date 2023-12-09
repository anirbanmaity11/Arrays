package arrays;

public class EmployeeDriver {

	public static void main(String[] args) {
		Employee e1=new Employee(101,"Dinga",25,900.0);
		Employee e2=new Employee(105,"Tony",26,700.0);
		Employee e3=new Employee(107,"Jems",28,1200.0);
    Employee[]	e=new Employee[3];
           e[0]=e1;
           e[1]=e2;
           e[2]=e3;
      for(Employee i : e) {
    	  if (i.id==105||i.salary>1000.0) {
    		  System.out.println("ID: "+i.id);
    		  System.out.println("NNME: "+i.name);
    		  System.out.println("AGE: "+i.age);
    		  System.out.println("SALARY:"+i.salary);
    		  System.out.println("...............");
    	  }
      }

	}

}
