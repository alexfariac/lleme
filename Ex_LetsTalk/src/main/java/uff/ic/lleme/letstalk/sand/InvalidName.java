package uff.ic.lleme.letstalk.sand;

/**
 * InvalidName.java . Generated by the IDL-to-Java compiler (portable), version
 * "3.2" from scs.idl Friday, December 9, 2005 9:35:21 PM GMT
 */

public final class InvalidName extends org.omg.CORBA.UserException {
	public String name = null;

	public InvalidName() {
		super(InvalidNameHelper.id());
	} // ctor

	public InvalidName(String _name) {
		super(InvalidNameHelper.id());
		name = _name;
	} // ctor

	public InvalidName(String $reason, String _name) {
		super(InvalidNameHelper.id() + "  " + $reason);
		name = _name;
	} // ctor

} // class InvalidName
