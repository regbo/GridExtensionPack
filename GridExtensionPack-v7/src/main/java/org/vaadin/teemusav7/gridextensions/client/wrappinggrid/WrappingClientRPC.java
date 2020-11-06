package org.vaadin.teemusav7.gridextensions.client.wrappinggrid;

import com.vaadin.shared.communication.ClientRpc;

public interface WrappingClientRPC extends ClientRpc  {

	public void setWrapping(boolean enable, int defaultRowHeight);
	
}
