import javax.print.DocFlavor.STRING;

public class RemoveOccur {
    public static void main(String[] args) {
        String nam="vinod";
        System.out.println(cutoccurances(nam, 0));    }
    static String cutoccurances(String word,int idx){
        if(idx==word.length()-1)return "";
        String recans=cutoccurances(word, idx+1);
        if('a'!=word.charAt(idx)){
            return recans+word.charAt(idx);
        }
        else return recans;
    }
}
