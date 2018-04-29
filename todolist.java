import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class todolist{
static String filename="todolist.txt";
public static void main(String[] args) throws IOException
{
    int menuitem=-1;
  
    while(menuitem!=0){
          menuitem=menu();
        switch(menuitem){
            case 0:
                break;
            case 1:
                showlist();
                break;
            case 2:
                additem();
                break;
            case 3:
                removeitem();
                break;
            default:
                System.out.println("the input is not recognised");
        }
    }
    
    
}
    static int menu(){
        int choice;
        Scanner input=new Scanner(System.in);
        System.out.println("Choose from the options:\n\n 0.Exit the program\n1.Show the to-do list\n2.Add an item\n3.Remove the item\n");
        System.out.println("enter the choice:");
        choice=input.nextInt();
        return choice;
    }
    static void additem(){
        System.out.println("add item\n");
        try{
            Scanner input=new Scanner(System.in);
            PrintWriter outfile=new PrintWriter(new FileWriter(filename,true));
            System.out.println("enter the item;");
            String item=input.nextLine();
            outfile.println(item);
            outfile.close();
        }
        catch(IOException ioe){
            System.out.println("could not open the file");
        }
    
        }
    static void showlist(){
        System.out.println("to-do-list:");
        try{
            Scanner infile=new Scanner(new FileReader(filename));
            int num=1;
            String line=infile.nextLine();
            while(infile.hasNextLine()){
                System.out.println(num+" "+line+"\n");
                num++;
                line=infile.nextLine();
            }
        }
        catch(IOException ioe){
            System.out.println("the file not found");
            
        }
    }
    static void removeitem(){
        int choice;
        showlist();
        System.out.println("enter the choice you wannt to remove:");
        Scanner input=new Scanner(System.in);
        choice=input.nextInt();
        ArrayList<String> items=new ArrayList<String>();
        int num=1;
        try{
            int i=0;
            Scanner infile=new Scanner(new FileReader(filename));
            String item;
            while(infile.hasNextLine()){
                item=infile.nextLine();
                if(num!=choice){
                    items.add(item);
                }
                    num++;
                
            }
            PrintWriter outfile=new PrintWriter(new FileWriter(filename));
            for(i=0;i<items.size();i++){
                outfile.println(items.get(i));
            }
                outfile.close();
            }
        catch(IOException ioe){
            System.out.println("the file not found");
        }
                }
}