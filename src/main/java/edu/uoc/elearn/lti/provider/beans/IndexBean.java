package edu.uoc.elearn.lti.provider.beans;

import edu.uoc.elc.spring.lti.security.Context;
import edu.uoc.elc.spring.lti.security.User;
import edu.uoc.lti.ags.LineItem;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * @author Xavi Aracil <xaracil@uoc.edu>
 */
@Getter
@RequiredArgsConstructor
public class IndexBean {
	private final User user;
	private final Context context;
	private final List<String> roles;
	private final NamesRoleBean namesRoleService;
	private final Boolean hasAgsService;
	private final List<LineItem> lineItems;
}
