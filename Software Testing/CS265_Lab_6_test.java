package cs265;
import java.util.Scanner;

public class cs265ca {
	
	static Scanner sc = new Scanner(System.in);
    static int discount = sc.nextInt();
       
    
    public static String Percentage(int total){
                
        	
        	if(discount>=1 && discount<=2500){
                    
                	
                	if(discount>=1 && discount<=50){
                    	return 0 + " Percent Off!";
                    	}
                    
                    if(discount>=51 && discount<=200){
                    	return 5+ " Percent Off!";
                    	}
                    
                    if(discount>=201 && discount<=500){
                    	return 10+ " Percent Off!";
                    	}
                    
                    if(discount>=501 && discount<=2500){
                    	return 15+ " Percent Off!";
                    	}
                 }
                
                return -1+ "Error: Incorrect no discount";
                
        }

        public static void main(String[] arg){
                        System.out.println(" € "+discount+" is " +Percentage(discount));
                        
        }

 }
