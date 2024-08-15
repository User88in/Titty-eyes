import java.util.Scanner;

public class IsPalindrome {
    static boolean ChecksPalindrome(String data,int left,int right){
        while(left<=right){
            if(data.charAt(left)==data.charAt(right)){
                return ChecksPalindrome(data, left+1, right-1);
            }
            else return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner ai=new Scanner(System.in);
        String name=ai.nextLine();
        if(ChecksPalindrome(name, 0, name.length()-1)){
            System.out.println("is Palindrome");
        }else System.out.println("not a palindrome");
    }
}
