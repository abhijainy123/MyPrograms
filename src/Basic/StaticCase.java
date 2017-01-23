package Basic;

public class StaticCase {
	
	double salary;
	String name;
	String branchName = "TPT";
	static double bonus;
	
	StaticCase (String name , double salary){
		this.salary = salary;
		this.name = name;		
	}

	static double calcDiwaliBonus(double bonuspercent){
		return (bonuspercent/100);
	}
	
	double getsalary(){
		double factor = calcDiwaliBonus(bonus);
			return (salary + salary * factor);	
	}
	
	void display(){
		System.out.println("\n Name: "+name+ "\n Salary :"+getsalary()+"\n Branch :"+ branchName+ "\n");
	}
	public static void main(String[] args) {
       bonus =5;
       
       StaticCase emply1 = new StaticCase("Abhi", 1000);
       StaticCase emply2 = new StaticCase("Avi", 2000);
       emply1.display();
       emply2.display();     
       

	}

}
