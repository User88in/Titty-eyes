import java.util.ArrayList;
public class Returnallidx {
    static ArrayList<Integer> Index(int arr[],int idx,int key){
        if(idx==arr.length)return new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        if(key==arr[idx]){
            ans.add(idx);
        }
        ArrayList<Integer> recursiveAns=Index(arr, idx+1, key);
        ans.addAll(recursiveAns);
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,1,1,2,5,6,1};
        ArrayList<Integer> Mainmethod=Index(arr, 0, 1);
        for(Integer i:Mainmethod){
            System.out.println(i);
        }

    }
}
