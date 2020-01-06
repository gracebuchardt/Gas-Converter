import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		
		double p1;
		//pressure
		
		
		
		double v1;
		//volume
		
		double T1;
		//Temperature
		System.out.println("      Gas Pressure/Volume/Temperature Calculator");
		System.out.println("          gas units        : atm, kPa, torr, mmHg");
		System.out.println("          volume units     : mL, L");
		System.out.println("          Temperature units: Celsius, Kelvin");
		System.out.println("      Answer defaults to atm, L, Celsius.");
		System.out.println("");
		System.out.println("       You enter in numbers for two variables before (1),");
		System.out.println("     and then numbers for two variables after (2) the");
		System.out.println("     change in one variable.");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("     If missing variable, skip by entering null for unit and");
		System.out.println("   0 for variable (p/v/T) ");
		System.out.println("  ");
		System.out.println("  ");
		
		System.out.println("Pressure unit 1?"); 
		String p1Unit=in.nextLine();
		
		System.out.println("Amount of pressure 1?"); 
		p1=in.nextInt();
		
		if (p1Unit.equalsIgnoreCase("kPa")) {
		p1=(p1*(1.00/101.325));
		}
		
		if (p1Unit.equalsIgnoreCase("torr")) {
			p1=(p1*(1.00/760));
		}
	
		if (p1Unit.equalsIgnoreCase("mmhg")) {
			p1=(p1*(1.00/760));
		}
		
		System.out.println("Gas unit 1?");
		String v1Unit=in.nextLine();
		
		System.out.println("Volume of gas 1?");
		v1=in.nextInt();
		
		if (v1Unit.equalsIgnoreCase("mL")) {
		v1=(v1/1000);
		}
		
		System.out.println("Temperature unit 1?");
		String T1Unit=in.nextLine();
		
		System.out.println("Temperature of gas 1?");
		T1=in.nextInt();
		
		if (T1Unit.equalsIgnoreCase("Kelvin")) {
		T1=(T1-273);
		}
		
	    double p2;
	    
	    double v2;
	    
	    double T2;
	    
	    System.out.println("Pressure unit 2?"); 
		String p2Unit=in.nextLine();
		
		System.out.println("Amount of pressure 2?"); 
		p2=in.nextInt();
		
		if (p2Unit.equalsIgnoreCase("kPa")) {
		p2=(p2*(1.00/101.325));
		}
		
		if (p2Unit.equalsIgnoreCase("torr")) {
			p2=(p2*(1.00/760));
		}
	
		if (p2Unit.equalsIgnoreCase("mmhg")) {
			p2=(p2*(1.00/760));
		}
		
		System.out.println("Gas unit 2?");
		String v2Unit=in.nextLine();
		
		System.out.println("Volume of gas 2?");
		v2=in.nextInt();
		
		if (v1Unit.equalsIgnoreCase("mL")) {
		v2=(v2/1000);
		}
		
		System.out.println("Temperature unit 2?");
		String T2Unit=in.nextLine();
		
		System.out.println("Temperature of gas 2?");
		T2=in.nextInt();
		
		if (T2Unit.equalsIgnoreCase("Kelvin")) {
		T2=(T2-273);
		}
	
	
	
	}
}
			
			
		//CURRENT ISSUE: It skips over units for V and T in both 1 and 2, unsure of why.

		
	
	 // 



