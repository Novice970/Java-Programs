import java.util.PriorityQueue;
import java.io.*;

public class squaredance{
    public static void main(String[] args) throws IOException {
        PriorityQueue<String> men=new PriorityQueue<String>();
        PriorityQueue<String> women=new PriorityQueue<String>();
        String line;
        String filename="C:\\dancers.txt";
        //String sex="";
       // BufferedReader input;
        try{
            BufferedReader input=new BufferedReader( new FileReader("C:\\dancers.txt"));
            while ( (line=input.readLine())!=null){
                if(line.substring(0,1).equals("M")){
                    men.add(line.substring(2));
                }
                else {
                    women.add(line.substring(2));
                }
                input.close();
            }
        }
            catch(IOException ioe){
                System.out.println("the file not found");
            }
        
        while(!men.isEmpty()&&!women.isEmpty()){
            System.out.println("the dancing pair is "+men.poll()+" with "+women.poll());
        }
        if (men.isEmpty()){
            System.out.println("there are "+men.size()+"waiting");
            System.out.println("the next man to dance is "+men.peek());
        }
         if (women.isEmpty()){
            System.out.println("there are "+women.size()+"waiting");
            System.out.println("the next woman to dance is "+women.peek());
        }    
    }
}