package org.vaadin.teemusav7.gridextensions.client.sidebarmenuextension;

import com.vaadin.shared.communication.ServerRpc;

/**
 * ServerRPC class for SidebarMenuExtension.
 *
 * @author Anna Koskinen
 *
 */
public interface SidebarMenuExtensionServerRpc extends ServerRpc {

    public void click(Integer id);
}
