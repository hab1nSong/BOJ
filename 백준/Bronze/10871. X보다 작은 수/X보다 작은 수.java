import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            
            String line = br.readLine();
            String[] parts = line.split(" ");    // split 으로 문자열 구분
            int[] numbers = new int[2];
            
            numbers[0] = Integer.parseInt(parts[0]);    // 비교할 숫자 count
            numbers[1] = Integer.parseInt(parts[1]);    // 비교대상
            
            StringTokenizer tk = new StringTokenizer(br.readLine(), " ");    // Tokenizer로 문자열 구분
            int[] numbers2 = new int[tk.countTokens()];
        
            // 토큰을 int형 배열에 저장
            int index = 0;
            while (tk.hasMoreTokens()) {
                numbers2[index] = Integer.parseInt(tk.nextToken());
                index++;
            }
            
            for(int i=0; i<numbers[0]; i++) {
                if (numbers[1] > numbers2[i]) {
                    bw.write(numbers2[i]+" ");
                }
            }
            
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}