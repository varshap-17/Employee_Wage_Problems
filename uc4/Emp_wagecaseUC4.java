package examples;

public class Emp_wagecaseUC4 {
	public static final int is_full_time=1;
	public static final int is_part_time=2;
	public static final int emp_rate_per_hr=20;
	
	public static void wage_using_case() {
		int emphrs=0;
		int empwage=0;
		int empCheck=(int) Math.floor(Math.random()*10) % 3;
		switch(empCheck) {
		case is_full_time:
			emphrs=4;
			break;
		case is_part_time:
			emphrs=8;
			break;
		default:
			emphrs=0;
		}
		empwage=emphrs*emp_rate_per_hr;
		System.out.println("Employee Wage = "+empwage);
	}
	public static void main(String[] args) {
		wage_using_case();
	}
}
