package uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs;

/**
 * corbaObjects/scs/ReceptacleDescriptionHolder.java . Generated by the
 * IDL-to-Java compiler (portable), version "3.2" from scs.idl Sexta-feira, 9 de
 * Dezembro de 2005 18h26min27s BRST
 */

public final class ReceptacleDescriptionHolder implements
		org.omg.CORBA.portable.Streamable {
	public uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ReceptacleDescription value = null;

	public ReceptacleDescriptionHolder() {
	}

	public ReceptacleDescriptionHolder(
			uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ReceptacleDescription initialValue) {
		value = initialValue;
	}

	public void _read(org.omg.CORBA.portable.InputStream i) {
		value = uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ReceptacleDescriptionHelper.read(i);
	}

	public void _write(org.omg.CORBA.portable.OutputStream o) {
		uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ReceptacleDescriptionHelper.write(o, value);
	}

	public org.omg.CORBA.TypeCode _type() {
		return uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ReceptacleDescriptionHelper.type();
	}

}
