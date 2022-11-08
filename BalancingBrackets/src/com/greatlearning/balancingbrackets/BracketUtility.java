package com.greatlearning.balancingbrackets;

import java.util.HashSet;
import java.util.Set;

public class BracketUtility {

	static Set<BracketPair> bracketPairSet = new HashSet<>();
	static {

		BracketPair one = new BracketPair('(', ')');
		BracketPair two = new BracketPair('[', ']');
		BracketPair three = new BracketPair('{', '}');

		bracketPairSet.add(one);
		bracketPairSet.add(two);
		bracketPairSet.add(three);

	}

	static BracketPair getBracketPair(Character closeparanthesis) {
		for (BracketPair aBracketPair : bracketPairSet) {
			if (aBracketPair.getClosepair() == closeparanthesis) {
				return aBracketPair;
			}
		}
		return null;
	}
	
	static Set<Character> getOpenBrackets() {
		Set<Character> Openbrackset = new HashSet<> ();
		for (BracketPair aBracketPair: bracketPairSet) {
			Openbrackset.add(aBracketPair.getOpenpair());
		}
		return Openbrackset;
	}

	static Set<Character> getCloseBrackets() {
		Set<Character> Closebrackset = new HashSet<> ();
		for (BracketPair aBracketPair: bracketPairSet) {
			Closebrackset.add(aBracketPair.getClosepair());
		}
		return Closebrackset;
	}
	
}
