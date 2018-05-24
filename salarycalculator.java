import java.util.Scanner;
public class salarycalculator {

  

    public static void main(String[] args) {
	

	      Scanner sc = new Scanner(System.in);
		int basic = sc.nextInt();
		String gr = sc.next();
		char grade = gr.charAt(0);
		double hra = (20.0*basic)/100;
		double da =  (50.0*basic)/100;
		double pf =(11.0*basic)/100;
			
		if (grade == 'A' )
		{
		    double a = 1700.0;
			//System.out.println(a);
			double TotalSalary=Math.round((basic+hra+da+a)-pf);
			int Total = (int)TotalSalary;
			System.out.println(Total);

		    
		}
		else if (grade == 'B')
		{
		    double al = 1500;
			//System.out.println(al);
			double TotalSalary=Math.round((basic+hra+da+al)-pf);
			int Total = (int)TotalSalary;
			System.out.println(Total);

		    
		}
		else
		{
		    double all =1300;
			//System.out.println(all);
			double TotalSalary=Math.round((basic+hra+da+all)-pf);
			int Total = (int)TotalSalary;
			System.out.println(Total);

		    
		}
	     
	    }
	
	// TODO Auto-generated method stub

    }

	
    


