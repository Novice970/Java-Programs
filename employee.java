public class employee{
    private String name;
    private double Salary;
    //member functions
    employee (String n,double s){
        name=n;
        Salary=s;
    }
    public void setsal(double s){
        Salary=s;
    }
    public void setname(String n){
        name=n;
    }
    public double getsal(){
            return Salary;
        }            
        public String getname(){
            return name;
        }
        public String displayinfo(){
            return "Name:"+name+"\nSalary:"+Salary;
        }
    }
