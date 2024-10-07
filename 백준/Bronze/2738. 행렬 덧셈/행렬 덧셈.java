import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 행렬의 크기 N과 M 입력
        String[] dimensions = br.readLine().split(" ");
        int N = Integer.parseInt(dimensions[0]);
        int M = Integer.parseInt(dimensions[1]);

        // 행렬 A와 B를 저장할 2차원 배열 생성
        int[][] A = new int[N][M];
        int[][] B = new int[N][M];

        // 행렬 A 입력
        for (int i = 0; i < N; i++) {
            String[] row = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                A[i][j] = Integer.parseInt(row[j]);
            }
        }

        // 행렬 B 입력
        for (int i = 0; i < N; i++) {
            String[] row = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                B[i][j] = Integer.parseInt(row[j]);
            }
        }

        // 행렬 A와 B의 합 계산 및 출력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int sum = A[i][j] + B[i][j];
                bw.write(sum + (j < M - 1 ? " " : ""));
            }
            bw.newLine(); // 다음 줄로 이동
        }

        bw.flush(); // 출력 버퍼를 비우고 데이터 출력
        bw.close(); // BufferedWriter 닫기
    }
}