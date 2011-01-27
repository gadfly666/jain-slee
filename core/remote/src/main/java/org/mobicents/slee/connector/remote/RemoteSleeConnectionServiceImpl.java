package org.mobicents.slee.connector.remote;

import java.rmi.RemoteException;

import javax.resource.ResourceException;
import javax.slee.Address;
import javax.slee.EventTypeID;
import javax.slee.connection.ExternalActivityHandle;

import org.apache.log4j.Logger;
import org.mobicents.slee.connector.local.SleeConnectionService;
import org.mobicents.slee.container.component.ComponentRepository;
import org.mobicents.slee.container.component.SleeComponent;

/**
 * 
 * Implementation of the RemoteSleeService.
 * 
 * An instance of this class receives invocations via HA-RMI from the outside
 * world.
 * 
 * @author Tim
 * @author eduardomartins
 * @author baranowb
 */
public class RemoteSleeConnectionServiceImpl implements RemoteSleeConnectionService {

	

	private static final Logger log = Logger
			.getLogger(RemoteSleeConnectionServiceImpl.class);
	private SleeConnectionService service;
	private ComponentRepository repository;
	
	public RemoteSleeConnectionServiceImpl(SleeConnectionService service,ComponentRepository repository) {
		if (log.isDebugEnabled())
			log.debug("Creating RemoteSleeConnectionServiceImpl");
		this.service = service;
		this.repository = repository;
	}

	/**
	 * @see RemoteSleeService#createActivityHandle()
	 */
	public ExternalActivityHandle createActivityHandle() throws RemoteException{
		if (log.isDebugEnabled()) {
			log.debug("Creating external activity handle");
		}
		try {
			return this.service.createActivityHandle();
		} catch (ResourceException e) {
			//be good citized
			throw new RemoteException("Failed to create activity due to:", e);
		}
	}

	/**
	 * @see RemoteSleeService#fireEvent(Object, EventTypeID,
	 *      ExternalActivityHandle, Address)
	 */
	public void fireEvent(Object event, EventTypeID eventType,
			ExternalActivityHandle activityHandle, Address address)
			throws 
			RemoteException {
		final boolean deserialize =  event instanceof RemoteEventWrapper;
		if(deserialize)
		{
			final ClassLoader origCL = Thread.currentThread().getContextClassLoader();    	
			try {

				RemoteEventWrapper rew = (RemoteEventWrapper) event;
				// we have to switch CL, lookup component CL, switch CTX, load
				// event and fire...
				SleeComponent sleeComponent = this.repository.getComponentByID(eventType);
				Thread.currentThread().setContextClassLoader(sleeComponent.getClassLoader());
				event = rew.getEvent();
			} catch (Exception e) {
				// be good citized
				throw new RemoteException("Failed to fire event due to:", e);
			} finally {
				Thread.currentThread().setContextClassLoader(origCL);
			}
		}else
		{
			//for some reason someone called RMI localy, not VIA
		}
		
		
		try {
			
			
			this.service.fireEvent(event, eventType, activityHandle, address);
		} catch (Exception e) {
			//be good citized
			throw new RemoteException("Failed to fire event due to:", e);
		} 
	}

	/**
	 * @see RemoteSleeService#getEventTypeID(String, String, String)
	 */
	public EventTypeID getEventTypeID(String name, String vendor, String version)
	throws RemoteException {

		try {
			return this.service.getEventTypeID(name, vendor, version);
		} catch (Exception e) {
			//be good citized
			throw new RemoteException("Failed to retrieve event type due to:", e);
		} 
	}
}