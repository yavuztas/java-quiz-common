package org.java.quiz;

import java.util.LinkedList;
import java.util.List;

/**
 * Solution for Train Composition implementation
 * 
 * @author Yavuz Tas
 *
 */
public class TrainComposition {

	private List<Integer> chain = new LinkedList<>();

	public void attachWagonFromLeft(int wagonId) {
		chain.add(0, wagonId);
	}

	public void attachWagonFromRight(int wagonId) {
		chain.add(chain.size(), wagonId);
	}

	public int detachWagonFromLeft() {
		return chain.remove(0);
	}

	public int detachWagonFromRight() {
		return chain.remove(chain.size() - 1);
	}

	public static void main(String[] args) {
		TrainComposition tree = new TrainComposition();
		tree.attachWagonFromLeft(7);
		tree.attachWagonFromLeft(13);
		System.out.println(tree.detachWagonFromRight()); // 7
		System.out.println(tree.detachWagonFromLeft()); // 13
	}
}