package org.vaadin.teemusav7.gridextensions.refresher;

import com.vaadin.v7.ui.Grid;
import com.vaadin.v7.ui.Grid.AbstractGridExtension;

public class GridRefresher extends AbstractGridExtension {

	protected GridRefresher(Grid grid) {
		super(grid);
	}

	/**
	 * Forces a repaint of given item ID.
	 * 
	 * @param itemId
	 *            item to repaint
	 */
	public void refresh(Object itemId) {
		refreshRow(itemId);
	}

	public static GridRefresher extend(Grid grid) {
		return new GridRefresher(grid);
	}
}
