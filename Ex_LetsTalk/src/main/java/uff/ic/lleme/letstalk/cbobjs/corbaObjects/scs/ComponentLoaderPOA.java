package uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs;

/**
 * corbaObjects/scs/ComponentLoaderPOA.java . Generated by the IDL-to-Java
 * compiler (portable), version "3.2" from deployment.idl Sexta-feira, 9 de
 * Dezembro de 2005 18h26min28s BRST
 */
public abstract class ComponentLoaderPOA extends org.omg.PortableServer.Servant
        implements uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ComponentLoaderOperations,
        org.omg.CORBA.portable.InvokeHandler {

    // Constructors
    private static java.util.Hashtable _methods = new java.util.Hashtable();

    static {
        _methods.put("load", new java.lang.Integer(0));
        _methods.put("unload", new java.lang.Integer(1));
        _methods.put("getLoadedComponents", new java.lang.Integer(2));
        _methods.put("getInstalledComponents", new java.lang.Integer(3));
    }

    public org.omg.CORBA.portable.OutputStream _invoke(String $method,
            org.omg.CORBA.portable.InputStream in,
            org.omg.CORBA.portable.ResponseHandler $rh) {
        org.omg.CORBA.portable.OutputStream out = null;
        java.lang.Integer __method = (java.lang.Integer) _methods.get($method);
        if (__method == null)
            throw new org.omg.CORBA.BAD_OPERATION(0,
                    org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

        switch (__method.intValue()) {
            case 0: // corbaObjects/scs/ComponentLoader/load
            {
                try {
                    uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ComponentId id = uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ComponentIdHelper
                            .read(in);
                    String args[] = uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.StringSeqHelper.read(in);
                    uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ComponentHandle $result = null;
                    $result = this.load(id, args);
                    out = $rh.createReply();
                    uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ComponentHandleHelper.write(out, $result);
                } catch (uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ComponentNotFound $ex) {
                    out = $rh.createExceptionReply();
                    uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ComponentNotFoundHelper.write(out, $ex);
                } catch (uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ComponentAlreadyLoaded $ex) {
                    out = $rh.createExceptionReply();
                    uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ComponentAlreadyLoadedHelper.write(out, $ex);
                } catch (uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.LoadFailure $ex) {
                    out = $rh.createExceptionReply();
                    uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.LoadFailureHelper.write(out, $ex);
                }
                break;
            }

            case 1: // corbaObjects/scs/ComponentLoader/unload
            {
                try {
                    uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ComponentHandle handle = uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ComponentHandleHelper
                            .read(in);
                    this.unload(handle);
                    out = $rh.createReply();
                } catch (uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ComponentNotFound $ex) {
                    out = $rh.createExceptionReply();
                    uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ComponentNotFoundHelper.write(out, $ex);
                }
                break;
            }

            case 2: // corbaObjects/scs/ComponentLoader/getLoadedComponents
            {
                uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ComponentHandle $result[] = null;
                $result = this.getLoadedComponents();
                out = $rh.createReply();
                uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ComponentHandleSeqHelper.write(out, $result);
                break;
            }

            case 3: // corbaObjects/scs/ComponentLoader/getInstalledComponents
            {
                uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ComponentId $result[] = null;
                $result = this.getInstalledComponents();
                out = $rh.createReply();
                uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ComponentIdSeqHelper.write(out, $result);
                break;
            }

            default:
                throw new org.omg.CORBA.BAD_OPERATION(0,
                        org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
        }

        return out;
    } // _invoke

    // Type-specific CORBA::Object operations
    private static String[] __ids = {"IDL:corbaObjects/scs/ComponentLoader:1.0"};

    public String[] _all_interfaces(org.omg.PortableServer.POA poa,
            byte[] objectId) {
        return __ids.clone();
    }

    public ComponentLoader _this() {
        return ComponentLoaderHelper.narrow(super._this_object());
    }

    public ComponentLoader _this(org.omg.CORBA.ORB orb) {
        return ComponentLoaderHelper.narrow(super._this_object(orb));
    }

} // class ComponentLoaderPOA
