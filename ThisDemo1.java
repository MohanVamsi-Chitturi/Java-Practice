
public class ThisDemo1 {
	int a;
	int b;
	int c;
	ThisDemo1(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		
		
	}
	public void display()
	{
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisDemo1 td1=new ThisDemo1(1,2,3);
		td1.display();

	}

}
