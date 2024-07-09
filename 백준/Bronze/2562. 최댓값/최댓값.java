import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] A = new int[9];
        int j = 0;
        
        while(j < 9) {
            A[j] = Integer.parseInt(br.readLine());
            j++;
        }

        int max = A[0];
        int idx = 0;
        for(int i=1; i<9; i++) {
            if (max < A[i]) {
                max = A[i];
                idx = i;
            }
        }
        
        bw.write(max + "\n" + (idx+1));
        bw.flush();
        bw.close();
    }
}