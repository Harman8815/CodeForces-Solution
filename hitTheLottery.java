import java.util.Scanner;

public class hitTheLottery{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        int ans=0;
        ans+=num/100;
        num=num%100;
        ans+=num/20;
        num=num%20;
        ans+=num/10;
        num=num%10;
        ans+=num/5;
        num=num%5;
        ans+=num/1;
        System.out.println(ans);
    }
}