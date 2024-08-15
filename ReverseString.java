import java.util.Scanner;
public class ReverseString {
    static void PrintsRev(String name,int idx){
    if(idx==name.length()-1){
        System.out.print(name.charAt(idx)+" ");
        return;
    }
    PrintsRev(name, idx+1);
    System.out.print(name.charAt(idx)+" ");
}
    static String ReturnsRev(String name,int idx){
        if(name.length()==idx)return "";
        String ans=ReturnsRev(name, idx+1);
        return ans+name.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner ai=new Scanner(System.in);
        String naam=ai.nextLine();
       //PrintsRev(naam, 0);
       System.out.println(ReturnsRev(naam, 0));
    }
}
