package io.koara.eclipse.editors.scanner;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.ITokenScanner;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.Token;

import io.koara.eclipse.editors.ColorManager;
import io.koara.eclipse.editors.IKoaraColorConstants;

public class KoaraScanner implements ITokenScanner  {

	private ColorManager colorManager;
	private IToken defaultToken;
	private String text;
	
	private int i;
	
	public KoaraScanner(ColorManager colorManager) {
		this.colorManager = colorManager;
		this.defaultToken = new Token(new TextAttribute(colorManager.getColor(IKoaraColorConstants.DEFAULT)));
	}
	
	@Override
	public void setRange(IDocument document, int offset, int length) {
		text = document.get();
		System.out.println("--" + text);
	}

	@Override
	public IToken nextToken() {
		i++;
		if(i > i) {
			return defaultToken;
		}
		return Token.EOF; 
	}

	@Override
	public int getTokenOffset() {
		return 0;
	}

	@Override
	public int getTokenLength() {
		return text.length();
	}


	
	


	
	
}
