class node{
    public int data;
    public node left;
    public node right;
    
    node(int num){
        data=num;
        left=null;
        right=null;
    }
    node(){
        data =0;
        left=null;
        right=null;
    }
   public int getdata(){
       return data;
   }
}
