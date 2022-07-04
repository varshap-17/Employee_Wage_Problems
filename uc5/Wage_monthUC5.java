package examples;

public class Wage_monthUC5 {
	public static void wage_per_month() {
		int wageper_month=0;
		int wageperhr=20;
		int fulldayhr=8;
		int workingdayper_month=20;
		int wageper_day=0;
		
		wageper_day = wageper_day+(wageperhr*fulldayhr);
		System.out.println("wageper_day =" + wageper_day );
		
		wageper_month=wageper_day*workingdayper_month;
		System.out.println("wageper_month =" + wageper_month );
	}
	public static void main(String[] args) {
		wage_per_month();
	}
}
