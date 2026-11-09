
class Solution {
    public int[][] reconstructQueue(int[][] people) {

        Arrays.sort(people, (a, b) -> {
            if (a[0] == b[0]) {//if dsame heigth sort k in ass oder if diff height sort in decc order
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(b[0], a[0]);
        });

        List<int[]> list = new ArrayList<>();//emty arr list

        for (int i = 0; i < people.length; i++) {
            int k = people[i][1];//get 2 value of curr pos

            list.add(k, people[i]);//insert at  index k and shift existing elments to rigjt
        }

        return list.toArray(new int[people.length][]);//convert arr list to 2d arr
    }
}
