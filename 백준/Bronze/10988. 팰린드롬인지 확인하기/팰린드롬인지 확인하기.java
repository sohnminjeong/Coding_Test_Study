import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        StringBuffer str = new StringBuffer(br.readLine());
        
        if(str.toString().equals(str.reverse().toString())){
            System.out.println(1);
        } else{
            System.out.println(0);
        }
    }
}