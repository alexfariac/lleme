package uff.ic.lleme.letstalk.sand;

/**
 * AlreadyConnected.java . Generated by the IDL-to-Java compiler (portable),
 * version "3.2" from scs.idl Friday, December 9, 2005 9:35:21 PM GMT
 */

public final class AlreadyConnected extends org.omg.CORBA.UserException {

	public AlreadyConnected() {
		super(AlreadyConnectedHelper.id());
	} // ctor

	public AlreadyConnected(String $reason) {
		super(AlreadyConnectedHelper.id() + "  " + $reason);
	} // ctor

} // class AlreadyConnected
