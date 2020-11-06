package org.vaadin.teemusav7.gridextensions.client.sidebarmenuextension;

import java.util.HashMap;
import java.util.Map;

import com.vaadin.shared.communication.SharedState;

/**
 * State class for SidebarMenuExtension.
 *
 * @author Anna Koskinen
 *
 */
public class SidebarMenuExtensionState extends SharedState {

    public Map<Integer, String> captionMap = new HashMap<Integer, String>();
    public Map<Integer, String> styleMap = new HashMap<Integer, String>();
	public boolean autoClose;

}
