package uge2;

import java.io.*;
import java.util.*;

public class Merge
{
	// This method takes two sorted arrays of integers as input parameters
	// and it should return one sorted array of integers.
	private int[] merge(int[] A1, int[] A2) {
		// TODO: Implement this
		return A1;
	}

	// ##################################################
	// # You do not need to modify anything below here. #
	// ##################################################

	public static void main(String[] args) throws IOException {
		new Merge().run();
	}

	private void run() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		// Read numbers for first array
		int[] A1 = readIntArray(in);
		// Read numbers for second array
		int[] A2 = readIntArray(in);

		// Call merge method to merge the two arrays
		int[] solution = merge(A1, A2);

		// Output the result from the merge function
		for (int i = 0; i < solution.length; i++) {
			System.out.print(solution[i] + " ");
		}
	}

	private int[] readIntArray(BufferedReader in) throws IOException {
		// First read length of input data
		int length = Integer.parseInt(in.readLine());
		
		// Now read the actual values
		int[] array = new int[length];
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		for (int i = 0; i < length; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		return array;
	}
}