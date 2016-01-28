package io.koara.eclipse.editors;

import org.eclipse.ui.editors.text.TextEditor;

public class KoaraEditor extends TextEditor {

	private ColorManager colorManager;

	public KoaraEditor() {
		super();
		colorManager = new ColorManager();
		setSourceViewerConfiguration(new KoaraConfiguration(colorManager));
		setDocumentProvider(new KoaraDocumentProvider());
	}
	
	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}

}
