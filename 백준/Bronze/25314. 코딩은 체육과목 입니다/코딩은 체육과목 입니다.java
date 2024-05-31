import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        String str = "";
        for(int i=1; i<=num/4; i++){
            str += "long ";
        }
        System.out.println(str+"int");
    }
}