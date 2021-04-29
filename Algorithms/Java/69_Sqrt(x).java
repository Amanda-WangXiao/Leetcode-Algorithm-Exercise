class Solution {	//	1 ms	36.7 MB
		public int mySqrt(int x) {
			int l = 0;
			int r = x;
			int result = -1;
			while (l <= r) {
				int mid = l + (r - l) / 2;
				if ((long)mid * mid <= x) {
						result = mid;
						l = mid + 1;
				}
				else {
						r = mid - 1;
						}
				}
				return result;
		}
}