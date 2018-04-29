import java.util.HashSet;
public class namehashlist{
public static void main(String[] args){
    HashSet<String> names=new HashSet<String>();
    names.add("jacob");
    names.add("bryan");
    names.add("cynthia");
    names.add("peggy");
    System.out.println("the size of the names list="+names.size());
    names.remove("jacob");
    for(String name:names){
        System.out.println(name);
        
    }
    if(names.contains("bryan"))
        {
        System.out.println("the name is present");
        
    }
    else
         System.out.println("the name is present");
    
}
}