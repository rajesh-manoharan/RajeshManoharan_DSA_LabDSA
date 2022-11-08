package com.greatlearning.balancingbrackets;

public class BracketPair {

	private char openpair;
	private char closepair;

	public BracketPair(char openpair, char closepair) {
		this.openpair = openpair;
		this.closepair = closepair;
	}

	public char getOpenpair() {
		return openpair;
	}

	public void setOpenpair(char openpair) {
		this.openpair = openpair;
	}

	public char getClosepair() {
		return closepair;
	}

	public void setClosepair(char closepair) {
		this.closepair = closepair;
	}

}
