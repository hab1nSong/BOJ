import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        String[] array = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        
        int time = 0;
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            for(int j = 0; j < array.length; j++) {
                if (array[j].indexOf(ch) != -1) {
                    time += (j+3);
                    break;
                }
            }
        }
        
        System.out.println(time);
    }
}