
/* IMPORTANT: Multiple classes and nested static classes are supported */

package dailyhomework;
 
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/*

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {

        String name;
        List<String> list=new ArrayList<String>();
//        int count=0;
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File("./data/new.txt"))));
        while((name = br.readLine())!=null)
        {
            list.add(name);   // Writing output to STDOUT
        }
            
        int n=list.size()-2;
        String[][] input=new String[n][n];
        
        String s[];
        
        for(int i=2;i<list.size();i++)
        {
            s=list.get(i).split(" ");
            for(int j=0;j<s.length;j++)
            {
                input[i-2][j]=s[j];
            }
        }
        int count1 = 0;
        int k = Integer.parseInt((list.get(1).split(" "))[1]);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
               if(input[i][j].equals("C")){
                  if(j<k || j+k<n+1){
                      if(input[i][j+k].equals("M")){
                          count1++;
                          input[i][j+k]="T";
                      }
                  }
                  else if(j+k==n+1){
                      if(input[i][j-k].equals("M")){
                          count1++;
                          input[i][j-k]="T";
                      }
                  }
                  else{
                      if(input[i][j-k].equals("M")){
                          count1++;
                          input[i][j-k]="T";
                          break;
                      }
                      if(input[i][j+k].equals("M")){
                          count1++;
                          input[i][j+k]="T";
                          break;
                      }
                  }
               }
            }
        }
        System.out.println(count1);
    }
}
