class Solution {
    public int buyChoco(int[] prices, int money) {
        int minPrice = Integer.MAX_VALUE;
        int secMinPrice = Integer.MAX_VALUE;

        for (int price : prices) {
            if (price < minPrice) {//ager curr less h min s toh min sec mon hoga or curr min ban jayega 
                secMinPrice = minPrice;
                minPrice = price;
            } else {
                secMinPrice = Math.min(secMinPrice, price);//else curr sec min seh chota h 
            }
        }

        if (minPrice + secMinPrice > money) {//nhi lepara h 
            return money;
        }

        return money - (minPrice + secMinPrice);
    }
}