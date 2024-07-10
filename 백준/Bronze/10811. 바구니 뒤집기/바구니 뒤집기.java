import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int bsk = Integer.parseInt(st.nextToken());
        int line = Integer.parseInt(st.nextToken());
        
        int[] array = new int[bsk];
        // 바구니 배열 생성
        for(int a = 0; a < bsk; a++){
            array[a] = a+1;
        }

        for(int i = 1; i <= line; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken())-1;  // 바꿀 위치값 start
            int end   = Integer.parseInt(st.nextToken())-1;  // 바꿀 위치값 end
            
            while (start < end) {
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
                start++;
                end--;
            }
        }
        
        // 바구니 배열에 담긴 데이터 출력하기
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < array.length; k++) {
            sb.append(array[k]);
            if (k < array.length - 1) {
                sb.append(" ");
            }
        }
        String arrStr = sb.toString();

        bw.write(arrStr);
        bw.newLine();  // 개행 추가
        bw.flush();
        bw.close();
    }
}