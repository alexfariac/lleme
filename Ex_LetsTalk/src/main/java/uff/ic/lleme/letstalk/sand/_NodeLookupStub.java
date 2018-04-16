package uff.ic.lleme.letstalk.sand;

/**
 * _NodeLookupStub.java . Generated by the IDL-to-Java compiler (portable),
 * version "3.2" from deployment.idl Saturday, December 10, 2005 1:24:06 AM GMT
 */

public class _NodeLookupStub extends org.omg.CORBA.portable.ObjectImpl
		implements NodeLookup {

	public NodeDescription getNode(String name) {
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request("getNode", true);
			$out.write_string(name);
			$in = _invoke($out);
			NodeDescription $result = NodeDescriptionHelper.read($in);
			return $result;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream();
			String _id = $ex.getId();
			throw new org.omg.CORBA.MARSHAL(_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			return getNode(name);
		} finally {
			_releaseReply($in);
		}
	} // getNode

	public NodeDescription[] getNodes(Property[] props) {
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request("getNodes",
					true);
			PropertySeqHelper.write($out, props);
			$in = _invoke($out);
			NodeDescription $result[] = NodeDescriptionSeqHelper.read($in);
			return $result;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream();
			String _id = $ex.getId();
			throw new org.omg.CORBA.MARSHAL(_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			return getNodes(props);
		} finally {
			_releaseReply($in);
		}
	} // getNodes

	public NodeDescription[] getAllNodes() {
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request("getAllNodes",
					true);
			$in = _invoke($out);
			NodeDescription $result[] = NodeDescriptionSeqHelper.read($in);
			return $result;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream();
			String _id = $ex.getId();
			throw new org.omg.CORBA.MARSHAL(_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			return getAllNodes();
		} finally {
			_releaseReply($in);
		}
	} // getAllNodes

	// Type-specific CORBA::Object operations
	private static String[] __ids = { "IDL:NodeLookup:1.0" };

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
} // class _NodeLookupStub
