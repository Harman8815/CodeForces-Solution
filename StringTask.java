import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String str=sc.nextLine();
        System.out.println(helper(str));
        sc.close();
    }
    public static String helper(String str){
        StringBuilder st=new StringBuilder();
        str=str.toLowerCase();
        for(char ch:str.toCharArray()){
            if(ch=='a'||ch=='e'||ch=='o'||ch=='u'||ch=='i'||ch=='y')continue;
            else {
                st.append('.');
                st.append(ch);
            }
        }
        return st.toString();
    }
}
