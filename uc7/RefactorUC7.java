package examples;

public class RefactorUC7 {
	public static final int is_full_time=2; 
	public static final int is_part_time=1;
	public static final int emp_rate_per_hr=20;
	public static final int num_of_working_days=20;
	public static final int MAX_hrs_in_month=10;
	
	public static int employee_wage() {
		int emphrs=0, totalemphrs=0, totalworkingdays=0;
		while(totalemphrs<=MAX_hrs_in_month &&
				totalworkingdays<num_of_working_days) {
			totalworkingdays++;
			int empCheck=(int)Math.floor(Math.random()*10) % 3;
			switch (empCheck) {
			case is_part_time:
				emphrs=4;
				break;
			case is_full_time:
				emphrs=8;
				break;
			default:
				emphrs=0;
			}
			totalemphrs=emphrs * emp_rate_per_hr;
			System.out.println("Day# " +totalworkingdays+ " Employee hours = " +emphrs);
			}
		int totalempwage=totalemphrs * emp_rate_per_hr;
		System.out.println("Total Employee Wage = " +totalempwage);
		return totalempwage;
	}
	public static void main(String[] args) {
		employee_wage();
	}
}
