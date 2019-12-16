class Solution {
public:
	int hammingDistance(int x, int y) {
		int num = x ^ y;
		int flag = 1;
		int res = 0;
		while (num){
			res += num & flag;
			num = num >> 1;
		}
		return res;
	}
};