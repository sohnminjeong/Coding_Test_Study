import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<2; i++){
            int a = sc.nextInt();
            System.out.print(1-a + " ");
        }
        for(int j=0; j<3; j++){
            int b = sc.nextInt();
            System.out.print(2-b + " ");
        }
        int c = sc.nextInt();
        System.out.print(8-c + " ");
    }
}