package examples;

public class Emp_WageUC3 {
	public static void calculate_Wage() {
		int is_full_time=1;
		int is_part_time=2;
		int emprate_per_hr=20;
		int full_day=8;
		int part_day=4;
		int empwage=0;
		double empCheck=Math.floor(Math.random()*10) % 3;
		if(empCheck==is_part_time) {
			part_day=4;
			empwage=part_day*emprate_per_hr;
		}else if(empCheck==is_full_time) {	
			full_day=8;
			empwage=full_day*emprate_per_hr;
		}
		System.out.println("Employee_Wage = "+ empwage);
	}
	public static void main(String[] args) {
		calculate_Wage();
	}
	
}
