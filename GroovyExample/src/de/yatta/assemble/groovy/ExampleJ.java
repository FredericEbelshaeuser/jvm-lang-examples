package de.yatta.assemble.groovy;

public class ExampleJ {
	public static void main(String[] args) {
		System.out.println(gaussify(0, 100));
		gaussifyLiggetSe();
	}

	private static int gaussify(int a, int r) {

		int sum = a;
		for (int i = 0; i <= r; i++) {
			sum += i;
		}
		return sum;
	}
	
	/**
	 * Er legte die Antwort mit den Worten in Braunschweiger Plattdeutsch „Ligget se“ (svw: „Hier liegt sie“) dem Lehrer auf den Tisch
	 */
	private static void gaussifyLiggetSe() {

		int lower =1;
		int outer=100;
		int sum=0;
		while(lower<outer){
			sum+=lower++ + outer--;
		}
		System.out.println(sum);
	}
}
