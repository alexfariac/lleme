package uff.ic.lleme.letstalk.sand;

/**
 * _SCSStub.java . Generated by the IDL-to-Java compiler (portable), version
 * "3.2" from scs.idl Friday, December 9, 2005 9:35:21 PM GMT
 */

public class _SCSStub extends org.omg.CORBA.portable.ObjectImpl implements SCS {

	public IComponent getIComponent(String className, int instance_id)
			throws InternalError {
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request(
					"getIComponent", true);
			$out.write_string(className);
			$out.write_ulong(instance_id);
			$in = _invoke($out);
			IComponent $result = IComponentHelper.read($in);
			return $result;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream();
			String _id = $ex.getId();
			if (_id.equals("IDL:InternalError:1.0"))
				throw InternalErrorHelper.read($in);
			else
				throw new org.omg.CORBA.MARSHAL(_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			return getIComponent(className, instance_id);
		} finally {
			_releaseReply($in);
		}
	} // getIComponent

	public IComponent releaseIComponent(String className, int instance_id) {
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request(
					"releaseIComponent", true);
			$out.write_string(className);
			$out.write_ulong(instance_id);
			$in = _invoke($out);
			IComponent $result = IComponentHelper.read($in);
			return $result;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream();
			String _id = $ex.getId();
			throw new org.omg.CORBA.MARSHAL(_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			return releaseIComponent(className, instance_id);
		} finally {
			_releaseReply($in);
		}
	} // releaseIComponent

	// Type-specific CORBA::Object operations
	private static String[] __ids = { "IDL:SCS:1.0" };

	public String[] _ids() {
		return (String[]) __ids.clone();
	}

	private void readObject(java.io.ObjectInputStream s)
			throws java.io.IOException {
		String str = s.readUTF();
		String[] args = null;
		java.util.Properties props = null;
		org.omg.CORBA.Object obj = org.omg.CORBA.ORB.init(args, props)
				.string_to_object(str);
		org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)
				._get_delegate();
		_set_delegate(delegate);
	}

	private void writeObject(java.io.ObjectOutputStream s)
			throws java.io.IOException {
		String[] args = null;
		java.util.Properties props = null;
		String str = org.omg.CORBA.ORB.init(args, props).object_to_string(this);
		s.writeUTF(str);
	}
} // class _SCSStub
