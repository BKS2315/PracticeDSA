/*
#hackerrank
You have three stacks of cylinders where each cylinder has the same diameter, but they may vary in height. 
You can change the height of a stack by removing and discarding its topmost cylinder any number of times.

Find the maximum possible height of the stacks such that all of the stacks are exactly the same height.
 This means you must remove zero or more cylinders from the top of zero or more of the three stacks until they are all the same height, then return the height.

*/


class Result {

    /*
     * Complete the 'equalStacks' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h1
     *  2. INTEGER_ARRAY h2
     *  3. INTEGER_ARRAY h3
     */

    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
    // Write your code here
    int s1=0;
    int s2=0;
    int s3=0;
    for(int i=0 ; i<h1.size() ; i++ ){
        s1+=h1.get(i);
    }
    for(int i=0 ; i<h2.size() ; i++ ){
        s2+=h2.get(i);
    }
    for(int i=0 ; i<h3.size() ; i++ ){
        s3+=h3.get(i);
    }
    
    int min = Math.min(s1,s2);
    min = Math.min(min,s3);
    
    while(min!=s1||min!=s2||min!=s3){
        
        if(s1>min){
            s1-=h1.get(0);
            h1.remove(0);
        }
        if(s2>min){
            s2-=h2.get(0);
            h2.remove(0);
        }
        if(s3>min){
            s3-=h3.get(0);
            h3.remove(0);
        }
        min = Math.min(s1,s2);
        min = Math.min(min,s3);
        
    }
    return min;

    }

}