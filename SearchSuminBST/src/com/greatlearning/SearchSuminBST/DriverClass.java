package com.greatlearning.SearchSuminBST;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class DriverClass {
	public static void main(String[] args) {

		int[] keys = { 20, 10, 40, 80, 12, 160, 250 };
		int target;

		NodeBST root = null;
		for (int key : keys) {
			root = InsertBST.insert(root, key);
		}

		System.out.println("Enter target sum to check in BST:");
		try (Scanner sc = new Scanner(System.in);) {
			target = sc.nextInt();
		} catch (Exception e) {
			target =0;
		}

		Set<Integer> set = new HashSet<>();

		if (!SearchBST.findPair(root, target, set)) {
			System.out.println("Pair does not exist");
		}
	}
}
