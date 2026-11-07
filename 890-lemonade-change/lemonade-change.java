class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten  = 0;

        for (int bill : bills) {
            if (bill == 5) {//kuch return nhi karana bass 5++
                five++;
            } else if (bill == 10) { // return 5 dena h
                if (five > 0) {//ab count check kiya
                    five--;
                    ten++;
                } else {
                    return false;
                }
                
            } else if (five > 0 && ten > 0) {//ab 20 ka deya toh 15 dena h (10 5)deya
                five--;
                ten--;
            } else if (five >= 3) { //5 5 5 deya
                five = five- 3;
            } else {
                return false;
            }
        }
        return true;
    }
}