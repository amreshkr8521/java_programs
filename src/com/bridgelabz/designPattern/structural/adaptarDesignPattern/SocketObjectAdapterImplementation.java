package com.bridgelabz.structural.adaptarDesignPattern;

/**
 * this class extends the Sockets class and implements
 * AdapterDesignPaternServices interface
 * 
 * @author Amresh kumar
 *
 */
public class SocketObjectAdapterImplementation implements AdapterDesignPaternServices {

	private Sockets sock = new Sockets();

	@Override
	public Volt get120volt() {
		return sock.getVolt();
	}

	@Override
	public Volt get12volt() {
		Volt v = sock.getVolt();
		return convertVolt(v, 10);
	}

	@Override
	public Volt get3volt() {
		Volt v = sock.getVolt();
		return convertVolt(v, 40);
	}

	/**
	 * To return the new object of Volt
	 * 
	 * @param v --> Volt
	 * @param i --> Integer
	 * @return Volt
	 */
	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts() / i);
	}

}
