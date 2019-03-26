import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        for(int i = sc.nextInt(); i > 0; i--){
            
            int n = sc.nextInt();
            int k = sc.nextInt();
            List<Integer> myList = new ArrayList<>();
            int n1 = n;
            while(n-- > 0)
                myList.add(sc.nextInt());
            boolean b = false;
            Collections.sort(myList);
            while(n1-- > 0)
            {
                Integer first = myList.get(0);
                myList.remove(first);
                if(Collections.binarySearch(myList, k - first) >= 0)
                {
                    b = true;
                    sb.append("True\n");
                    break;
                }  
            }
            if(!b)
                sb.append("False\n");
        }
        
        System.out.println(sb);
                
    }
}