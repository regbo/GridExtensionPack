package org.vaadin.teemusav7.gridextensions.pagedcontainer;

import org.vaadin.teemusav7.gridextensions.pagedcontainer.PagedContainer.PagingControls;

/**
 * An event describing that PagedContainer page or page count has changed.
 * 
 * @author Teemu Suo-Anttila
 */
public class PageChangeEvent {

    private PagingControls controls;
    private int pageCount;
    private int page;

    public PageChangeEvent(PagingControls controls) {
        this.controls = controls;
        this.pageCount = controls.getPageCount();
        this.page = controls.getPage();
    }

    /**
     * Gets the {@link PagingControls} where this event originated from.
     * 
     * @return paging controls
     */
    public PagingControls getPagingControls() {
        return controls;
    }

    /**
     * Gets the current page count.
     * 
     * @return page count
     */
    public int getPageCount() {
        return pageCount;
    }

    /**
     * Gets the current page.
     * 
     * @return page count
     */
    public int getPage() {
        return page;
    }
}
