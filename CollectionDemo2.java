import java.util.ArrayList;
import java.util.Iterator;


class Student
{
	int rno;
	String name;
	int age;
	Student(int rno,String name,int age){
		this.rno=rno;
		this.name=name;
		this.age=age;
	}
	
}

public class CollectionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ArrayList<String> list=new ArrayList<String>();
//		list.add("Asish");
//		list.add("Sai");
//		list.add("Keerthi");
//		Iterator it=list.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		
		ArrayList<Student> stu=new ArrayList<Student>();
		ArrayList<String> st1=new ArrayList<String>();
		Student s1=new Student(1,"Asish",22);
		Student s2=new Student(2,"Sai",22);
		Student s3=new Student(3,"Keerthi",17);
		stu.add(s1);
		stu.add(s2);
		stu.add(s3);
		st1.add("Sai");
		stu.retainAll(st1);
		stu.remove(s2);
		System.out.println(stu.indexOf(s3));
		//System.out.println("asish");
		Iterator itr=stu.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		

	}

}
