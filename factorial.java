public class factorial {
    static int fact(int n){
        if(n==1|| n==0){
            return 1;   //base condition
        }
        return n*fact(n-1);   //recursion call
    }
    public static void main(String[] args){
        int n=3;
        int result = fact(n);
        System.out.println("factorial:"+result);
    }
    
}
