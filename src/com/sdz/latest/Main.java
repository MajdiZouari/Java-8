package com.sdz.latest;
/**
 * Created by MZouari on 18/01/2019.
 */
public class Main {

	public static void main(String[] args) {
		Reproduction.description();
		Pondre.description();
		Mitose.description();		
		Alien alien = new Alien();
		alien.reproduire();
	}
}
