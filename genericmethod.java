public class genericmethod{
static <T> void display(T[] arr){
for(int i=0;i<arr.length;i++)
    {
    System.out.print(arr[i]+" ");
    }
}
    public static void main(String[] args){
        String[] names=new String[]{"jones","philips","juhi","maxwell","mark","bryan","bob","paula","greg","parker"};
        
        display(names);
        
    }
}