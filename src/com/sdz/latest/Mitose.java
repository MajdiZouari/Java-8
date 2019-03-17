package com.sdz.latest;
/**
 * Created by MZouari on 18/01/2019.
 */
public interface Mitose extends Reproduction {
	public static void description() {
		Reproduction.description();
		System.out.println("Redéfinie dans Mitose.java");
	}
	
	default void reproduire() {
		System.out.println("Je me divise !");
	}
}
