
public class jijie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ָ�����·ݣ���ӡ����Ӧ�ļ���
		int num=3;
		//��if����ж�
		/*if(num>=1 & num<=3)
			System.out.println("��һ����");
		else if (num>=4 & num<=6)
			System.out.println("�ڶ�����");
		else if (num>=7 & num<=9)
			System.out.println("��������");
		else if (num>=10 & num<=12)
			System.out.println("���ļ���");
		else
			System.out.println("û���������");	*/
		//��switch����ж�
		switch (num){
			case 1:
			case 2:
			case 3:
				System.out.println("��һ����");
				break;
			case 4:
			case 5:
			case 6:
				System.out.println("�ڶ�����");
				break;
			case 7:
			case 8:
			case 9:
				System.out.println("��������");
				break;
			case 10:
			case 11:
			case 12:
				System.out.println("��������");
				break;
			default:
				System.out.println("û���������");
		}
	}

}
