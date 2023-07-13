
class Solution {
    public static boolean isFrequencyUnique(int n, int[] arr) {
        // code here

        // Hashmap to store the key value pair as i and occurance of i as value

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : arr)
            map.put(x, map.getOrDefault(x, 0) + 1);

        // Iterating over the map to check duplicates using set

        HashSet<Integer> set = new HashSet<>();

        for (int x : map.values()) {
            if (set.contains(x))
                return false;

            set.add(x);

        }
        return true;
    }
}
