package xpath_homeWork;

public class CreatingDynamicXpath {

	/*
	 * // a)Tag with a single attribute
	 * //@FindBy(xpath='//input[@id='cms-login-userId']") <--- CMS userID Field
	 * using id
	 * 
	 * @FindBy(xpath ="//a[@class='skip-to-content'] ") <-- Geico login Tab
	 * 
	 * @FindBy(xpath = "//a[@class='icon-geico']") <--- Geico logo
	 * 
	 * @FindBy(xpath = " //input[@id='gh-search-input']") <--- Best Buy Search Field
	 * 
	 * @FindBy(xpath = "//input[@id='HomeAddressAutocomplete']")
	 * 
	 * 
	 * b) Tag with multiple attributes with 'and' logic
	 * 
	 * @FindBy(xpath
	 * =" //input[@id='mh-search-input' and @class='mh-search-input']")<--- Dell
	 * Technologies {Search Field}
	 *
	 * @FindBy(xpath ="//input[@id='SearchBox' and @name='HtmlSearchCriteria']")
	 * <------ Parkland Health
	 * 
	 * @FindBy(xpath ="//input[@id='searchDesktop' and @class='header-search']") <--
	 * https://www.pa.gov/ { Serach Field}
	 * 
	 * 
	 * @FindBy(xpath ="//a[@id='cms-newuser-reg' and 'cms-newuser-reg']") <---
	 * https://portal.cms.gov/portal/ {New User Reg} Below
	 * https://portal.cms.gov/portal/ {CMS Icon}
	 *
	 * @FindBy(xpath
	 * ="//em[@id='cms-homepage-header-logo-unauth' and @class='cms-icon cms-sprite-loggedout ms-3']"
	 * )
	 * 
	 *
	 *
	 * c) Tag with inner text //a[text()='Deal of the Day'] <-- Best Buy Deal of the
	 * day //a[text()='Gift Cards'] <--- Best Buy Gift Cards //a[text()='Login']
	 * <--- EnhtrallIT Login Tab //a[text()='Return site'] <--- EnhtrallIT Return
	 * Site //span[text()='Applications'] <--- CMS Applications
	 *
	 *
	 * d) Tag with partial inner text from any website. //html tag [contains(text(),
	 * 'partial or complete inner text value') ] //div[contains(text(),'Shoes & ')]
	 * <-- JC Penny {Shoes and Accessories} //a[contains(text(),'Weekly')] <---
	 * Target weekly Ad //a[contains(text(),'Thursday Night Football on Prime starts
	 * Sep. 14')] //a[contains(text(),'Thursday')] <--- Amazon Thursday Night
	 * Football on Prime //a[contains(text(),'Back to ')]<---- Amazon Back to School
	 *
	 * 
	 */

}
