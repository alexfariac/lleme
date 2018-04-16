package uff.ic.lleme.letstalk.sand;

/**
 * ComponentLoaderHelper.java . Generated by the IDL-to-Java compiler
 * (portable), version "3.2" from deployment.idl Saturday, December 10, 2005
 * 1:24:06 AM GMT
 */

abstract public class ComponentLoaderHelper {
	private static String _id = "IDL:ComponentLoader:1.0";

	public static void insert(org.omg.CORBA.Any a, ComponentLoader that) {
		org.omg.CORBA.portable.OutputStream out = a.create_output_stream();
		a.type(type());
		write(out, that);
		a.read_value(out.create_input_stream(), type());
	}

	public static ComponentLoader extract(org.omg.CORBA.Any a) {
		return read(a.create_input_stream());
	}

	private static org.omg.CORBA.TypeCode __typeCode = null;

	synchronized public static org.omg.CORBA.TypeCode type() {
		if (__typeCode == null) {
			__typeCode = org.omg.CORBA.ORB.init().create_interface_tc(
					ComponentLoaderHelper.id(), "ComponentLoader");
		}
		return __typeCode;
	}

	public static String id() {
		return _id;
	}

	public static ComponentLoader read(
			org.omg.CORBA.portable.InputStream istream) {
		return narrow(istream.read_Object(_ComponentLoaderStub.class));
	}

	public static void write(org.omg.CORBA.portable.OutputStream ostream,
			ComponentLoader value) {
		ostream.write_Object((org.omg.CORBA.Object) value);
	}

	public static ComponentLoader narrow(org.omg.CORBA.Object obj) {
		if (obj == null)
			return null;
		else if (obj instanceof ComponentLoader)
			return (ComponentLoader) obj;
		else if (!obj._is_a(id()))
			throw new org.omg.CORBA.BAD_PARAM();
		else {
			org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)
					._get_delegate();
			_ComponentLoaderStub stub = new _ComponentLoaderStub();
			stub._set_delegate(delegate);
			return stub;
		}
	}

	public static ComponentLoader unchecked_narrow(org.omg.CORBA.Object obj) {
		if (obj == null)
			return null;
		else if (obj instanceof ComponentLoader)
			return (ComponentLoader) obj;
		else {
			org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)
					._get_delegate();
			_ComponentLoaderStub stub = new _ComponentLoaderStub();
			stub._set_delegate(delegate);
			return stub;
		}
	}

}
