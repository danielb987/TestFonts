/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JTextArea;

/**
 *
 * @author daniel
 */
public class Logger {
	
	private long startTime;
	private JTextArea output;
	
	public void setOutput(JTextArea jTextArea) {
		output = jTextArea;
		startTime = System.currentTimeMillis();
	}
	
	
	public void debug(String msg) {
		long time = System.currentTimeMillis() - startTime;
		String timeStr = Long.toString(time);
		System.out.println("Debug: "+msg);
		output.append(time+": "+msg+"\n");
	}
	
	
}
