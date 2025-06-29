import java.util.*;

public class MainApp{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];

    Utils.arrayInput(arr,n,sc);
   
    HashMap<Integer,Integer> map = new HashMap<>();
    List<Integer> ans = new ArrayList<>();
    
    int min = (int) Math.floor(n/3)+1;
    for(int i=0;i<n;i++){
      map.put(arr[i],map.getOrDefault(arr[i],0)+1);
      if(map.get(arr[i]) == min)ans.add(arr[i]); 

    }
   System.out.println(ans);
    
    
  }
}
