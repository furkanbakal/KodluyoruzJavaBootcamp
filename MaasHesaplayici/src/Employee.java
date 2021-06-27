
public class Employee {
	String name;
	int salary;
	int workHours;
	int hireYears;
	
	public Employee(String name, int salary, int workHours, int hireYears) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYears = hireYears;
	}
	
	public int tax () {
		int tax;
		if(this.salary <1000) {
			System.out.println("vergi uygulanmadý");
			tax=0;
		}else {
			tax=(int) (this.salary*0.03);
			
		}
		return tax;
		
		
	}
 public int bonus() {
     return (int) (this.workHours*0.30);
 }
 
 public int  raiseSalary(){
     int tmp = 2021 - this.hireYears;
   int zam = 0;
     if (tmp < 10) {
         zam = (int) (this.salary * 0.05);
     }else if(tmp > 9 && tmp < 20){
         zam = (int) (this.salary * 0.10);
     }else if(tmp > 19){
         zam = (int) (this.salary * 0.15);
     }
     return zam;
 }
	
	public String toString() {
		
		return "adı"+this.name+" "+"çalışanın maaşı"+this.salary+" "+"haftalık çalışma saati "+this.workHours+" "+"işe başlangıç yılı  "+this.hireYears;
		
	}
}
