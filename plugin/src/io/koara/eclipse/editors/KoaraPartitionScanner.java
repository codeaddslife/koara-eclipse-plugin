package io.koara.eclipse.editors;

import org.eclipse.jface.text.rules.*;

public class KoaraPartitionScanner extends RuleBasedPartitionScanner {

	public KoaraPartitionScanner() {
		IPredicateRule[] rules = new IPredicateRule[0];
		setPredicateRules(rules);
	}
	
}
