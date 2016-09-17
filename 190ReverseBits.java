public int reverseBits(int n) {
	int result = 0;
	for (int i = 0; i < 32; i++) {
		result |= (n >> i & 0x1) << (31 - i); // 取得n特定位的值，设置到result特定位中
	}
	return result;
}