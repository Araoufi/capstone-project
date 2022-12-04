package tek.sdet.capstoneproject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.capstoneproject.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {

	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}
	@FindBy(id="orderLink")
	public WebElement orderBttn;
	
	@FindBy(xpath="//p[text()='Show Details']")
	public WebElement showdDetails;

	@FindBy(id="cancelBtn")
	public WebElement cancelbttn;
	
	@FindBy(id="reasonInput")
	public WebElement reason;
	
	@FindBy(id="orderSubmitBtn")
	public WebElement cancelOrderBttn;
	
	@FindBy(xpath="//p[text()='Your Order Has Been Cancelled']")
	public WebElement yourOrderHasBeenCancelled;
	
    @FindBy(id="returnBtn")
    public WebElement returnItem;
	    
    @FindBy(id ="reasonInput")
    public WebElement reasonInput;
    
    @FindBy(id = "dropOffInput")
    public WebElement dropOfInput;
	    
    @FindBy(id = "orderSubmitBtn")
    public WebElement returnOrderButton;
	    
    @FindBy(xpath="//p[text()='Return was successfull']")
    public WebElement yourOrderReturn;
    
    @FindBy(id = "reviewBtn")
    public WebElement reviewButtton;
    
    @FindBy(id = "headlineInput")
    public WebElement headLineInput;
    
    @FindBy(id = "descriptionInput")
    public WebElement descriptionInput;
    
    @FindBy(id = "reviewSubmitBtn")
    public WebElement reviewSubmitButton;
    
    @FindBy(xpath="//div[text()='Your review was added successfully']")
    public WebElement yourReviewWasAddedSuccessfully;


}
