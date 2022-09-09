import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.lang.*;

class Main{


  public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      
      int n = s.nextInt();

      int[] stack = new int[n];
      int top = -1;
      int[] queue = new int[n];
      int front =0,rear = 0;
      
      while (true){
          if(n == 0)break;
          int query = s.nextInt();

          if(query == 1){
           int x = s.nextInt();
           queue[rear] = x;;
           rear ++;
          }              

          else if(query == 2){
           int x = s.nextInt();
           top ++;
           stack[top] = x; 
          }          
          else if(query == 3){
           if(front == rear){
               System.out.println("-1");
           }
           else{
               System.out.println(queue[front]);
           }    
          }
          else if(query == 4){
           if(top == -1){
               System.out.println("-1");
           }
           else {
               System.out.println(stack[top]);
           }      
          }
          else if(query == 5){
           if(front == rear){
               System.out.println("-1");
           }
           else{
               top++;
               stack[top] = queue[front];
               front++;
           }     
          }          
          
          
     n--;
     
      }
 
    }
}