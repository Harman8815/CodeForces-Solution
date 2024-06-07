import java.util.Scanner;

public class bitplusplus {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int x=sc.nextInt();
        sc.nextLine(); // Consume the newline character left by nextInt()
        String a = "++X";
        String b = "X++";
        int count=0;
        while(x-->0){
            String temp=sc.nextLine();
            if(temp.equals(a) || temp.equals(b)) count++;
            else count--;
        }
        System.out.println(count);
        
        sc.close();
    }
}
