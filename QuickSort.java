package array;

public class QuickSort {
	   public static int partition(int[] arr,int low,int high)
	   { int pivot=arr[high];
	      int i=low-1;
	      for(int j=low;j<high-1;j++)
	      { 
	    	  if(arr[j]<pivot)
	    	  {
	    		  i++;
	    		  int temp=arr[i];
	    		  arr[i]=arr[j];
	    		  arr[j]=temp;
	    	  }
	      }
	    	      i++;
	    	      int temp=arr[i];
	    	      arr[i]=pivot;
	    	      arr[high]=temp;
		          return i;
	   }

	   public static void quickSort(int arr[],int low,int high)
	   { if(low<high)
	   {
		   int pivotindex=partition(arr,low,high);
		   
		   quickSort(arr,low,pivotindex-1);
		   quickSort(arr,pivotindex+1,high);
	   }
	   }
	public static void main(String[] args) {
		int []arr= {12,34,3,56,76,22};
		int n=arr.length;
		quickSort(arr,0,n-1);
		for(int sort:arr)
		{
			System.out.print(sort+" ");
		}
	}

}
