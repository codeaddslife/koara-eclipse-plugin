package xtest.editors;

import org.eclipse.ui.editors.text.TextEditor;

public class KoaraEditor extends TextEditor {

	private ColorManager colorManager;

	public KoaraEditor() {
		super();
		colorManager = new ColorManager();
		setSourceViewerConfiguration(new XMLConfiguration(colorManager));
		setDocumentProvider(new XMLDocumentProvider());
	}
	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}

}
