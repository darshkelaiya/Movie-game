/*
The time when we run the program we send the list of arguments..
send the arguments as space separated values
Wrapper classes in java are classes whose objects they wrap primitive datatypes.
whenever we want to change the arguments passed (string to integer/ string to double etc) we use wrapper classes..
Based on the primitive types there are 8 wrapper classes - Short , Boolean , Integer , Float , Double ,Character
Converting primitive types to their object of wrapper class is called AutoBoxing 
Converting  object of wrapper class to their primitive types is called unBoxing  
*/

public class cla{
	public static void main(String args[]){

	//we can pass primitive data as well as strings here.
	//JVM gets the command lines and gives them to args[] array
	if(args.length > 0){
		//looping through the arguments bundle to display all values	
		/*for(String arg:args){
			System.out.println(arg);
		}*/

		//double salary = Double.parseDouble(args[0]);
		//System.out.println(salary);
		int n1 = Integer.parseInt(args[0]);

		int n2 = Integer.parseInt(args[1]);
		System.out.println(n1 +n2);

		/*
		int playerScore=34;
	        Integer num1 = playerScore;//Autoboxing
                playerScore = num1;*/
        

	}
	else{
		System.out.println("No command line arguments provided");

	}
     }
}