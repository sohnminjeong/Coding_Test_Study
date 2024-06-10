import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String a[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for(int i=0; i<a.length; i++){
            if(str.contains(a[i])){
                str = str.replace(a[i], "!");
            }
        }
        System.out.println(str.length());
    }
}