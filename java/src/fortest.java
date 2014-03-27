
public class fortest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//打印1-10的和
		/*int x=0;
		int num = 0;
		for(int i=0;i<=10;i++){
			num=num+i;
			
		}
		System.out.println("1-10的和："+num);*/
		//1-100之间7的倍数的个数，并打印
		/*
		 步骤：1.先把1-100之间进行遍历；
		 	2。找出1-100之间7的倍数
		 */
		int y=1;
		int sum=0;
		for(int i=1;i<=100;i++){
			if(i%7==0)
			sum++;
				;
		}
		System.out.println("sum="+sum);
		}
	}


