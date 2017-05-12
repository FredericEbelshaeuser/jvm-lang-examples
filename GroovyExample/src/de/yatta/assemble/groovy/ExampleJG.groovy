package de.yatta.assemble.groovy

class ExampleJG {

	public static void main(String[] args) {
		System.out.println(gaussify(0, 100));
		System.out.println(gaussify2(0, 0..100));
	}

	private static int gaussify(int a, int r) {

		int sum = a;
		for (int i = 0; i <= r; i++) {
			sum += i;
		}

		return sum;
	}

	private static int gaussify2(int a, r) {

		int sum = a;
		for(i in r)
			sum += i;

		sum;
	}
}
