package day2;

public class Position {
	int horizontal;
	int depth;
	
	public Position() {
		horizontal = 0;
		depth = 0;
	}
	
	int forward(int x) {
		depth += x;
		return depth;
	}
	
	int down (int x) {
		horizontal += x;
		return horizontal;
	}
	
	int up (int x) {
		horizontal -= x;
		return horizontal;
	}

}
