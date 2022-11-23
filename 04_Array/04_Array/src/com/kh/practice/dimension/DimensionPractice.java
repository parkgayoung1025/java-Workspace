package com.kh.practice.dimension;

public class DimensionPractice {

	public void practice1() {

		String[][] arr = new String[3][3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print("(" + i + ", " + j + ") ");
			}
			System.out.println();
		}
	}

	public void practice2() {

		int[][] arr = new int[4][4];

		int e = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = e++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice3() {

		int[][] arr = new int[4][4];

		int e = 16;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = e--;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void practice4() {
		
		int[][] arr = new int[4][4];
		
		int e = 16;
		int b = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = e++;
				if(i>2)
				System.out.print(arr[i][j] + " ");
				b += j;
			}
			System.out.println();
		}
		
	}

	public void practice5() {

		
	}

	public void practice6() {

	}

	public void practice7() {

	}

	public void practice8() {

	}

	public void practice9() {

	}
}
