import java.util.Scanner;

public class all{
    Member member;
    public all(Member member) {
        this.member = member;
    }
    public static void main(String[] args){
        Member myMember = new Member("Auriell", "light", 10, 1);
        all myTeam = new all(myMember);
        System.out.println(myTeam.member.getName());
        System.out.println(myTeam.member.getType());
        System.out.println(myTeam.member.getLevel());
        System.out.println(myTeam.member.getRank());


        System.out.println();

        double distance, mpg, pricePerGallon, totalCost;
        String vehicleType;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the total distance in miles: ");
        distance = in.nextDouble();
        System.out.println("Enter the mpg for the vehicle: ");
        mpg = in.nextDouble();
        System.out.println("Enter the price of one gallon of gas: ");
        pricePerGallon = in.nextDouble();
        System.out.println("Please enter vehicle type");
        vehicleType = in.next();


        totalCost = (distance / mpg) * pricePerGallon;
        System.out.printf("The trip is going to cose $%5.2f \n", totalCost);


        System.out.println("My littke" + "sentence");

    }
}
 class Member {
     private String name;
     private String type;
     private int level; // note the data type here
     private int rank; // note the data type here as well

     public Member(String name, String type, int level, int rank){
         this.name = name;
         this.type = type;
         this.level = level;
         this.rank = rank;
     }

     /* let's define our getter functions here */
     public String getName() {
        return this.name;
     }
    public String getType(){
        return this.type;
    }

    public int getLevel(){
        return this.level;
    }

    public int getRank(){
        return this.rank;
    }
 }
