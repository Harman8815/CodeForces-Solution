import java.util.Arrays;
import java.util.Scanner;

public class helpfullmaths {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String arr[]=str.split("\\+");
        Arrays.sort(arr);
        String ans=new String();
        for(int i=0;i<arr.length;i++){
            ans+=arr[i];
            if(i!=arr.length-1)ans+="+";
        }
        System.out.println(ans);
        sc.close();
    }
}
