package uff.ic.lleme.letstalk.sand;

/**
 * ComponentCollectionHolder.java . Generated by the IDL-to-Java compiler
 * (portable), version "3.2" from deployment.idl Saturday, December 10, 2005
 * 1:24:06 AM GMT
 */

public final class ComponentCollectionHolder implements
		org.omg.CORBA.portable.Streamable {
	public ComponentCollection value = null;

	public ComponentCollectionHolder() {
	}

	public ComponentCollectionHolder(ComponentCollection initialValue) {
		value = initialValue;
	}

	public void _read(org.omg.CORBA.portable.InputStream i) {
		value = ComponentCollectionHelper.read(i);
	}

	public void _write(org.omg.CORBA.portable.OutputStream o) {
		ComponentCollectionHelper.write(o, value);
	}

	public org.omg.CORBA.TypeCode _type() {
		return ComponentCollectionHelper.type();
	}

}
