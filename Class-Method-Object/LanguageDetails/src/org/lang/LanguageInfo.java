// Package
package org.lang;

// Class
public class LanguageInfo {

	// Method
	public void tamilLanguage() {
		System.out.println("Tamil Language");
	}
	
	public void englishLanguage() {
		System.out.println("English Language");
	}
	
	public void hindiLanguage() {
		System.out.println("Hindi Language");
	}
	
	public static void main(String[] args) {
		
		// Object From the Same class
		LanguageInfo lan = new LanguageInfo();
		// Object From the different class
		StateDetails st = new StateDetails();
		
		// calling the Method
		lan.tamilLanguage();
		lan.englishLanguage();
		lan.hindiLanguage();
		st.northIndia();
		st.southIndia();
	}
}
