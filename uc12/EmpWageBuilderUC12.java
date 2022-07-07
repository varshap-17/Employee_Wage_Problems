package examples;

import java.util.ArrayList;

public class EmpWageBuilderUC12 {
	public static final int is_part_time=1;
	public static final int is_full_time=2;
	
	private int numofcompany=0;
	private ArrayList<CompanyEmpWage> companyEmpWageList;
	
	public EmpWageBuilderUC12() {
		companyEmpWageList=new ArrayList<>();
	}
	public void addCompanyEmpWage(String company,int emprateperhr, int numofworkingdays, int maxhrspermonth) {
		CompanyEmpWage companyEmpWage=new CompanyEmpWage(company,emprateperhr,numofworkingdays,maxhrspermonth);
		companyEmpWageList.add(companyEmpWage);
	}
	public void computeEmpWage() {
		for(int i=0; i<companyEmpWageList.size(); i++) {
			CompanyEmpWage companyEmpWage=companyEmpWageList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
			System.out.println(companyEmpWage);
		}
	}
	public int computeEmpWage(CompanyEmpWage companyEmpWage) {
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
		EmpWageBuilderUC12 empwage=new EmpWageBuilderUC12();
		empwage.addCompanyEmpWage("Jio",20,2,10);
		empwage.addCompanyEmpWage("Airtel",10,4,20);
		empwage.computeEmpWage();
     }
}