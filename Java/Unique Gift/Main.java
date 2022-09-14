import java.util.*;

class Main{
    

  public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
    //   System.out.println(n);
      
    for(int q = 0 ; q < n ; q ++){
    	
    String value = s.next();     
    String[] str = value.split("");
    
    Stack<String> stk = new Stack<>();
    StringBuilder ans = new StringBuilder();
    HashMap<String,Integer> m = new HashMap<>();
    
    
    for(int i = 0 ; i < str.length; i++){
        Integer t = m.get(str[i]);
        
        if( t == null){
            m.put(str[i],1);
            stk.push(str[i]);
        }
        else m.put(str[i],t+1);

        if(m.get(str[i]) >= 2){
            stk.remove(str[i]);
        }
        if(!stk.empty()){
            ans.append(stk.get(0));
        }
        else ans.append("#");
        
    }
    System.out.println(ans);

    }
    s.close();
}
}