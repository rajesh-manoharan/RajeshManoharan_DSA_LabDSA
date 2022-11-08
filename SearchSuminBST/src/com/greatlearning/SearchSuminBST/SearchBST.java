package com.greatlearning.SearchSuminBST;

import java.util.Set;

public class SearchBST {

	public static boolean findPair(NodeBST root, int target, Set<Integer> set) {
		if (root == null) {
			return false;
		}

		if (findPair(root.left, target, set)) {
			return true;
		}
		if (set.contains(target - root.data)) {
			System.out.println("Pair found (" + (target - root.data) + ", " + root.data + ")");
			return true;
		}else {
			set.add(root.data);
		}
		return findPair(root.right, target, set);
	}
}