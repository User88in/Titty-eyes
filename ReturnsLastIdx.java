public class ReturnsLastIdx {
    public static void main(String[] args) {
        int arr[]={1,2,3,3,5,2,3,9};
        System.out.println(FindsLstIdx(arr, arr.length-1, 1));
    }
    static int FindsLstIdx(int arr[],int idx,int key){
        if(idx==-1)return -1;
        if(arr[idx]==key)return idx;
        return FindsLstIdx(arr,idx-1,key);
    }
}
