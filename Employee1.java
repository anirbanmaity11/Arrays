package arrays;

public class Employee1 {
String name;
double salary;
int id;
 Employee1(String name, double salary, int id) {
	this.name = name;
	this.salary = salary;
	this.id = id;
}

 public void display() {
	 System.out.println("NAME: "+name);
	 System.out.println("SALARY "+salary);
	 System.out.println("ID :"+id);
	 System.out.println("              ");
 }

}
