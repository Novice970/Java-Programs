public class pair< T1,T2>
    {
    private T1 firstitem;
    private T2 seconditem;
    
    pair(T1 first,T2 second){
        firstitem=first;
        seconditem=second;
    }
    public T1 getfirst(){
        return firstitem;
    }
    public T2 getsecond(){
        return seconditem;
    }
    
}