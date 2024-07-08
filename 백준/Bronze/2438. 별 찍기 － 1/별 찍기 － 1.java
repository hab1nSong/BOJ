import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int A = Integer.parseInt(br.readLine());
        String str = "";
        
        for(int i=1; i<=A; i++) {
            str = str + "*";
            
            bw.write(str + "\n");
        }
        
        bw.close();
    }
}