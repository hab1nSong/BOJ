import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int cnt = Integer.parseInt(br.readLine());
        
        for(int i = 1; i <= cnt; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            String B = st.nextToken();
            
            StringBuilder str = new StringBuilder();
            for(int j = 0; j < B.length(); j++){
                for(int k = 0; k < A; k++) {
                    str.append(B.charAt(j));
                }
            }
            
            bw.write(str + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}