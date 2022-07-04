package examples;

public class MultipleWages {
	public static final int is_full_time=2; 
	public static final int is_part_time=1;
	
	public static int calEmpwageforCompany(String company, int emprate, int numofdays, int maxhrs) {
		int emphrs=0, totalemphrs=0, totalworkingdays=0;
		while(totalemphrs<= maxhrs && totalworkingdays<numofdays) {
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
			totalemphrs=emphrs * emprate;
			System.out.println("Day# " +totalworkingdays+ " Employee hours = " +emphrs);
			}
		int totalempwage=totalemphrs * emprate;
		System.out.println("Total Employee Wage for company = " +company+ "is : " +totalempwage);
		return totalempwage;
	}
	public static void main(String[] args) {
		calEmpwageforCompany("Dmart",20,28,10);
		calEmpwageforCompany("Smart Reliance",40,30,8);
	}
}
