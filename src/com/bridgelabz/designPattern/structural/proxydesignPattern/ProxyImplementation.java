package com.bridgelabz.structural.proxydesignPattern;

/**
 * 
 * To implement the Interface Proxy and implement all the method of interface
 * 
 * @author Amresh Kumar
 * @since 10-12-2019
 *
 */
public class ProxyImplementation implements InterfacePoxy {

	@Override
	public void runCommand(String cmd) throws Exception {
		Runtime.getRuntime().exec(cmd);
		System.out.println("'" + cmd + "' command executed.");

	}

}
