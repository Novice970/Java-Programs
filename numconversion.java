public class numconversion{
public static void main(String[] args)
    {
    int firstarg=0;
    if(args.length>0)
        {
        try
            {
            firstarg=Integer.parseInt(args[0]);
        }
        catch(NumberFormatException e)
            {
            System.err.println(args[0]+"must be an integer");
            System.exit(1);
        }
        System.out.println("you entered "+args[0]);
        System.out.println(Math.max(9,7));
    }
}
}