package tek.sdet.capstoneproject.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.capstoneproject.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {

	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(id = "nameInput")
	public WebElement nameField;

	@FindBy(id = "personalPhoneInput")
	public WebElement phoneInputField;

	@FindBy(id = "emailInput")
	public WebElement emailInputField;

	@FindBy(xpath = "//button[text()='Update']")
	public WebElement updateButton;

	@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
	public WebElement personalInformationUpdateMessage;

	@FindBy(id = "previousPasswordInput")
	public WebElement previousPasswordInput;

	@FindBy(id = "newPasswordInput")
	public WebElement newPasswordInput;

	@FindBy(id = "confirmPasswordInput")
	public WebElement confirmPasswordInput;

	@FindBy(id = "credentialsSubmitBtn")
	public WebElement changePasswordButton;

	@FindBy(xpath = "//div[text()=\"Password Updated Successfully\"]")
	public WebElement PassUpdatedSuccessfully;

	@FindBy(xpath = "//p[text()='Add a payment method']")
	public WebElement addPaymentMethodLink;

	@FindBy(id = "cardNumberInput")
	public WebElement cardNumberInput;

	@FindBy(id = "nameOnCardInput")
	public WebElement nameOnCardInput;

	@FindBy(id = "expirationMonthInput")
	public WebElement expirationMonthInput;

	@FindBy(id = "expirationYearInput")
	public WebElement expirationYearInput;

	@FindBy(id = "securityCodeInput")
	public WebElement securityCodeInput;

	@FindBy(id = "paymentSubmitBtn")
	public WebElement AddYourCardbtn;

	@FindBy(xpath = "//div[text()=\"Payment Method added sucessfully\"]")
	public WebElement paymentMethodAddedSuccessfullyMessage;

	@FindBy(css="p.account__payment__sub-text")
	public WebElement SelectedpaymentCard;
	
	@FindBy(xpath="//button[text()='Edit']")
	public WebElement Edit;
	
	@FindBy(xpath="//input[@name='cardNumber']")
	public WebElement CardNumber;
	
	@FindBy(xpath="//input[@name='nameOnCard']")
	public WebElement NameOnCard;
	
	@FindBy(xpath="//input[@name='securityCode']")
	public WebElement SecurityCode;
	
	@FindBy(xpath="//button[text()='Update Your Card']")
	public WebElement UpdateCardBtn;
	
	@FindBy(xpath="//div[text()=\"Payment Method updated Successfully\"]")
	public WebElement PaymentMethodupdatedSuccessfully;
	
	@FindBy(xpath="//button[text()='remove']")
	public WebElement Remove;
	
	@FindBy(xpath="//p[text()='Add Address']")
	public WebElement AddAddress;

	@FindBy(id="countryDropdown")
	public WebElement Country;
	
	@FindBy(id="fullNameInput")
	public WebElement FullNameInput;
	
	@FindBy(id="phoneNumberInput")
	public WebElement PhoneNumberInput;
	
	@FindBy(id="streetInput")
	public WebElement StreetAddressInput;
	
	@FindBy(id="apartmentInput")
	public WebElement ApartmentInput;
	
	@FindBy(id="cityInput")
	public WebElement CityInput;
	
	@FindBy(name ="state")
	public WebElement State;
	
	@FindBy(id="zipCodeInput")
	public WebElement ZipCodeInput;
	
	@FindBy(id="addressBtn")
	public WebElement AddYourAddress;
	
	@FindBy(xpath="//div[text()=\"Address Added Successfully\"]")
	public WebElement AddressAddedSuccessfully;
	
	@FindBy(xpath="//button[text()='Edit']")
	public WebElement EditAddress;
	
	@FindBy(id="addressBtn")
	public WebElement UpdateYourAddress;
	
	@FindBy(xpath="//div[text()=\"Address Updated Successfully\"]")
	public WebElement AddressUpdatedSuccessfully;

	@FindBy(xpath="//button[text()='Remove']")
	public WebElement RemoveAddress;



}
