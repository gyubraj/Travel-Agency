import java.util.*;
public class Travel {
    public static void main(String[] args){
       askInfo();
       askBudget();
       askTimeDifference();
    }
     static void askInfo()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Our Travel Agency.");
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Hello "+name+"  Where do you want to Travel?");
        String place=input.next();
        System.out.println("WOW "+place+" is Great place to visit.");
    }
    static void askBudget(){
        Scanner input=new Scanner(System.in);
        System.out.println("Can you please tell us your Budget plan in Dollar.");
        int price=input.nextInt();
        System.out.println("How many days you are going to stay.");
        int days=input.nextInt();
        System.out.println("What is your Currency symbol?");
        String symbol=input.next();
        System.out.println("Please input your Currency rate.");
        double rate=input.nextDouble();
        double money=price/days;
        System.out.println("Well it looks like your daily Budget is "+money+" in $ or "+money*rate+" in "+symbol+"");

    }
    static void askTimeDifference(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please tell us Time Difference Between Your place & Destination. ");
        double time=input.nextDouble();
        System.out.println("At Home ,when it is midnight there will be "+(00.00+time)%24+" and at Noon "+(12.00+time)%24+" ");
    }

}
