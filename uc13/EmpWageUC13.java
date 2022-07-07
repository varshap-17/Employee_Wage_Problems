package examples;

public class EmpWageUC13 {
	public static final int is_full_time=1;
	public static final int is_part_time=2;
	public static final int num_of_working_days=20;
	public static final int MAX_hrs_in_month=10;
	
	public static void computeEmpWage() {
		int emphrs=0, totalemphrs=0, totalworkingdays=0,dailywage=0,totalempwage=0;
		int emprateperhr=20;
		while(totalemphrs<=MAX_hrs_in_month && totalworkingdays<num_of_working_days) {
			totalworkingdays++;
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
			dailywage=emphrs*emprateperhr;
			System.out.println("Daily Wage = " +dailywage);
			totalemphrs += emphrs;
			System.out.println("Day#:" + totalworkingdays + "Emp hr: " + emphrs);
		}
		totalempwage=totalemphrs*emprateperhr;
		System.out.println("Total Emp Wage = " +totalempwage);
	}
	public static void main(String[] args) {
		computeEmpWage();
	}
}
