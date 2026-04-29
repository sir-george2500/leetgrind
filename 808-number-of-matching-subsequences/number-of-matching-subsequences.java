class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        // Build position index: for each char, store sorted positions in s
        List<List<Integer>> charPositions = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            charPositions.add(new ArrayList<>());
        }
        for (int i = 0; i < s.length(); i++) {
            charPositions.get(s.charAt(i) - 'a').add(i);
        }

        int count = 0;
        for (String word : words) {
            if (isSubsequence(word, charPositions)) {
                count++;
            }
        }
        return count;
    }

    private boolean isSubsequence(String word, List<List<Integer>> charPositions) {
        int prevPos = -1;
        for (int i = 0; i < word.length(); i++) {
            List<Integer> positions = charPositions.get(word.charAt(i) - 'a');
            // Binary search for first position > prevPos
            int idx = upperBound(positions, prevPos);
            if (idx == positions.size()) {
                return false; // no valid position found
            }
            prevPos = positions.get(idx);
        }
        return true;
    }

    private int upperBound(List<Integer> positions, int target) {
        int lo = 0, hi = positions.size();
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (positions.get(mid) <= target) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }
}