import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int A = Integer.parseInt(br.readLine());
        
        for(int i=1; i<=A; i++) {
            String str = "";
            
            for (int j = 1; j <= A - i; j++) {
                str += " ";
            }
           
            for (int k = 1; k <= i; k++) {
                str += "*";
            }
            
            bw.write(str + "\n");
        }
        
        bw.close();
    }
}