public class manager extends employee{
    private String dept;
    manager(String n,double s,String d){
        super(n,s);
        dept=d;
    }
    public void setdept(String d){
        dept=d;
    }
    public String setdept(){
        return dept;
    }
    public String displayinfo(){
        String info=super.displayinfo();
        return info+"\nDepartment:"+dept;
    }
}