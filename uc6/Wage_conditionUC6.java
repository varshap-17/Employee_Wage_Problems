package examples;

public class Wage_conditionUC6 {
	public static void hours_condition() {
		int totalworkinghrs=100;
		int wageperhour=20;
		int totalsum=0;
		
		for(int i=1; i<=totalworkinghrs; i++) {
			
			totalsum=totalsum+(i*wageperhour);
		}
		System.out.println("totalsum =" + totalsum );
	}
	public static void main(String[] args) {
		hours_condition();
	}
}
