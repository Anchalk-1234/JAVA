class Solution {
    public int getSum(int a, int b) {
       while(b !=0){//jab tak carry 0 nhi hojati
        int temp =(a&b)<<1;//a & b k sath as and  left shift 1 (phle h and karleya tab a b assighn kiya )
        
        a=a^b;//as 1 karek karo toh hamesh 1 h ata h but carry k leye

        b=temp;//purani a use k leye temp banyah taki hum orignal use karsake
       } 
       return a;

    }
}