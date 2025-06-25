import java.util.*;

public class Demo{

  public static void arrayInput(int arr[], int n,Scanner in){
      for(int i=0;i<n;i++){
        arr[i]=in.nextInt();
      }
  }

  public static void printArray(int arr[] ,int n ){
    System.out.println("Array ELems:");
    for(int ele: arr)System.out.print(ele +" ");

    System.out.println("");
  }

  public static void swapArrayElems(int arr[] ,int a,int b){
      int temp = arr[a];
      arr[a] =arr[b];
      arr[b]=temp;
  }


public static void reverserArr(int[] arr ,int left,int right){
  while(left < right){
    int t = arr[left];
    arr[left] =arr [right];
    arr[right]=t;
    left ++;
    right --;
  }
}

public static int firstPosition(int nums[], int low,int high,int t){
  int firstPosition=-1; 

  while(low<=high){
    int mid=low+((high-low)>>1);
    if(nums[mid] == t){
      firstPosition=mid;
      high=mid-1;
    }else if(nums[mid] > t) high = mid -1;
    else low=mid+1;
  }
  return firstPosition;
}

public static int secondPosition(int nums[],int low,int high ,int t){
  int secondPosition=-1;
 
  while(low<=high){
    int mid=low+((high-low)>>1);
    if(nums[mid] == t){
     secondPosition =mid;
      low=mid+1;
    }else if(nums[mid] > t) high = mid -1;
    else low=mid+1;
  } 
  return secondPosition; 
}

public static void arrayProblem(int[] nums ,int n){ 
 // Scanner sc = new Scanner(System.in);
 // int t = sc.nextInt();
 // sc.close();
  
  int low=0,high=n-1;
  int index=-1;
  int min=Integer.MAX_VALUE;
  while(low<=high){
    int mid=low+((high-low)>>1);
    if(nums[low]<=nums[mid]){
      if(nums[low] < min){
       index=low;
       min=nums[low];
      }
      low=mid-1;
    }else{
     if(nums[low] < min){
       index=low;
       min=nums[low];
      }
     high = mid+1;
    } 
  }
  System.out.println("index:"+ index);
}

public static void main(String[] args){
   Scanner in  = new Scanner(System.in);
   int n = in.nextInt();
   int arr[]  = new int[n];
   arrayInput(arr,n,in);


   //Start coding here
   arrayProblem(arr,n);

   printArray(arr,n);
 }
}
