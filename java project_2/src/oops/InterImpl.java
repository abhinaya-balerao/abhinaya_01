package oops;

import modifiers.Inter1;
import modifiers.Inter2;

public class InterImpl implements Inter1, Inter2{

	@Override
	public void m3() {
		System.out.println("m3");
	}

	@Override
	public void m4() {
		System.out.println("m4");
	}

	@Override
	public int m5(String str) {
		return str.length();
	}

}
