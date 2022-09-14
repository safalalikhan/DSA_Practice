import java.io.*;
import java.util.*;

class Main{

  public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int sum = 0;
      int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(st -> {return Integer.parseInt(st);}).toArray();
     
      for(int i : arr) {
    	  sum+= i;
    	  System.out.println(i);
      }
  }
}