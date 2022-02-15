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

package bpmn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmn.Vertex#getIncomingEdges <em>Incoming Edges</em>}</li>
 *   <li>{@link bpmn.Vertex#getOutgoingEdges <em>Outgoing Edges</em>}</li>
 *   <li>{@link bpmn.Vertex#getGraph <em>Graph</em>}</li>
 *   <li>{@link bpmn.Vertex#getID <em>ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmn.BpmnPackage#getVertex()
 * @model extendedMetaData="name='Vertex' kind='elementOnly'"
 * @generated
 */
public interface Vertex extends EObject {
	/**
	 * Returns the value of the '<em><b>Incoming Edges</b></em>' reference list.
	 * The list contents are of type {@link bpmn.Edge}.
	 * It is bidirectional and its opposite is '{@link bpmn.Edge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Edges</em>' reference list.
	 * @see bpmn.BpmnPackage#getVertex_IncomingEdges()
	 * @see bpmn.Edge#getSource
	 * @model type="org.eclipse.stp.bpmn.Edge" opposite="source"
	 *        extendedMetaData="kind='element' name='incomingEdges'"
	 * @generated
	 */
	EList getIncomingEdges();

	/**
	 * Returns the value of the '<em><b>Outgoing Edges</b></em>' reference list.
	 * The list contents are of type {@link bpmn.Edge}.
	 * It is bidirectional and its opposite is '{@link bpmn.Edge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Edges</em>' reference list.
	 * @see bpmn.BpmnPackage#getVertex_OutgoingEdges()
	 * @see bpmn.Edge#getTarget
	 * @model type="org.eclipse.stp.bpmn.Edge" opposite="target"
	 *        extendedMetaData="kind='element' name='outgoingEdges'"
	 * @generated
	 */
	EList getOutgoingEdges();

	/**
	 * Returns the value of the '<em><b>Graph</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link bpmn.Graph#getVertices <em>Vertices</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' container reference.
	 * @see #setGraph(Graph)
	 * @see bpmn.BpmnPackage#getVertex_Graph()
	 * @see bpmn.Graph#getVertices
	 * @model opposite="vertices"
	 *        extendedMetaData="kind='attribute' name='graph'"
	 * @generated
	 */
	Graph getGraph();

	/**
	 * Sets the value of the '{@link bpmn.Vertex#getGraph <em>Graph</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph</em>' container reference.
	 * @see #getGraph()
	 * @generated
	 */
	void setGraph(Graph value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see bpmn.BpmnPackage#getVertex_ID()
	 * @model unique="false" id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='ID'"
	 * @generated
	 */
    String getID();

	/**
	 * Sets the value of the '{@link bpmn.Vertex#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
    void setID(String value);

} // Vertex