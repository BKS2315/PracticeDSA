import java.util.*;
import java.io.*;
import static java.util.stream.Collectors.toList;
import java.util.stream.*;

public class Main {
   
    public static void ways(int[][]mat, int i,int j,int n){
       if(i>=10||i<0||j>=10||j<0){
           return ;
       }
       if(n==0){
           mat[i][j]=1;
           return ;
       }
     
       
       
        // System.out.println(n);
      
       ways(mat,i+1,j-2,n-1);
       ways(mat,i+1,j+2,n-1);
       ways(mat,i-1,j-2,n-1);
       ways(mat,i-1,j+2,n-1);
       ways(mat,i+2,j-1,n-1);
       ways(mat,i+2,j+1,n-1);
       ways(mat,i-2,j-1,n-1);
       ways(mat,i-2,j+1,n-1);
         
    }
    
    public static int countPos(int[][]mat){
        int count=0;
        for(int i=0 ; i<mat.length ; i++ ){
            
            for(int j=0 ; j<mat.length; j++ ){
            if(mat[i][j]==1 ){
                count++;
            }
        }
            
        }
        return count;
    }
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
        String [] arr = br.readLine().trim().split(" ");
        
        int i =Integer.parseInt(arr[0]);
        int j =Integer.parseInt(arr[1]);
        int n =Integer.parseInt(arr[2]);
        
        int[][] mat = new int[10][10];
        
        i=i-1;
        j=j-1;
        
            
             ways(mat,i,j,n);
             int c = countPos(mat);
             
            System.out.println(c);
            
            br.close();
        }
        
               
    }
            

    

    

