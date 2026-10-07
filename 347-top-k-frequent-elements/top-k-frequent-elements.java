class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    List<Integer>[] bucket = new List[nums.length + 1];//create bucket of freq and store no as it group all elmts by thwere freq
    Map<Integer, Integer> frequencyMap = new HashMap<>();//store freq

    for (int n : nums) {//pouplate freq map
      frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
    }

    for (int key : frequencyMap.keySet()) {//populate bucket as itrate in map as in keys and group elmt
      int frequency = frequencyMap.get(key);
      if (bucket[frequency] == null) {//bucket m elmts hai
        bucket[frequency] = new ArrayList<>();
      }
      bucket[frequency].add(key);
    }

    List<Integer> result = new ArrayList<>();//stroe hiiest freq
    for (int pos = bucket.length - 1;pos >= 0 && result.size() < k; pos--) {//reverse seh itarte in buckets
      if (bucket[pos] != null) {//buckets m elmts hai to result m add
        result.addAll(bucket[pos]);
      }
    }

    return result.stream().mapToInt(i -> i).toArray();//store list to int
    }
}