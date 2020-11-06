package org.vaadin.teemusav7.gridextensions.client.tableselection;

import com.vaadin.v7.shared.ui.grid.selection.MultiSelectionModelState;

public class TableSelectionState extends MultiSelectionModelState {

	public enum TableSelectionMode {
		NONE, SIMPLE, CTRL, SHIFT
	}

	public TableSelectionMode selectionMode = TableSelectionMode.NONE;

}
