public class node<T>{
private T data;
    public node next;
    node(T element){
        next=null;
        data=element;
    }
    public T getdata(){
        return data;
    }
}