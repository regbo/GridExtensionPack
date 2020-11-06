package org.vaadin.teemusav7.gridextensions.cachestrategy;

import org.vaadin.teemusav7.gridextensions.client.cachestrategy.CacheStrategyState;

import com.vaadin.v7.ui.Grid;
import com.vaadin.v7.ui.Grid.AbstractGridExtension;

/**
 * Simple parameterized CacheStrategyExtension for changing the way Grid does
 * caching in the client-side.
 * 
 * For an example where to start, try minSize = 5, pageMultiplier = 0.2d
 */
public class CacheStrategyExtension extends AbstractGridExtension {

	protected CacheStrategyExtension(Grid grid, int minSize, double pageMultiplier) {
		getState().minSize = minSize;
		getState().pageMultiplier = pageMultiplier;
		extend(grid);
	}

	@Override
	protected CacheStrategyState getState() {
		return (CacheStrategyState) super.getState();
	}

	/**
	 * Constructs a new CacheStrategyExtension and extend given Grid with it.
	 * <p>
	 * Parameters provided will be used to count the cached pages as follows:
	 * <br>
	 * Min cache size = minSize <br>
	 * Max cache size = minSize + pageSize * pageMultiplier
	 * 
	 * @param grid
	 *            grid
	 * @param minSize
	 *            min page count
	 * @param pageMultiplier
	 *            multiplier for page size
	 * @return extension
	 */
	public static CacheStrategyExtension extend(Grid grid, int minSize, double pageMultiplier) {
		return new CacheStrategyExtension(grid, minSize, pageMultiplier);
	}
}
