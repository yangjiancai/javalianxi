class Person{
	String name;
	int age;
}
public class chaundi {
	public static void main(String args[]){
		Person p1=null;
		Person p2=null;
		p1=new Person();
		p1.age=25;
		p1.name="yjc";
		p2=p1;
		System.out.println("������"+p2.name+",");
		System.out.print("���䣺"+p2.age);
		p1=null;
	}
}
