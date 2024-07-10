import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int idx = 10;
        Integer[] count = new Integer[idx];
        
        // count 배열에 10개의 라인을 입력
        for(int i = 0; i < idx; i++){
            count[i] = Integer.parseInt(br.readLine()) % 42;
        }
        
        // HashSet으로 중복값 제거
        Set<Integer> set = new HashSet<>(Arrays.asList(count));
        
        bw.write(String.valueOf(set.size()));
        bw.newLine(); // 개행 추가
        bw.flush(); // 출력 버퍼 비우기
        bw.close();
    }
}