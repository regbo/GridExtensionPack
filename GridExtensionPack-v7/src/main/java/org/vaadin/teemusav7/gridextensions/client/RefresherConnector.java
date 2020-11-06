package org.vaadin.teemusav7.gridextensions.client;

import org.vaadin.teemusav7.gridextensions.refresher.GridRefresher;

import com.vaadin.client.ServerConnector;
import com.vaadin.shared.ui.Connect;

@Connect(GridRefresher.class)
public class RefresherConnector extends AbstractGridExtensionConnector {

	@Override
	protected void extend(ServerConnector target) {
		// NO-OP
	}

}
