import java.util.ArrayList;

public class ReturnsSubseq {
    static ArrayList<String> FindsSubSequence(String input){
        //if the input is "abc"
        ArrayList<String> ans=new ArrayList<>();
        if(input.length()==0){
            ans.add(" ");
            return ans;
        }
        char CurChar=input.charAt(0);
        ArrayList<String> Smallans=FindsSubSequence(input.substring(1)); // returns ["bc","b","c"," "]
        for(String ss:Smallans){
            ans.add(ss); // Adds the <smallans> ArrayList to <ans> ArrayList 
            ans.add(CurChar+ss); // Appends Firstindex of String to the <ans> ArrayList
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<String> main=FindsSubSequence("abc");
        for(String ss:main)System.out.println(ss);
    }
}
