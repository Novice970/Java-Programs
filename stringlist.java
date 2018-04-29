public class stringlist<T> implements ilist<T> {
    private int size;
    private T[] datastore;
    private int pos;
    
    stringlist(int num){
        pos=0;
        size=num;
        datastore=(T[]) new Object[size];
    }
    public void add(T element){
        datastore[pos]=element;
        pos++;
    }
    public T get(int n){
        return datastore[n];
    }
    
    
}
