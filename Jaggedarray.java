
public class Jaggedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]={5,6,7,8};
		int y[]={6,7,8};
		int z[]={7};
		int p[][]={
				{5,6,7,8},
				{6,7,8},
				{7}
				
		};
		for(int i=0;i<=p.length;i++)
		{
			for(int j=0;j<=p.length;j++){
				System.out.println(p[i][j]+"");
			}
		}
	}

}
