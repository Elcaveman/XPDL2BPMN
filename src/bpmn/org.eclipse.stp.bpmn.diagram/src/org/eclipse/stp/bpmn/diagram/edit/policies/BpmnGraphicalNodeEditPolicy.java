/******************************************************************************
 * Copyright (c) 2006, Intalio Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Intalio Inc. - initial API and implementation
 *******************************************************************************/

package org.eclipse.stp.bpmn.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.stp.bpmn.diagram.edit.commands.BpmnReorientConnectionViewCommand;

/**
 * @generated
 */
public class BpmnGraphicalNodeEditPolicy extends GraphicalNodeEditPolicy {

	/**
	 * @generated
	 */
	protected IElementType getElementType(CreateConnectionRequest request) {
		if (request instanceof CreateConnectionViewAndElementRequest) {
			CreateElementRequestAdapter requestAdapter = ((CreateConnectionViewAndElementRequest) request)
					.getConnectionViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			return (IElementType) requestAdapter.getAdapter(IElementType.class);
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getConnectionWithReorientedViewCompleteCommand(
			CreateConnectionRequest request) {
		ICommandProxy c = (ICommandProxy) super
				.getConnectionCompleteCommand(request);
		CompositeCommand cc = (CompositeCommand) c.getICommand();
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		BpmnReorientConnectionViewCommand rcvCommand = new BpmnReorientConnectionViewCommand(
				editingDomain, null);
		rcvCommand.setEdgeAdaptor(getViewAdapter());
		cc.compose(rcvCommand);
		return c;
	}
}
