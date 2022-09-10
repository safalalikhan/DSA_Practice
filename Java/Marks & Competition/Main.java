import java.io.*;
import java.util.*;
import java.lang.*;

class Main{
  public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      
   int n = s.nextInt();
   ArrayList<Integer> marks = new ArrayList<>();

   for(int i = 0 ; i < n ; i++){
       marks.add(s.nextInt());
   }
  ArrayList<Integer> ans = new ArrayList<>();
    int max = -1;
    for(int i = n-1; i >= 0; i--){
        int x = marks.get(i);
        if(x >= max){
            ans.add(x);
            max = x;
        }
    }
    for(int i = ans.size()-1; i >= 0; i--){
        System.out.print(ans.get(i) + " ");
    }
 
    }
}