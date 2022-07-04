package examples;

public class Emp_WageUC2 {
	
	public static void calculate_wage() {
		int is_full_time=1;
		int emprate_per_hr=20;
		int full_day=8;
		int empwage=0;
		double empCheck=Math.floor(Math.random()*10) % 2;
		if(empCheck==is_full_time) {
			full_day=8;
			empwage=full_day*emprate_per_hr;
		}
		System.out.println("Employee_Wage = "+ empwage);
	}
	public static void main(String[] args) {
		calculate_wage();
	}
}
