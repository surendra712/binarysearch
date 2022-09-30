import java.util.Scanner;
class BinarySearch 
{
//Creating binarySearch method with parameters 
//as an array,size of that array,finding element
	 static int binarySearch(int a[],int n,int key) 
	 {
//as the index starts from 0 to the n-1th element,we take them as low and high initially
		 int low=0;
		 int high=n-1;
//as long as the low index is less than or equal to the high index,
//the while loop will get executed.
		 while(low<=high) 
		 {
//we have to calculate the mid value every time
			 int mid=(low+high)/2;
//if the finding element is matched with the mid 
//then index of that mid will  be returned
			 if(a[mid]==key)
				 return mid;
 //if the mid value is less than key value,the low will be shifted to mid+1th value
			 else if(a[mid]<key)
				 low=mid+1;
//also if the mid value is high than key value,the high will change in mid-1 th value
			 else if(a[mid]>key)
				 high=mid-1;
		 }
//after executing the program,if the key is not found ,-1 will be returned means false
	return -1;
	 }
	 public static void main(String args[]) 
	 {
		 int i, n, key,index,array[];
//variable in is used as object which calls Scanner constructor in Scanner class
		 Scanner in=new Scanner(System.in);
		 System.out.println("Enter number of elements");
//the number of elements need to be stored will be given and it will be the size of the array
		 n=in.nextInt();
		 array=new int[n];
		 System.out.println("Enter " + n + " integers in increasing order");
		 for(i=0; i<n; i++)
			 array[i]=in.nextInt();
		 System.out.println("Enter value to find");
//after storing the array elements,the program asks to give the value that need to be found 
		 key=in.nextInt();
//index is now calling the binarySearch with parameters as array,size,key element
		 index=binarySearch(array,n,key);
//if the returned value is -1 then the element is not found in the array
		 if(index==-1)
			 System.out.println(key + " is not present in the list.\n");
//otherwise,the index of the key value index in the array is returned
		 else
			 System.out.println("Element found at index " + (index+1));
		 in.close();
	}
}
