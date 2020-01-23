import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static void main(String[] args) {
     int c=0;
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        HashSet <String> h1=new HashSet<String>();
        for(int j=0;j<pair_left.length;j++)
        {
            h1.add(pair_left[j]);
            h1.add(pair_right[j]);
        }
        Iterator <String> i=h1.iterator();
        while(i.hasNext())
        System.out.println(i.next());
    }
}