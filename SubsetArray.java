package array;
import java.util.*;
public class SubsetArray {
	 static boolean SubsetOrNot(int arr1[], int arr2[],int n1, int n2)
	    {
	        boolean flag = true;
	        int i,j;
	        for (i = 0; i < n2; i++)
	        {
	            for (j = 0; j < n1; j++)
	            {
	                if (arr2[i] == arr1[j])
	                    break;
	            }
	            if (j == n1)
	            {
	                flag = false;
	                break;
	            }
	        }
	        return flag;
	    }
           public static void main(String[] args) 
	      {        int []arr1= {12,3,45,2,6,7};
	               int []arr2= {5};
                   int n1=arr1.length;
                   int n2=arr2.length;
	           
	            if(SubsetOrNot(arr1,arr2,n1,n2)==true)

	          {
	              System.out.print("Subset of present array");
	          }

	          else
	          {
	              System.out.print("Not subset of present array");
	          }

	      }

	}


