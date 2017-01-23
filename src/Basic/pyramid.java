package Basic;

public class pyramid {
	int a;
	
	pyramid(){
		a =8;	
	}
	
	
	public void pyramidMaker(){
		
		for(int i=a;i>=0;i--){
			int b =a;
			for(int j=i; j>=0; j--){
			System.out.print(b+" ");
			b=b-1;
			}
			System.out.println();
			a=a-1;
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      pyramid p = new pyramid();
		p.pyramidMaker();
		
	}

}
