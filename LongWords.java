import java.util.Scanner;

public class LongWords {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int x=sc.nextInt();
        while(x-->=0){
            String temp=sc.nextLine();
            String ans=new String(temp);
            if(temp.length()>10){
                ans=temp.charAt(0)+""+(temp.length()-2)+temp.charAt(temp.length()-1);
            }
            System.out.println(ans);
        }
        
        
        sc.close();
    }
}
