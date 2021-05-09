package package1;

public class Ebob {

	public static void main(String[] args) {
		

		int n1=27, n2=153, ebob=1;
		
		for(int i=1; i<=n1; ++i) {
			for(i=1; i<=n2; ++i) {
			if(n1%i==0 && n2%i==0)
				ebob=i;
		}
		}
		System.out.println("n1 ve n2 nin ebobu:" + ebob);
	}

}
