package io.koara.eclipse.editors;

import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.RuleBasedScanner;

public class KoaraScanner extends RuleBasedScanner {

	public KoaraScanner(ColorManager manager) {
		IRule[] rules = new IRule[0];
		setRules(rules);
	}
	
}
