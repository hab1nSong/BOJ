import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        int idx = sc.nextInt();
        
        System.out.println(str.charAt(idx-1));
    }
}