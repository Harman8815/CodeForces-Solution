import java.util.Scanner;

public class Team {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int x=sc.nextInt();
        int count=0;
        while(x-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if((a==1&&b==1)||(c==1&&b==1)||(a==1&&c==1))
            count++;
        }
        System.out.println(count);
        
        
        sc.close();
    }
}
