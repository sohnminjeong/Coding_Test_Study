import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int money = sc.nextInt();
            
            int quarter = money/25;
            money %= 25;
            
            int dime = money / 10;
            money %= 10;
            
            int nickel = money / 5;
            money %= 5;
            
            int penny = money;
            
            System.out.println(quarter+ " " + dime + " " + nickel + " " + penny);
        }
        sc.close();
           
        
    }
}