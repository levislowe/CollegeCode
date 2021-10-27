package loop;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Container;
import javax.swing.JTextField;

public class LoopDemo {
	public static void main(String[] args) {
		Random gen = new Random();
		int value = gen.nextInt(10);
		System.out.println(value);
		//int value = 0;
		///*
		System.out.println("start");
		while( value < 2000000000 ) {
			value = gen.nextInt(10);
			System.out.println(value);
			
			//value++;
		}
		//*/
		/*
		while( gen/nextInt(1000000000) < 999999995);
		System.out.println("nt n");
		System.out.println("done");
		//*/
		System.out.println("stop");
	}

}
