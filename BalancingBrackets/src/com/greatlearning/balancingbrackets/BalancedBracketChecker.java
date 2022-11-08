package com.greatlearning.balancingbrackets;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class BalancedBracketChecker {

	private String brackets;
	private Set<Character> OpenbracketSet;
	private Set<Character> ClosebracketSet;
	private Stack<Character> bracketstack;

	public BalancedBracketChecker(String brackets) {
		this.brackets = brackets;

		OpenbracketSet = new HashSet<>();
		ClosebracketSet = new HashSet<>();

		bracketstack = new Stack<>();
	}

	public boolean bracketcheck() {

		boolean validChar = false;

		for (int index = 0; index < brackets.length(); index++) {
			char acharacter = brackets.charAt(index);
			char popchar;
			OpenbracketSet = BracketUtility.getOpenBrackets();
			ClosebracketSet = BracketUtility.getCloseBrackets();

			if (OpenbracketSet.contains(acharacter)) {
				bracketstack.push(acharacter);
				validChar = true;
			} else if (ClosebracketSet.contains(acharacter)) {
				try {
					popchar = bracketstack.pop();
				} catch (Exception e) {
					popchar = ' ';
				}
				if (BracketUtility.getBracketPair(acharacter).getOpenpair() == popchar) {
					continue;
				} else {
					return false;
				}
			}
		}
		if (!bracketstack.isEmpty()) {
			return false;
		}

		if (!validChar) {
			return false;
		}
		return true;
	}
}
