public class isSorted {
    public static void main(String[] args) {
        int arr[]={1,2,3,47,4,5,5};
        if(issorted(arr, 1)){
            System.out.println("yes");
        }else System.out.println("no");
    }
    static Boolean issorted(int arr[],int idx){
        if(idx==arr.length)return true;
        if(arr[idx]<arr[idx-1])return false;
        return issorted(arr, idx+1);
    }
}