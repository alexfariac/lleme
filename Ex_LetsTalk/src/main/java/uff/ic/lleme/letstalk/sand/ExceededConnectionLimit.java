package uff.ic.lleme.letstalk.sand;

/**
 * ExceededConnectionLimit.java . Generated by the IDL-to-Java compiler
 * (portable), version "3.2" from scs.idl Friday, December 9, 2005 9:35:21 PM
 * GMT
 */

public final class ExceededConnectionLimit extends org.omg.CORBA.UserException {

	public ExceededConnectionLimit() {
		super(ExceededConnectionLimitHelper.id());
	} // ctor

	public ExceededConnectionLimit(String $reason) {
		super(ExceededConnectionLimitHelper.id() + "  " + $reason);
	} // ctor

} // class ExceededConnectionLimit
