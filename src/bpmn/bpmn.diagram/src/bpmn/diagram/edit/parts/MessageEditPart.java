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

package bpmn.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.Routing;
import org.eclipse.gmf.runtime.notation.View;

import bpmn.diagram.edit.policies.MessageItemSemanticEditPolicy;

/**
 * @generated
 */
public class MessageEditPart extends ConnectionNodeEditPart {
	/**
	 * @notgenerated exact observed dashes from previous modeler
	 */
	private static final int[] DASHES = { 7, 5 };

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3002;

	/**
	 * @generated
	 */
	public MessageEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new MessageItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model so
	 * you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected Connection createConnectionFigure() {
		return new ConnectionMessageFigure();
	}

	/**
	 * @generated
	 */
	public class ConnectionMessageFigure extends
			org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx {

		/**
		 * Added the DASHES
		 * 
		 * @notgenerated
		 */
		public ConnectionMessageFigure() {
			this.setLineStyle(org.eclipse.draw2d.Graphics.LINE_CUSTOM);
			this.setLineDash(DASHES);
			this.setForegroundColor(org.eclipse.draw2d.ColorConstants.black

			);
			setRoutingConstraint(Routing.RECTILINEAR_LITERAL);
			setSourceDecoration(createSourceDecoration());
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private bpmn.figures.MessagePolylineSourceDecoration createSourceDecoration() {
			bpmn.figures.MessagePolylineSourceDecoration df = new bpmn.figures.MessagePolylineSourceDecoration();

			return df;
		}

		/**
		 * @generated
		 */
		private bpmn.figures.MessagePolylineTargetDecoration createTargetDecoration() {
			bpmn.figures.MessagePolylineTargetDecoration df = new bpmn.figures.MessagePolylineTargetDecoration();

			return df;
		}

	}

}
