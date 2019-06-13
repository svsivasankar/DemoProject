package JavaBasic;


//The nested if statement represents the if block within another if block. 
//Here, the inner if block condition executes only when outer if block condition is true. 

public class nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creating two variables for age and weight    
	    int age=30;    
	    int weight=35;      
	    //applying condition on age and weight 
	    
	    if(age>=18) // outer  if block 
	    {      
	        if(weight>50) // inner if block 
	        {    
	            System.out.println("You are eligible to donate blood");    
	        } else
	        {  
	            System.out.println("You are not eligible to donate blood");    
	        }  
	    } 
	    else
	    {  
	      System.out.println("Age must be greater than 18");  
	    }  
	}

}
