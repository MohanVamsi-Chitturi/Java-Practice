class Demo{
	int num;
	void init(int num1){
		num=num1;
		
	}
	void show(){
		System.out.println(num);
	}
}
public class ClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo d=new Demo();
		d.num=3;
		d.init(d.num);
		d.show();

	}

}
