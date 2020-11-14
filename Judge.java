import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Judge {

	public int findJudge (int N, int [][] trust)  {
		int[] counter = new int[N+1]; // Counter from 1 to N
		for(int[] people : trust) {
			// a trust b when a counter[a]-- and counter[b]++ which means increase trust for B
			counter[people[0]]--;
			counter[people[1]]++;
		}
	for(int i = 1; i <= N; i++) {
		// Iterating counter, if not found, N-1
		if(counter[i] == N-1)
			return i;
	}

	return -1; // Judge can't be found

	}

	public static void main(String[] args) {
		Judge a = new Judge (); // Create object for testing

		int N = 3; 

		// Testing all input + outputs 

		int trust1 [][] = {{1,2}};
		int trust2 [][] = {{1,3},{2,3}};
		int trust3 [][] = {{1,3},{2,3},{3,1}};
		int trust4 [][] = {{1,2},{2,3}};
		int trust5 [][] = {{1,3},{1,4},{2,3},{2,4},{4,3}};

		System.out.println("Example 1 Output " + a.findJudge(N-1, trust1));
		System.out.println("Example 2 Output: " + a.findJudge(N, trust2));
		System.out.println("Example 3 Output: " + a.findJudge(N, trust3));
		System.out.println("Example 4 Output: " + a.findJudge(N, trust4));
		System.out.println("Example 5 Output: " + a.findJudge(N+1, trust5));





	}


}
