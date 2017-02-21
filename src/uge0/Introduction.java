package uge0;

import java.io.*;
import java.util.*;

public class Introduction
{
	// This method takes two integers as input and must
	// return the sum of these two integers.
	private int calculateSum(int a, int b) {
		int sum = a + b;

		return sum;
	}


	// ##################################################
	// # You do not need to modify anything below here. #
	// ##################################################

	public static void main(String[] args) throws IOException {
		new Introduction().run();
	}

	private void run() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		System.out.println(calculateSum(a, b));
	}
}