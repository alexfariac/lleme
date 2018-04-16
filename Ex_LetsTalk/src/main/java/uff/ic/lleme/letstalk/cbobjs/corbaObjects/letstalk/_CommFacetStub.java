package uff.ic.lleme.letstalk.cbobjs.corbaObjects.letstalk;

/**
 * corbaObjects/letstalk/_CommFacetStub.java . Generated by the IDL-to-Java
 * compiler (portable), version "3.2" from letstalk.idl Sexta-feira, 9 de
 * Dezembro de 2005 18h26min29s BRST
 */

public class _CommFacetStub extends org.omg.CORBA.portable.ObjectImpl implements
		uff.ic.lleme.letstalk.cbobjs.corbaObjects.letstalk.CommFacet {

	public void startChatting(String login, String[] users)
			throws uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.InvalidConnection, 
			uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.InternalError {
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request(
					"startChatting", true);
			$out.write_string(login);
			uff.ic.lleme.letstalk.cbobjs.corbaObjects.letstalk.stringListHelper.write($out, users);
			$in = _invoke($out);
			return;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream();
			String _id = $ex.getId();
			if (_id.equals("IDL:corbaObjects/scs/InvalidConnection:1.0"))
				throw uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.InvalidConnectionHelper.read($in);
			else if (_id.equals("IDL:corbaObjects/scs/InternalError:1.0"))
				throw uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.InternalErrorHelper.read($in);
			else
				throw new org.omg.CORBA.MARSHAL(_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			startChatting(login, users);
		} finally {
			_releaseReply($in);
		}
	} // startChatting

	public void sendMessage(String login, String chatId, String[] recipients,
			String message) throws uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.InternalError, 
			uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.InvalidName {
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request("sendMessage",
					true);
			$out.write_string(login);
			$out.write_string(chatId);
			uff.ic.lleme.letstalk.cbobjs.corbaObjects.letstalk.stringListHelper.write($out, recipients);
			$out.write_string(message);
			$in = _invoke($out);
			return;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream();
			String _id = $ex.getId();
			if (_id.equals("IDL:corbaObjects/scs/InternalError:1.0"))
				throw uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.InternalErrorHelper.read($in);
			else if (_id.equals("IDL:corbaObjects/scs/InvalidName:1.0"))
				throw uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.InvalidNameHelper.read($in);
			else
				throw new org.omg.CORBA.MARSHAL(_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			sendMessage(login, chatId, recipients, message);
		} finally {
			_releaseReply($in);
		}
	} // sendMessage

	// Type-specific CORBA::Object operations
	private static String[] __ids = { "IDL:corbaObjects/letstalk/CommFacet:1.0" };

	public String[] _ids() {
		return __ids.clone();
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
} // class _CommFacetStub
