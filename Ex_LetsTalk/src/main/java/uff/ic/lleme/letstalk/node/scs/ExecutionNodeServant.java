package uff.ic.lleme.letstalk.node.scs;

import java.util.ArrayList;
import java.util.Calendar;
import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.PortableServer.POAPackage.ServantNotActive;
import org.omg.PortableServer.POAPackage.WrongPolicy;
import uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.AlreadyConnected;
import uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ComponentCollection;
import uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ComponentHelp;
import uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ComponentRepository;
import uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ContainerAlreadyExists;
import uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ContainerDescription;
import uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ExceededConnectionLimit;
import uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ExecutionNodePOA;
import uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.IComponent;
import uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.IComponentHelper;
import uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.InvalidConnection;

public class ExecutionNodeServant extends ExecutionNodePOA {

    private String name = null;

    private ArrayList containers = null;

    private NodeServant executionNode = null;

    public ExecutionNodeServant(NodeServant executionNode) {
        containers = new ArrayList();
        name = System.getProperty("user.name")
                + Calendar.getInstance().getTimeInMillis();
        this.executionNode = executionNode;
    }

    public String name() {
        if (name != null)
            return name;
        return "";
    }

    @SuppressWarnings({"unchecked", "unused"})
    public IComponent startContainer(String container_name)
            throws ContainerAlreadyExists, InternalError {
        ContainerDescription desc = new ContainerDescription();
        try {
            desc.container = IComponentHelper.narrow(_poa()
                    .servant_to_reference(new ContainerServant(this._orb())));
            desc.container_name = container_name;
            desc.execution_node = IComponentHelper.narrow(executionNode
                    ._this_object());
            desc.container
                    .connect("componentRepositoryReceptacle", executionNode
                            .getFacet(ComponentRepository.class.getName()));
            desc.container
                    .connect("componentCollectionReceptacle", executionNode
                            .getFacet(ComponentCollection.class.getName()));
            desc.container.connect("componentHelpReceptacle", executionNode
                    .getFacet(ComponentHelp.class.getName()));
            containers.add(desc);
            return desc.container;
        } catch (ServantNotActive e) {
            throw new InternalError();
        } catch (WrongPolicy e) {
            throw new InternalError();
        } catch (InvalidName e) {
            throw new InternalError();
        } catch (uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.InvalidName e) {
            throw new InternalError();
        } catch (InvalidConnection e) {
            throw new InternalError();
        } catch (AlreadyConnected e) {
            throw new InternalError();
        } catch (ExceededConnectionLimit e) {
            throw new InternalError();
        }
    }

    public IComponent getContainer(String container_name) {
        for (int i = 0; i < containers.size(); i++)
            if (containers.get(i) != null
                    && ((ContainerDescription) containers.get(i)).container_name
                    .equals(container_name))
                return ((ContainerDescription) containers.get(i)).container;
        return null;
    }

    @SuppressWarnings("unchecked")
    public ContainerDescription[] getContainers() {
        return (ContainerDescription[]) containers
                .toArray(new ContainerDescription[0]);
    }
}
