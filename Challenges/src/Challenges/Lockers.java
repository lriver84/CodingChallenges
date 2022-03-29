package Challenges;

public class Lockers {

	public static void main(String[] args) {
		System.out.println(locker(100));

	}

	public static int locker(int runs) {
		Boolean[] locker = new Boolean[100];
		int answer = 0;
		int check = 2;

		// true equals open
		// false equals closed
		for (int i = 0; i < locker.length; i++) {
			locker[i] = true;
		}

		while (check <= runs) {
			for (int i = 1; i < locker.length; i+=check) {
				if (locker[i]) {
					locker[i] = false;
				} else {
					locker[i] = true;
				}
			}
			check++;
		}

		for (int i = 0; i < locker.length; i++) {
			if (locker[i]) {
				answer++;
			}
		}
		return answer;
	}
}