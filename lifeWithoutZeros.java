import java.util.Scanner;

public class lifeWithoutZeros {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        sc.close();
        int result=num1+num2;
        int new1=removeZero(num1);
        int new2=removeZero(num2);
        int newresult=removeZero(result);
        int newresult2=new1+new2;
        if(newresult==newresult2)System.out.println("YES");
        else System.out.println("NO");
        // System.out.println(newresult2+" "+newresult);
    }
    public static int removeZero(int num){
        String str=new String(num+"");
        StringBuilder st=new StringBuilder();
        for(char ch:str.toCharArray()){
            if(ch!='0')st.append(ch);
        }
        return Integer.parseInt(st.toString());
    }
}
