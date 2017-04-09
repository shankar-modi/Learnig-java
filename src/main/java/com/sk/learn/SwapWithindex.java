package com.sk.learn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import javax.sound.midi.Synthesizer;

public class SwapWithindex {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		int[] arr = new int[N];

		String arrStr = br.readLine();

		String[] array = arrStr.split(" ");

		for (int i = 0; i < array.length; i++) {
			arr[i] = Integer.parseInt(array[i]);
		}
		int Q = Integer.parseInt(br.readLine());

		for (int i = 0; i < Q; i++) {
			String query = br.readLine();
			String[] queryArr = query.split(" ");
			int L = Integer.parseInt(queryArr[0]);
			int R = Integer.parseInt(queryArr[1]);
			System.out.println("L" + L+ "  R " + R);
			int count = 0;
			for (int j = 0; j < arr.length; j++) {

				if (L == j || R == j) {
					System.out.println(j);
					int lastIndex = N - j - 1;
					int temp = arr[lastIndex];
					arr[lastIndex] = arr[j];
					arr[j] = temp;
					count++;

				}

				if (count == 2) {
					break;
				}
			}
			
			System.out.println(Arrays.toString(arr));

		}
		for (int i = 0; i < N; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
