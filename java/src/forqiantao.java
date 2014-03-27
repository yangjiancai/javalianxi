
public class forqiantao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *****
		 ****
		 ***
		 **
		 *
		 
		//打印如上所示的图形
		int z=5;
		for(int x=1;x<=5;x++){
			for(int y=1;y<=z;y++){
				System.out.print("*");
			}
			System.out.println();
			z--;
		}*/
		/* 打印如下所示
		 1
		 12
		 123
		 1234
		 12345
		 */
		
		for(int x=1;x<=6;x++){
			for(int y=1;y<x;y++){
				System.out.print(y);
		}
		System.out.println();
		}
		System.out.println("----------");
		/*
		 1*1=1
		 1*1=1 1*2=2
		 1*1=1 1*2=2 1*3=3
		 */
		 for(int x=1;x<=9;x++){
			 for(int y=1;y<=x;y++){
				 System.out.print(y+"*"+x+"="+y*x+"\t"); 
			 }
			 System.out.println();
		 }
	}

}
