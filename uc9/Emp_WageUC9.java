package examples;

public class Emp_WageUC9 {
	public static final int is_part_time=1;
	public static final int is_full_time=2;
	
	private String company;
	private int emprateperhr;
	private int numofworkingdays;
	private int maxhrspermonth;
	private int totalempwage;
	
	public Emp_WageUC9(String company, int emprateperhr, int numofworkingdays, int maxhrspermonth) {
		this.company=company;
		this.emprateperhr=emprateperhr;
		this.numofworkingdays=numofworkingdays;
		this.maxhrspermonth=maxhrspermonth;
	}
	public void computeEmpWage() {
		int emphrs=0, totalemphrs=0, totalworkingdays=0;
		while(totalemphrs<=maxhrspermonth && totalworkingdays<numofworkingdays) {
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
			totalemphrs += emphrs;
			System.out.println("Day#:" + totalworkingdays + "Emp hr: " + emphrs);
		}
		totalempwage=totalemphrs*emprateperhr;
	}
	public String toString() {
		return "Total Emp Wage for Company:" +company+ "is:" + totalempwage;
	}
	public static void main(String[] args) {
		 Emp_WageUC9 dMart = new Emp_WageUC9("dMart",20,2,10);
		 Emp_WageUC9 reliance = new Emp_WageUC9("reliance",20,4,10);
		dMart.computeEmpWage();
		System.out.println(dMart);
		reliance.computeEmpWage();
		System.out.println(reliance);
	}
}
