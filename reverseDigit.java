public int digitreverse(int n) {
	int r = 0;
	while(n!=0) {
		r = r*10+d%10;
		d = d/10;
	}

	return r;
}
