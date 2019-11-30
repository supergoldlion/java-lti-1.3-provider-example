package edu.uoc.elearn.lti.provider.service;

import edu.uoc.elc.lti.platform.ags.ToolLineItemServiceClient;
import edu.uoc.elc.spring.lti.tool.AgsServiceProvider;
import edu.uoc.elc.spring.lti.tool.ToolProvider;
import edu.uoc.lti.ags.LineItem;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * @author Xavi Aracil <xaracil@uoc.edu>
 */
@RequiredArgsConstructor
public class LineItemVisitor {
	private final ToolProvider toolProvider;

	public boolean canGet() {
		final AgsServiceProvider agsServiceProvider = toolProvider.getAgsServiceProvider();
		return agsServiceProvider.hasAgsService();
	}

	public List<LineItem> getAll() {
		return getAll(null, null, null, null);
	}

	public List<LineItem> getAll(Integer limit, Integer page, String tag, String resourceId) {
		final AgsServiceProvider agsServiceProvider = toolProvider.getAgsServiceProvider();
		final ToolLineItemServiceClient lineItemsServiceClient = agsServiceProvider.getLineItemsServiceClient();
		return lineItemsServiceClient.getLineItems(limit, page, tag, resourceId);
	}
}
