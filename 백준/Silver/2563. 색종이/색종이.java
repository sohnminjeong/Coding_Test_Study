import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] paper = new int[100][100];
        int count = sc.nextInt();
        for(int i=0; i<count; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int j=x; j<x+10; j++){
                for(int k=y; k<y+10; k++){
                    paper[k][j] = 1;
                }
            }
        }
        int result=0;
        for(int i=0; i<100; i++){
            for(int j=0; j<100; j++){
                if(paper[i][j]==1){
                    result+=paper[i][j];
                }
            }
        }
        System.out.println(result);
    }
}