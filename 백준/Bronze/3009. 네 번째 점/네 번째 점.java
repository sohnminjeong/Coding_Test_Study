import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {sc.nextInt(), sc.nextInt()};
        int[] arr2 =  {sc.nextInt(), sc.nextInt()};
        int[] arr3 = {sc.nextInt(), sc.nextInt()};
        sc.close();
        int x;
        int y;
        x=(arr1[0]==arr2[0]?arr3[0]:(arr1[0]==arr3[0])?arr2[0]:arr1[0]);
        y=(arr1[1]==arr2[1]?arr3[1]:(arr1[1]==arr3[1])?arr2[1]:arr1[1]);
        System.out.println(x+" "+y);
    }
}