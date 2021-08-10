package org.lang;

public class LanguageInfo {

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
		
		LanguageInfo lan = new LanguageInfo();
		StateDetails st = new StateDetails();
		
		lan.tamilLanguage();
		lan.englishLanguage();
		lan.hindiLanguage();
		st.northIndia();
		st.southIndia();
	}
}
