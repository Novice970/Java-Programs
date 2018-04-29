import java.util.ArrayList;
public class Arraylist1{
    public static void main(String[] args){
        ArrayList<Integer> grades=new ArrayList<Integer>();
        int total=0,average,i;
        grades.add(70);
        grades.add(77);
        grades.add(70);
        grades.add(77);
        for(i=0;i<grades.size();i++){
            total+=grades.get(i);
        }
        average=total/grades.size();
        System.out.println("the average="+average);
    }
}