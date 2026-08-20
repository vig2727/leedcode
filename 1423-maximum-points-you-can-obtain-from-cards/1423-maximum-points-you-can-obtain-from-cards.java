class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int currentScore = 0;
        
        // 1. Take the first k elements from the left side
        for (int i = 0; i < k; i++) {
            currentScore += cardPoints[i];
        }
        
        int maxScore = currentScore;
        
        // 2. Slide the window: swap left elements out for right elements
        for (int i = 0; i < k; i++) {
            currentScore -= cardPoints[k - 1 - i]; // drop from left
            currentScore += cardPoints[n - 1 - i]; // pick from right
            maxScore = Math.max(maxScore, currentScore); // update best score
        }
        
        return maxScore;
    }
}
