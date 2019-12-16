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



class Solution {
public:
	int hammingDistance(int x, int y) {
		int n1[32] = { 0 };
		int n2[32] = { 0 };
		int x1 = abs(x);
		int x2 = abs(y);
		int ind = 0;
		while (x1 != 1 && x1 != 0){
			n1[ind++] = x1 % 2;
			x1 /= 2;
		}
		n1[ind] = x1;
		ind = 0;
		while (x2 != 1 && x2 != 0){
			n2[ind++] = x2 % 2;
			x2 /= 2;
		}
		n2[ind] = x2;
		if (x < 0) n1[31] = 1;
		if (y < 0) n2[31] = 1;
		int res = 0;
		for (int i = 0; i < 32; i++){
			res += ((n1[i] == n2[i]) ? 0 : 1);
		}
		return res;
	}
};