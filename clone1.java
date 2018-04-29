
public class clone1 {
	public static void main(String[] args){
		testclone t1=new testclone();
		testclone t2;
		t1.a=15;
		t1.b=14.75;
		t2=(testclone)t1.Clone();
		System.out.println("t1: "+t1.a+ " "+t1.b);
		System.out.println("t2: "+t2.a+ " "+t2.b);
	}

}
