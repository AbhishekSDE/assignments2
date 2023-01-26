package array;

public class SelectionSort {
     static void sort(int arrr[])
     {
    	int n=arrr.length;
    	for (int i=0;i<n-1;i++)
    	{
    		int maxValue=i;
    		for (int j=i+1;j<n;j++)
    		{
    			if(arrr[i]<arrr[j])
    			{
    				maxValue=j;
    				
    				  int temp = arrr[j];
    				  arrr[maxValue] = arrr[i];
    		            arrr[i] = temp;
    			}
    		}  
    	}
     }
    static void printArray(int arr[])
     {
        for(int ele:arr)
        {
          System.out.print(ele+" ");	
        }
     }
	public static void main(String[] args) {
	    int [] sel = {12,34,54,6,8,77};
	   SelectionSort.sort(sel);
	   System.out.println("Sorted array");
	   printArray(sel);
	}

}
