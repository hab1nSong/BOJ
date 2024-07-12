import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int max = 2 * n - 1;
        int i = 1;
        
        while (i < max) {
            int space = (max - i) / 2;    // 공백 수 만들기
            
            StringBuilder star = new StringBuilder();
            for (int j = 0; j < space; j++) {
                star.append(' ');
            }
            for (int j = 0; j < i; j++) {
                star.append('*');
            }
            System.out.println(star.toString());
                
            i += 2;
        }
        
        StringBuilder lastRow = new StringBuilder();
        for (int j = 0; j < max; j++) {
            lastRow.append('*');
        }
        System.out.println(lastRow.toString());
        
        int j = max - 2;
        
        while (j >= 1) {
            int space2 = (max - j) / 2;    // 공백 수 만들기
            
            StringBuilder star2 = new StringBuilder();
            for (int k = 0; k < space2; k++) {
                star2.append(' ');
            }
            for (int k = 0; k < j; k++) {
                star2.append('*');
            }
            System.out.println(star2.toString());
            
            j -= 2;
        }
    }
}