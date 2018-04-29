public class linkedlist{
    public static void main(String[] args){
        node<String> name1=new node("bobby");
        node<String> name2=new node("maria");
        node<String> name3=new node("gregory");
        node<String> name4=new node("pappu");
        name1.next=name2;
        name2.next=name3;
        name3.next=name4;
        node<String> dummy=new node("");
        dummy=name1;
        while(dummy.next!=null){
            System.out.println(dummy.getdata());
            dummy=dummy.next;
        
        }
    }
}