class Solution {

    public int[] smallestRange(List<List<Integer>> nums) {
        List<int[]> merged = new ArrayList<>();

        // Merge all lists with their list index
        for (int i = 0; i < nums.size(); i++) {
            for (int num : nums.get(i)) {
                merged.add(new int[] { num, i });
            }
        }

        // Sort the merged list
        merged.sort(Comparator.comparingInt(a -> a[0]));

        // Two pointers to track the smallest range
        Map<Integer, Integer> freq = new HashMap<>();
        int left = 0, count = 0;
        int rangeStart = 0, rangeEnd = Integer.MAX_VALUE;

        for (int right = 0; right < merged.size(); right++) {
            freq.put(
                merged.get(right)[1],
                freq.getOrDefault(merged.get(right)[1], 0) + 1
            );
            if (freq.get(merged.get(right)[1]) == 1) count++;

            // When all lists are represented, try to shrink the window
            while (count == nums.size()) {
                int curRange = merged.get(right)[0] - merged.get(left)[0];
                if (curRange < rangeEnd - rangeStart) {
                    rangeStart = merged.get(left)[0];
                    rangeEnd = merged.get(right)[0];
                }

                freq.put(
                    merged.get(left)[1],
                    freq.get(merged.get(left)[1]) - 1
                );
                if (freq.get(merged.get(left)[1]) == 0) count--;
                left++;
            }
        }

        return new int[] { rangeStart, rangeEnd };
    }
}