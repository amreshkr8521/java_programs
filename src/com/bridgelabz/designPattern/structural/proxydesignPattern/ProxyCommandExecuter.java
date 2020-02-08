package com.bridgelabz.structural.proxydesignPattern;

/**
 * To implement the Interface Proxy and implement all the method of interface
 * and apply some command to set the restiction to the non admin
 * 
 * @author Amresh Kumar
 * @since 10-12-2019
 *
 */
public class ProxyCommandExecuter implements InterfacePoxy {

	private boolean isAdmin;
	private InterfacePoxy executor;

	@Override
	public void runCommand(String cmd) throws Exception {
		if (isAdmin) {
			executor.runCommand(cmd);
		} else {
			if (cmd.trim().startsWith("rm")) {
				throw new Exception("rm command is not allowed for non-admin users.");
			} else {
				executor.runCommand(cmd);
			}
		}

	}

	// constructor of this class
	public ProxyCommandExecuter(String user, String pwd) {
		if ("Amreshkr".equals(user) && "Amresh123".equals(pwd))
			isAdmin = true;
		executor = new ProxyImplementation();
	}

}
