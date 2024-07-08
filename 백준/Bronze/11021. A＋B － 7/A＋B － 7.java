import java.io.*;
import java.util.*;

class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st;
        
        int firstLine = Integer.parseInt(br.readLine());
        
        for(int i=1; i<=firstLine; i++) {
            st = new StringTokenizer(br.readLine());
            
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            
            bw.write("Case #" + i + ": " + (num1+num2) + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}