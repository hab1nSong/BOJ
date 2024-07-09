import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int A = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] B = new int[A];
        
        int index = 0;
        while (st.hasMoreTokens()) {
            B[index] = Integer.parseInt(st.nextToken());
            index++;
        }
        
        int max = B[0];    // 최대값 구하기
        int min = B[0];    // 최소값 구하기
        for (int i=1; i<A; i++) {
            if (B[i] > max) {
                max = B[i];
            }
            
            if (B[i] < min) {
                min = B[i];
            }
        }
        
        bw.write(min + " " + max);
        bw.flush();
        bw.close();
    }
}