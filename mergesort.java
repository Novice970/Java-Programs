public class mergesort{
   public static void mergeSort(int low,int up,int[] arr){
        if (low<up){
            int middle=(up+low)/2;
            mergeSort(low,middle,arr);
            mergeSort(middle+1,up,arr);
            merge(low,up,middle,arr);
        }
    }
    static void merge(int low,int up,int middle,int[] arr){
        int size=arr.length;
        int[] temp=new int[size];
        for(int i=0;i<=nup;i++){
            temp[i]=arr[i];
        }
        int i=low;
        int j=middle+1;
        int k=low;
        while(i<=middle&&j<=up){
            if(temp[i]>temp[j]){
                arr[k]=temp[j];
                j++;
            }
            else
                {
                arr[k]=temp[i];
                i++;
            }
            k++;
        }
        while(i<=middle){
            arr[k]=temp[i];
            i++;
            k++;
        }
        while(j<=up){
            arr[k]=temp[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args){
        int size=10;
        int[] arr= new int[]{3,9,7,2,6,4,11,1,9,12};
         System.out.print("unSorted array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int low=0;
        int up=9;
    
       mergeSort(low,up,arr);
        System.out.println("\nSorted array:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}