import java.util.Scanner;

public class easyproblem {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean hard=false;
        while(n-->0){
            int temp=sc.nextInt();
            if(temp==1){
                hard=true;
                break;
            }
        }
        if(hard)System.out.println("HARD");
        else System.out.println("EASY");
        sc.close();
    }
}