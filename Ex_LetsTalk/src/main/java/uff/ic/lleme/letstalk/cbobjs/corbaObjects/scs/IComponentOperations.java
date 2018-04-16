package uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs;

/**
 * corbaObjects/scs/IComponentOperations.java . Generated by the IDL-to-Java
 * compiler (portable), version "3.2" from scs.idl Sexta-feira, 9 de Dezembro de
 * 2005 18h26min27s BRST
 */
public interface IComponentOperations {

    org.omg.CORBA.Object getFacet(String facet_interface)
            throws uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.InvalidName;

    org.omg.CORBA.Object getFacetByName(String facet)
            throws uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.InvalidName;

    void startup() throws uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.StartupFailed;

    void shutdown() throws uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ShutdownFailed;

    // Receptacle
    int connect(String receptacle, org.omg.CORBA.Object obj)
            throws uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.InvalidName,
            InvalidConnection,
            AlreadyConnected,
            ExceededConnectionLimit;

    void disconnect(int id) throws uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.InvalidConnection, 
            uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.NoConnection;

    uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ConnectionDescription getConnection(int id)
            throws uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.InvalidConnection;

    uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ConnectionDescription[] getConnections(String receptacle)
            throws uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.InvalidName;

    // MetaInterface
    uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.FacetDescription[] getFacets();

    uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.FacetDescription[] getFacetsByName(String[] names)
            throws uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.InvalidName;

    uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ReceptacleDescription[] getReceptacles();

    uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ConnectionDescription[] getReceptacleConnections(
            String receptacle_interface) throws uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.InvalidName,
            InvalidConnection,
            AlreadyConnected,
            ExceededConnectionLimit,
            InternalError;

    uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ReceptacleDescription[] getReceptaclesByName(String[] names)
            throws uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.InvalidName;
} // interface IComponentOperations
