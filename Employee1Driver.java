package arrays;

public class Employee1Driver {

	public static void main(String[] args) {
		Employee1 e1= new Employee1("Dinga",1000,101);
		Employee1 e2= new Employee1("Suhas",2000,102);
		Employee1 e3= new Employee1("Pavan",3000,103);
		Employee1 e4= new Employee1("Rahul",4000,104);
		Employee1 e5= new Employee1("Tony",5000,105);
		
		Employee1[] e= {e1,e2,e3,e4,e5};
		
		for(int i=0;i<=4;i++) {
			e[i].display();
		}

	}

}
