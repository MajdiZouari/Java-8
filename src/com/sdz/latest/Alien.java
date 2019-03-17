package com.sdz.latest;
/**
 * Created by MZouari on 18/01/2019.
 */
public class Alien implements Pondre, Mitose {

	public void reproduire() {
		
		System.out.println("Je suis un alien et :");
		Pondre.super.reproduire();
		Mitose.super.reproduire();
		Mitose.description();

	}
}