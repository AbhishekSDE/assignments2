package array;

public class bubbleSort {

	public static void main(String[] args) {
	int [] a= {12,1111,199,87,100,1000};
	
		for (int j=0;j<a.length-1;j++)
		{
			if(a[j]>a[j+1])
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	
	for(int ele:a)
	{
		System.out.print(ele+" ");
	}

}
}