package uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs;

/**
 * corbaObjects/scs/NoConnection.java . Generated by the IDL-to-Java compiler
 * (portable), version "3.2" from scs.idl Sexta-feira, 9 de Dezembro de 2005
 * 18h26min26s BRST
 */

@SuppressWarnings("serial")
public final class NoConnection extends org.omg.CORBA.UserException {

	public NoConnection() {
		super(NoConnectionHelper.id());
	} // ctor

	public NoConnection(String $reason) {
		super(NoConnectionHelper.id() + "  " + $reason);
	} // ctor

} // class NoConnection
