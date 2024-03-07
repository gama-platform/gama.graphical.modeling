/*******************************************************************************************************
 *
 * DiagramStartup.java, in gama.ui.diagram, is part of the source code of the GAMA modeling and simulation platform
 * (v.1.9.3).
 *
 * (c) 2007-2024 UMI 209 UMMISCO IRD/SU & Partners (IRIT, MIAT, TLU, CTU)
 *
 * Visit https://github.com/gama-platform/gama for license information and contacts.
 *
 ********************************************************************************************************/
package gama.ui.diagram;

import org.eclipse.ui.IStartup;

import gama.ui.diagram.swt.commands.GenerateDiagramHandler;
import gaml.compiler.ui.editor.GamlEditor;

/**
 * The Class DiagramStartup.
 */
public class DiagramStartup implements IStartup {

	@Override
	public void earlyStartup() {
		GamlEditor.setDiagramOpener(new GenerateDiagramHandler());
	}

}
