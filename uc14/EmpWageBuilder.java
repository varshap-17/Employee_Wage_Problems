package examples;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class EmpWageBuilder implements IComputeEmpWage{
	public static final int is_part_time=1;
	public static final int is_full_time=2;
	private LinkedList<CompanyEmpWage> companyEmpWageList;
	private Map<String,CompanyEmpWage> companyToEmpWageMap;
	
	public EmpWageBuilder() {
		companyEmpWageList=new LinkedList<>();
		companyToEmpWageMap=new HashMap<>();
	}
	public void addCompanyEmpWage(String company,int emprateperhr, int numofworkingdays, int maxhrspermonth) {
		CompanyEmpWage companyEmpWage=new CompanyEmpWage(company,emprateperhr,numofworkingdays,maxhrspermonth);
		companyEmpWageList.add(companyEmpWage);
		companyToEmpWageMap.put(company, companyEmpWage);
	}
	public void computeEmpWage() {
		for(int i=0; i<companyEmpWageList.size(); i++) {
			CompanyEmpWage companyEmpWage=companyEmpWageList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
			System.out.println(companyEmpWage);
		}
	}
	public int getTotalWage(String company) {
		return companyToEmpWageMap.get(company).totalempwage;
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
		IComputeEmpWage empwageBuilder = new EmpWageBuilder();
		empwageBuilder.addCompanyEmpWage("Jio",20,2,10);
		empwageBuilder.addCompanyEmpWage("Airtel",10,4,20);
		empwageBuilder.computeEmpWage();
		System.out.println("Total wage for Jio company:" + empwageBuilder.getTotalWage("Jio"));
		System.out.println("Total wage for Airtel company:" + empwageBuilder.getTotalWage("Airtel"));
     }
}