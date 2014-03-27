import java.util.Arrays;


public class shuzutest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max ,min;
		int a[]= {5,6,7,89,45,67,1,8,30,56};
		max=min=a[0];
		for(int i=0;i<a.length;i++){
			System.out.println("a["+i+"]"+"="+a[i]);
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];
				
		}
		
		System.out.println("长度："+a.length);
		System.out.println("最大值："+max);	
		System.out.println("最小值："+min);
		Arrays.sort(a);
		System.out.print("排序后的顺序："+" ");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		
	}

}
