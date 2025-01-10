/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


//import com.mycompany.endorsements.Endorsements;
//import com.mycompany.namasteworldfirstjavaproject.Animal;





/**
 *
 * @author Dell
 */

/*
Static variables are neither stored on the heap nor on the stack. They are stored in data segment area of the program.
*/
public class PlayerManage{
    /*
    private static String greet;    
    static{
        greet = "Namaste";
        System.out.println(greet);
    }*/
    
    
    
    public static void main(String[] main)
    {
        
        
        
        YogaFitness yogaObj = new YogaFitness();
        yogaObj.decideMotto();
        
        
        
        //Fitness obj = new Fitness(); // GIVES AN ERROR
        
        //GymFitness gymObj = new GymFitness();
        
        //for an abstract class as well..static variables can be accessed using the CLASSNAME.VARIABLE NAME
        //System.out.println(Fitness.fitnessGuru);        
        
        //CALLING THE STATIC METHOD OF ABSTRACT CLASS
        //Fitness.printGuruname();
        
       // StrongGymFitness strongObj = new StrongGymFitness();
        //strongObj.getGymRoutine();
        
        //FINAL KEYWORD IN JAVA
        //FINAL VARIABLE - THE VALUE OF THAT VARIABLE CANNOT BE CHANGED. RE-ASSIGN IT ANYWHERE
        //variable called as pi
        //final  double pi=3.1415;
        //pi=3.42555;//gives an error
        //final int key;//first declare it
        //key=99;//then initialise it
        //key =100;//gives an error
        
        //FINAL METHOD HAS BEEN EXPLAINED IN GYMFITNESS CLASS FILE       
        
        //FINAL CLASS        
        /*PersonalInformation info = new  PersonalInformation();
        info.setGetHelp("info getHelp");
        info.getHelpInfo();
        
        PersonalInformation info1 = new  PersonalInformation();
        info1.setGetHelp("info1 getHelp");
        info1.getHelpInfo();*/
        
        
        
        
        
       /* Player[] arr = new Player[5];
         
         arr[0] = new Player(2,"Leander Paes", "Tennis","Yes");
         arr[1] = new Player();
         arr[2] = new Player(3,"Chirag Shetty", "Badminton","Yes");
         arr[3] = new Player(4,"Satwik Rankireddy", "Badminton","Yes");
         arr[4] = new Player(5,"Sunil Chhetri", "Football","No");
         
         //
         //Player.playercountry = "Bharat";
         //arr[0].playercountry = "Bharat";
         for(Player player :arr){   
             
             System.out.println(player.getPlayerName()+":"+player.getPlayerSportName()+":"+Player.getPlayerCountry());
             
             */
         }
        
         
    
}
