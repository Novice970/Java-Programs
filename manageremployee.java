public class manageremployee{
    public static void main(String[] args){
        employee e1=new employee("bob",50000);
        System.out.println(e1.displayinfo());
        manager m1=new manager("jack Jones",200000,"IT");
        System.out.println("\n\n");
        m1.setsal(45000);
        System.out.println(m1.displayinfo());
        System.out.println("\n\nthe salary of the manager is"+m1.getsal());
        
    }
}