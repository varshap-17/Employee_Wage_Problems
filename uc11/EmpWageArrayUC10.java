package examples;

public class EmpWageArrayUC10 {
	public static final int is_part_time=1;
	public static final int is_full_time=2;
	private int numofcompany=0;
	private CompanyEmpWage[] companyEmpWageArray;
	
	public EmpWageArrayUC10() {
		companyEmpWageArray = new CompanyEmpWage[5];
	}
	public void addCompanyEmpWage(String company,int emprateperhr, int numofworkingdays, int maxhrspermonth) {
		companyEmpWageArray[numofcompany]=new CompanyEmpWage(company,emprateperhr,numofworkingdays,maxhrspermonth);
		numofcompany++;
	}
	public void computeEmpWage() {
		for(int i=0; i<numofcompany; i++) {
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}
	private int computeEmpWage(CompanyEmpWage companyEmpWage) {
		int emphrs=0, totalemphrs=0, totalworkingdays=0;
		while(totalemphrs<=companyEmpWage.maxhrspermonth && totalworkingdays<companyEmpWage.numofworkingdays) {
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
		return totalemphrs*companyEmpWage.emprateperhr;
	}
	public static void main(String[] args) {
		EmpWageArrayUC10 empwage=new EmpWageArrayUC10();
		empwage.addCompanyEmpWage("DMart",20,2,10);
		empwage.addCompanyEmpWage("Reliance",10,4,20);
		empwage.computeEmpWage();
	}
}
