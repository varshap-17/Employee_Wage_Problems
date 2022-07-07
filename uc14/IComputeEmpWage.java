package examples;

public interface IComputeEmpWage {
	public void addCompanyEmpWage(String company, int emprateperhr, int numofworkingdays, int maxhrspermonth);
	public void computeEmpWage();
	public int getTotalWage(String company);
	
	public class CompanyEmpWage{
		public final String company;
		public final int emprateperhr;
		public final int numofworkingdays;
		public final int maxhrspermonth;
		public int totalempwage;
	
	public CompanyEmpWage(String company, int emprateperhr, int numofworkingdays, int maxhrspermonth) {
		this.company=company;
		this.emprateperhr=emprateperhr;
		this.numofworkingdays=numofworkingdays;
		this.maxhrspermonth=maxhrspermonth;
		totalempwage=0;
	}
	public void setTotalEmpWage(int totalempwage) {
		this.totalempwage=totalempwage;
	}
	public String toString() {
		return "Total Emp Wage for Company:" +company+ "is:" +totalempwage;
	}
 }
}