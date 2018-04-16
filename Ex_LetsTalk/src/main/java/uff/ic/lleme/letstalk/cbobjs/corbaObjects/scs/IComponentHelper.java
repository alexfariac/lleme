package uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs;

/**
 * corbaObjects/scs/IComponentHelper.java . Generated by the IDL-to-Java
 * compiler (portable), version "3.2" from scs.idl Sexta-feira, 9 de Dezembro de
 * 2005 18h26min27s BRST
 */

abstract public class IComponentHelper {
	private static String _id = "IDL:corbaObjects/scs/IComponent:1.0";

	public static void insert(org.omg.CORBA.Any a,
			uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.IComponent that) {
		org.omg.CORBA.portable.OutputStream out = a.create_output_stream();
		a.type(type());
		write(out, that);
		a.read_value(out.create_input_stream(), type());
	}

	public static uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.IComponent extract(org.omg.CORBA.Any a) {
		return read(a.create_input_stream());
	}

	private static org.omg.CORBA.TypeCode __typeCode = null;

	synchronized public static org.omg.CORBA.TypeCode type() {
		if (__typeCode == null) {
			__typeCode = org.omg.CORBA.ORB.init().create_interface_tc(uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.IComponentHelper.id(), "IComponent");
		}
		return __typeCode;
	}

	public static String id() {
		return _id;
	}

	public static uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.IComponent read(
			org.omg.CORBA.portable.InputStream istream) {
		return narrow(istream.read_Object(_IComponentStub.class));
	}

	public static void write(org.omg.CORBA.portable.OutputStream ostream,
			uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.IComponent value) {
		ostream.write_Object(value);
	}

	public static uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.IComponent narrow(org.omg.CORBA.Object obj) {
		if (obj == null)
			return null;
		else if (obj instanceof uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.IComponent)
			return (uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.IComponent) obj;
		else if (!obj._is_a(id()))
			throw new org.omg.CORBA.BAD_PARAM();
		else {
			org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)
					._get_delegate();
			uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs._IComponentStub stub = new uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs._IComponentStub();
			stub._set_delegate(delegate);
			return stub;
		}
	}

	public static uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.IComponent unchecked_narrow(
			org.omg.CORBA.Object obj) {
		if (obj == null)
			return null;
		else if (obj instanceof uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.IComponent)
			return (uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.IComponent) obj;
		else {
			org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)
					._get_delegate();
			uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs._IComponentStub stub = new uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs._IComponentStub();
			stub._set_delegate(delegate);
			return stub;
		}
	}

}
