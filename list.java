public class list<T>{
    private T[] datastore;
    private int size;
    private int pos;
    
    list(int num){
        size=num;
        datastore=(T[]) new Object[size];
        pos=0;
    }
    public void add(T element){
        datastore[pos]=element;
        pos++;
    }
    public void tostring(){
        for(int i=0;i<pos;i++){
            System.out.print(datastore[i]+" ");
            
        }
    }
}