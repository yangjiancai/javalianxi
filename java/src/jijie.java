
public class jijie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//根据指定的月份，打印出相应的季节
		int num=3;
		//用if语句判断
		/*if(num>=1 & num<=3)
			System.out.println("第一季度");
		else if (num>=4 & num<=6)
			System.out.println("第二季度");
		else if (num>=7 & num<=9)
			System.out.println("第三季度");
		else if (num>=10 & num<=12)
			System.out.println("第四季度");
		else
			System.out.println("没有这个季度");	*/
		//用switch语句判断
		switch (num){
			case 1:
			case 2:
			case 3:
				System.out.println("第一季度");
				break;
			case 4:
			case 5:
			case 6:
				System.out.println("第二季度");
				break;
			case 7:
			case 8:
			case 9:
				System.out.println("第三季度");
				break;
			case 10:
			case 11:
			case 12:
				System.out.println("第三季度");
				break;
			default:
				System.out.println("没有这个季度");
		}
	}

}
