class Solution {
  public int maxProduct(int[] A) {
    int n = A.length;
    
    double l = 0, r = 0, res = A[0];
  
    for (int i = 0; i < n; i++) {
        l =  (l == 0 ? 1 : l) * (double) A[i];
        r =  (r == 0 ? 1 : r) * (double) A[n - 1 - i];
        res = Math.max(res, Math.max(l, r));
    }
    return (int) res;
  }
}