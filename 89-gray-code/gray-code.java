class Solution {
    public List<Integer> grayCode(int n) {
       List<Integer> result = new ArrayList<>();//make a new array list

        for (int i = 0; i < (1 << n); i++) {//1<<n=2n
            result.add(i ^ (i >> 1));//1>>1 (binary bit ko ek pos right shift karna) then xor karna 
        }

        return result;   
    }
}