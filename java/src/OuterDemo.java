class Outer{
	int sore=98;
	void talk(){
		Inner I=new Inner();
		I.display();
	}
	class Inner{
		 void display(){
			System.out.println("³É¼¨"+sore);
		}
	}
}
public class OuterDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o=new Outer();
		o.talk();
	}

}
