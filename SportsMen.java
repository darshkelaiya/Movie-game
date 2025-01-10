import java.util.Scanner;

public class SportsMen {

    
    int age;
    String name;
    String sport;
     
    public SportsMen(int age, String name, String sport){
        this.age = age;
        this.name = name;
        this.sport = sport;

    }

    public String printName(){
        return this.name;
    }

    public String getSport(){
        return this.sport;
    }

    public int getAge(){
        return this.age;
    }
        

    public static void main(String[] args) {
       /*  SportsMen objVirat = new SportsMen(35, "Virat Kohli", "Cricket");
        System.out.println(objVirat.getAge() + ": " + objVirat.getSport() + ": " + objVirat.printName());

        SportsMen objCristiano = new SportsMen(39, "Cristiano Ronaldo", "Football");
        System.out.println(objCristiano.getAge() + ": " + objCristiano.getSport() + ": " + objCristiano.printName());

        SportsMen objNadal = new SportsMen(38, "Rafael Nadal", "Tennis");
        System.out.println(objNadal.getAge() + ": " + objNadal.getSport() + ": " + objNadal.printName());
        
        
        
        int age = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        
        String sport_name = sc.nextLine();

        SportsMen obj = new SportsMen(age, name, sport_name);
        System.out.println(obj.getAge() + obj.printName() + obj.getSport());

        double num1 = 2.718;
        System.out.println(num1);
         
                 
                        int i = 0; 
                        for (System.out.println("Namaste "); i < 1; i++) 
                                System.out.println("HELLO");
        
        Scanner sc = new Scanner(System.in);
        SportsMen[] obj = new SportsMen[3];
        for(int i = 0; i<3; i++){
            obj[i].age = sc.nextInt();
            obj[i].name = sc.nextLine();
            sc.nextLine();
            obj[i].sport = sc.nextLine();
        }

        System.out.println(obj[2].getSport()+obj[1].getAge());
        */
}
}
