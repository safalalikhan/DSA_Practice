import java.io.*;
import java.util.*;
import java.lang.*;

class Main{

  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      TreeMap<Integer,Integer> jim = new TreeMap<>();
      
      for(int j = 0 ; j < n; j ++){
          int x = s.nextInt();
          if(jim.get(x) == null)jim.put(x,0);
      }
      int m = s.nextInt();
      TreeMap<Integer,Integer> pam = new TreeMap<>();
      for(int j = 0 ; j < m; j ++){
          int x = s.nextInt();
          if(pam.get(x) == null)pam.put(x,0);
      }
      boolean check = true;
      for(int x : pam.keySet())
      if(jim.get(x) == null)check = false;
      for(int x : jim.keySet())
      if(pam.get(x) == null)check = false;

System.out.print(check ? "Yes" : "No");
    }
}