public class bubblesort{
    public static void main(String[] args){
        int size=50;
        int[] arr= new int[size];
        for (int i=0;i<size;i++){
            arr[i]=(int)(Math.random()*100);
            
        }
        int temp;
         System.out.print("unSorted array:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
       for(int i=0;i<size;i++){
           for(int j=0;j<(size-i-1);j++){
               if(arr[j]>arr[j+1]){
                   temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
               }
           }
       }
        System.out.println("Sorted array:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}