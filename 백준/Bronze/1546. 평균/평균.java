import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double arr[] = new double[N];
        for(int i=0; i<N; i++){
            arr[i]=sc.nextDouble();
        }
        sc.close();
        double sum = 0;
        Arrays.sort(arr);
        for(int i=0; i<N; i++){
            sum+=((arr[i]/arr[N-1])*100);
        }
        System.out.print(sum/N);
    }
}