package array;

import java.util.*;

public class Dublicate {

	public static void main(String[] args) {
		boolean flag=false;
		Scanner D=new Scanner(System .in);
		System.out.println("enter the size of the array");
		int Size=D.nextInt();
		
	int [] dub=new int[Size];
	for(int i=0;i<dub.length;i++)
	{
		dub[i]=D.nextInt();
	}
	System.out.println("value present in array");
    for(int i=0;i<dub.length;i++)
    { 
       	System.out.print(dub[i]+" ");
        }
    System.out.println();
    for(int j=0;j<dub.length;j++) {
    	for(int k=j+1;k<dub.length;k++) {
    		if(dub[j]==dub[j+1])
    		{
    			System.out.println("index is =  "+ j +"  dublicate element = "+dub[j] );
    			flag=true;
    			break;
    		}
       	}
	}
    if(flag==false)
	{
		System.out.println("no dublicate found in given array");
	}
	}

}
