package array;

public class MergeSort {
	
	   public static void conquer(int[] arr,int si,int mid ,int ei)
	   {int merge []=new int[ei-si+1];
	   int x=si;
	   int y=mid+1;
	   int z=0;
		   while(x<=mid&&y<=ei)
		   {
			if(arr[x]<=arr[y])
			{
			     merge[z++]=arr[x++];
			     
			}
			else
			{
				merge[z++]=arr[y++];
			}
		   }
		   while(x<=mid)
		   {
			   merge[z++]=arr[x++];
		   }
		   while(y<=ei)
		   {
			   merge[z++]=arr[y++];
		   }
		  for(int i=0,j=si;i<merge.length;i++,j++)
		  {
             arr[j]=merge[i];			  
		  }
	   }
       public static void divide(int arr[],int si,int ei)
       {
    	   if(si>=ei) {
    		   return;
    	   }
    	int   mid=si+(ei-si)/2;
    	divide(arr,si,mid);
    	divide(arr,mid+1,ei);
    	conquer(arr,si,mid,ei);
    	   
       }
	public static void main(String[] args) {
		int []arr = {12,34,56,76,2,3,4};
		int n=arr.length;
		divide(arr,0,n-1);
		for(int ele :arr)
		{
			System.out.print(ele+" ");
		}
		}

}
