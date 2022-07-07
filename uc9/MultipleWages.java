package examples;

public class MultipleWages {
	public static final int is_full_time=2; 
	public static final int is_part_time=1;
	
	public MultipleWages(String string, int i, int j, int k) {
	}
	public static int MultipleWages(String company, int emprateperhr, int numofworkingdays, int maxhrspermonth) {
		int emphrs=0, totalemphrs=0, totalworkingdays=0;
		while(totalemphrs<= maxhrspermonth && totalworkingdays<numofworkingdays) {
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
			totalemphrs=emphrs * emprateperhr;
			System.out.println("Day# " +totalworkingdays+ " Employee hours = " +emphrs);
			}
		int totalempwage=totalemphrs * emprateperhr;
		System.out.println("Total Employee Wage for company = " +company+ "is : " +totalempwage);
		return totalempwage;
	}
	public static void main(String[] args) {
		MultipleWages("Dmart",20,28,10);
		MultipleWages("Smart Reliance",40,30,8);
	}
	public void computeEmpWage() {
		// TODO Auto-generated method stub
		
	}
}
