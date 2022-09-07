import java.io.*;
import java.util.*;
import java.lang.*;
class Main{

  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    
    for(int i = 0; i < t; i++) {
      int n = s.nextInt();
      int sum = 0;
      StringBuilder str =  new StringBuilder();
      for(int j = 0 ; j < n; j ++){
          sum += s.nextInt();
          str.append(sum + " ");
      }
      System.out.println(str.toString());
    }
  }
}