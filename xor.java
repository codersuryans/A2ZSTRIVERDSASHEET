public class xor {
    public static void main(String[]args){
        int []a={1,2,3,5};
        int n=5;
        int xor1=0;int xor2=0;
        for(int i=0;i<n-1;i++){
            xor2=xor2^a[i];
            xor1=xor1^(i+1);
          
        }
         xor1=xor1^n;
int b=xor1^xor2;
System.out.println(b);
    }
    
}
