class JaggedArray{
	public static void main(String[] args){
		int num[][]=new int[4][];
		num[0]=new int[1];
		num[1]=new int[2];
		num[2]=new int[3];
		num[3]=new int[4];	

		for(int i[]:num){
			for(int j:i){
				System.out.println(j);
			}
			System.out.println();
		}
	}
}