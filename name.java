public class name
{
private String first;
private String middle;
private String last;

//member functions

    public name (String f,String m,String l)
        {
        first=f;
        middle=m;
        last=l;
    }
    public name()
        {
        first="";
        middle="";
        last="";
        
    }
    public name(String f,String l)
        {
        first=f;
        last=l;
        middle="";
        
    }
    public name(String f)
        {
        first=f;
        middle="";
        last="";
    }
    public String getfirst()
        {
        return first;
    }
    public String getmiddle()
    {
        return middle;
    }
    public String getlast()
        {
        return last;
    }
    public void setfirst(String f)
        {
        first=f;
    }
     public void setmiddle(String f)
        {
        middle=f;
    }
     public void setlast(String f)
        {
        last=f;
    }
    public String tosting()
    {
    return (first+" "+middle+" "+last);
}
}
    
