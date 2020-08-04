public class Main
{
    public static void main(String[] args){
        //System.out.println(power(3,3));
        //System.out.println(factorial(4));
        //System.out.println(fibanocci(5));
        //System.out.println(subseq("abc",""));
        
    }
    public static int power(int number,int pow){
        if(pow==0) return 1;
        int subproblem=power(number,pow-1);
        return subproblem*number;
    }
    public static int factorial(int number){
        if(number==0|| number ==1){
            return 1;
        }
        return number*factorial(number-1);
    }
    //print elements from that index
    public static void print(int[] arr,int index){
        if(index==arr.length) return ;
        System.out.print(arr[index]+" ");
        print(arr,index+1);
    }
    //check whether element is present in the array
    public static boolean find(int[] arr,int idx,int num){
        if(idx==arr.length) return false;
        if(arr[idx]==num) return true;
        return find(arr,idx+1,num);
    }
    //maximum element in an array
    public static int maximum(int[] arr,int index){
        if(index==arr.length) return arr[index];
        int subproblem=maximum(arr,index+1);
        return Math.max(subproblem,arr[index]);
    }
    //minimum element in an array
    public static int minimum(int[] arr,int index){
        if(index==arr.length) return arr[index];
        int subproblem=minimum(arr,index+1);
        return Math.min(subproblem,arr[index]);
    }
    //fibanocci
    public static int fibanocci(int num){
        if(num==0) return 0;
        if(num==1) return 1;
        int subproblem1=fibanocci(num-1);
        int subproblem2=fibanocci(num-2);
        return subproblem1+subproblem2;
    }
    public static int subseq(String question,String ans){
        if(question.length()==0){
            System.out.print(ans+" ");
            return 1;
        }
        int count=0;
        count+=subseq(question.substring(1),ans+question.charAt(0));
        count+=subseq(question.substring(1),ans);
        return count;
        
    }
}
