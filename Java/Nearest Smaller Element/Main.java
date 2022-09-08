import java.io.*;
import java.lang.*;
import java.util.*;


class Main{

  public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int t = Integer.parseInt(br.readLine());
      for(int j = 0 ; j < t; j ++){
          
      int n = Integer.parseInt(br.readLine());
      int[] arr = Arrays.stream(br.readLine()
      .split(" ")).mapToInt(st -> {return Integer.parseInt(st);}).toArray();

          
  Stack<Integer> stk1 = new Stack<>();
  Stack<Integer> stk2 = new Stack<>();
  
  int[] left = new int[n];
  int[] right = new int[n];
  

  for (int k = 0,l=n-1; k < n && l >=0; k++,l--) {
    
    
    while(!stk1.isEmpty() && arr[stk1.peek()] >= arr[k]) {
      stk1.pop();
    }
    
    if (stk1.isEmpty()) {
      left[k] = -1;
    }
    else {
      left[k]= stk1.peek();
    }
    stk1.push(k);
    
    
    
    while(!stk2.isEmpty() && arr[stk2.peek()] >= arr[l]) {
      stk2.pop();
    }
    if (stk2.isEmpty()) {
      right[l] = -1;
    }
    else {
      right[l] = stk2.peek();
    }
    stk2.push(l);

  }

  
  StringBuilder ans = new StringBuilder();
  for (int i = 0; i < n; i++) {
// 	  System.out.println("\n" + i +" ->>>" +right[i] + " " + left[i]);
	  if(right[i] == -1 && left[i] == -1)ans.append("-1" + " ");
	  
	  else if(right[i] == -1)ans.append(arr[left[i]] + " ");
	  else if(left[i] == -1)ans.append(arr[right[i]] + " ");
	  
	  else if(right[i]-i < i-left[i])ans.append(arr[right[i]]+ " ");
	  else ans.append(arr[left[i]] + " ");
	  

  } 
  System.out.println(ans);


  
}

      }

}