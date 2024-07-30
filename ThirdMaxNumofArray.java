import java.util.Scanner;

public class ThirdMaxNumofArray{
	public static void main(String[] args){
    	Scanner inpObj=new Scanner(System.in);
    	System.out.println("Enter the number of elements in the Array: ");
    	int n=inpObj.nextInt();
    	int[] arr=new int[n];
    	System.out.println("Enter each number in the array:");
    	for(int i=0;i<n;i++){
        	arr[i]=inpObj.nextInt();
    	}
   	 
    	for(int i=0;i<n;i++){
        	for(int j=0;j<n-1-i;j++){
            	if(arr[j]<arr[j+1]){
                	int temp=arr[j];
                	arr[j]=arr[j+1];
                	arr[j+1]=temp;
            	}
        	}
    	}
		inpObj.close();
    	System.out.printf("The third Maximum number in the given array is %d",arr[2]);
	}
}


