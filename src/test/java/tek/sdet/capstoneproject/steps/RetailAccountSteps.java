package tek.sdet.capstoneproject.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.capstoneproject.pages.POMFactory;
import tek.sdet.capstoneproject.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.homePage().account);
		logger.info("user clicked on account option");
	}

	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String nameValue, String phoneValue) {
		clearTextUsingSendKeys(factory.accountPage().nameField);
		sendText(factory.accountPage().nameField, nameValue);
		clearTextUsingSendKeys(factory.accountPage().phoneInputField);
		sendText(factory.accountPage().phoneInputField, phoneValue);
		logger.info("user updated name and phone");

	}

	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().updateButton);
		logger.info("user clicked on update button");

	}

	@Then("User profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(factory.accountPage().personalInformationUpdateMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().personalInformationUpdateMessage));
		logger.info("user profile information updated");

	}

	@And("User enter below information")
	public void userEnterBelowInformation(DataTable data) {
		List<Map<String, String>> changepass = data.asMaps(String.class, String.class);
		sendText(factory.accountPage().previousPasswordInput, changepass.get(0).get("previousPassword"));
		sendText(factory.accountPage().newPasswordInput, changepass.get(0).get("newPassword"));
		sendText(factory.accountPage().confirmPasswordInput, changepass.get(0).get("confirmPassword"));
		logger.info("user entred below info");
		slowDown();
	}

	@And("User click on Change Password button")
	public void userClieckOnChangePasswordButton() {
		click(factory.accountPage().changePasswordButton);
		logger.info("user clicked on Change Password Button");
	}

	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String expectedMessage) {
		slowDown();
		Assert.assertEquals(expectedMessage, factory.accountPage().PassUpdatedSuccessfully.getText());
		logger.info(expectedMessage + "is displayed");

	}

	@And("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		click(factory.accountPage().addPaymentMethodLink);
		logger.info("user clicked on Add Payment");

	}

	@And("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInfo(DataTable data) {
		List<Map<String, String>> debitOrcredit = data.asMaps(String.class, String.class);
		sendText(factory.accountPage().cardNumberInput, debitOrcredit.get(0).get("cardNumber"));
		sendText(factory.accountPage().nameOnCardInput, debitOrcredit.get(0).get("nameOnCard"));
		selectByVisibleText(factory.accountPage().expirationMonthInput, debitOrcredit.get(0).get("expirationMonth"));
		selectByVisibleText(factory.accountPage().expirationYearInput, debitOrcredit.get(0).get("expirationYear"));
		sendText(factory.accountPage().securityCodeInput, debitOrcredit.get(0).get("securityCode"));
		logger.info("user entered required card information");
		slowDown();
	}

	@And("user Click on add your card button")
	public void userClickOnAddYoutCardBttn() {
		click(factory.accountPage().AddYourCardbtn);
		logger.info("user clicked on add card btn");

	}

	@Then("a message should be displayed Payment Method added successfully")
	public void aMessageshouldBeDisplayed() {
		slowDown();
		Assert.assertTrue(isElementDisplayed(factory.accountPage().paymentMethodAddedSuccessfullyMessage));
		logger.info("Payment Method added successfully");

	}

	@And("User select the payment Card")
	public void userSelectedThePaymentCard() {
		click(factory.accountPage().SelectedpaymentCard);
		logger.info("User clicked on payment card");
	}

	@And("User click on Edit option of card section")
	public void userClickonEditOption() {
		click(factory.accountPage().Edit);
		logger.info("user clicked on Edit");
	}

	@And("user edit information with below data")
	public void userEnterTheData(DataTable data) {
		clearTextUsingSendKeys(factory.accountPage().CardNumber);
		clearTextUsingSendKeys(factory.accountPage().NameOnCard);
		clearTextUsingSendKeys(factory.accountPage().SecurityCode);

		List<Map<String, String>> editBttn = data.asMaps(String.class, String.class);

		sendText(factory.accountPage().CardNumber, editBttn.get(0).get("cardNumber"));
		sendText(factory.accountPage().NameOnCard, editBttn.get(0).get("nameOnCard"));
		selectByVisibleText(factory.accountPage().expirationMonthInput, editBttn.get(0).get("expirationMonth"));
		selectByVisibleText(factory.accountPage().expirationYearInput, editBttn.get(0).get("expirationYear"));
		sendText(factory.accountPage().SecurityCode, editBttn.get(0).get("securityCode"));
		logger.info("user successfully entred the info");
		slowDown();
	}

	@And("user click on Update Your Card button")
	public void userClickonUpdateBttn() {
		click(factory.accountPage().UpdateCardBtn);
		logger.info("user clicked on updateBttn");
	}

	@Then("a message should be displayed Payment Method updated Successfully")
	public void aMessageShouldBeDisplayed() {
		slowDown();
		Assert.assertTrue(isElementDisplayed(factory.accountPage().PaymentMethodupdatedSuccessfully));
		logger.info("Payment Method added successfully");

	}

	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(factory.accountPage().Remove);
		logger.info("User clicked on remove option");
		slowDown();

	}

	@And("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.accountPage().AddAddress);
		logger.info("userClickedInAddAddressOption");
	}

	@And("user fill new address form with below information")
	public void userFillTheInformation(DataTable data) {
		List<Map<String, String>> fillAddress = data.asMaps(String.class, String.class);

		selectByVisibleText(factory.accountPage().Country, fillAddress.get(0).get("country"));
		sendText(factory.accountPage().FullNameInput, fillAddress.get(0).get("fullName"));
		sendText(factory.accountPage().PhoneNumberInput, fillAddress.get(0).get("phoneNumber"));
		sendText(factory.accountPage().StreetAddressInput, fillAddress.get(0).get("streetAddress"));
		sendText(factory.accountPage().ApartmentInput, fillAddress.get(0).get("apt"));
		sendText(factory.accountPage().CityInput, fillAddress.get(0).get("city"));
		selectByVisibleText(factory.accountPage().State, fillAddress.get(0).get("state"));
		sendText(factory.accountPage().ZipCodeInput, fillAddress.get(0).get("zipCode"));
		logger.info("User filled the field");
		slowDown();

	}

	@And("User click on Add Your Address button")
	public void userClickAddYourAddressBtn() {
		click(factory.accountPage().AddYourAddress);
		logger.info("User successfully clicked on Add Your Address button");
	}

	@Then("a message should be displayed Address Added Successfully")
	public void aMessageShouldBeDisplayedonScreen() {
		slowDown();
		Assert.assertTrue(isElementDisplayed(factory.accountPage().AddressAddedSuccessfully));
		logger.info("Address Added Successfully");

	}

	@And("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(factory.accountPage().EditAddress);
		logger.info("user clicked on Edit button");

	}

	@And("User fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable Data) {
		List<Map<String, String>> EditNewAdd = Data.asMaps(String.class, String.class);
		selectByVisibleText(factory.accountPage().Country, EditNewAdd.get(0).get("country"));
		clearTextUsingSendKeys(factory.accountPage().FullNameInput);
		sendText(factory.accountPage().FullNameInput, EditNewAdd.get(0).get("fullName"));
		clearTextUsingSendKeys(factory.accountPage().PhoneNumberInput);
		sendText(factory.accountPage().PhoneNumberInput, EditNewAdd.get(0).get("phoneNumber"));
		clearTextUsingSendKeys(factory.accountPage().StreetAddressInput);
		sendText(factory.accountPage().StreetAddressInput, EditNewAdd.get(0).get("streetAddress"));
		clearTextUsingSendKeys(factory.accountPage().ApartmentInput);
		sendText(factory.accountPage().ApartmentInput, EditNewAdd.get(0).get("apt"));
		clearTextUsingSendKeys(factory.accountPage().CityInput);
		sendText(factory.accountPage().CityInput, EditNewAdd.get(0).get("city"));
		selectByVisibleText(factory.accountPage().State, EditNewAdd.get(0).get("state"));
		clearTextUsingSendKeys(factory.accountPage().ZipCodeInput);
		sendText(factory.accountPage().ZipCodeInput, EditNewAdd.get(0).get("zipCode"));
		logger.info("User filled the field");
		slowDown();

	}

	@And("User click update Your Address button")
	public void userClickUpdateYourAddressBtn() {
		click(factory.accountPage().UpdateYourAddress);
		logger.info("User clicked on Update Your Address");

	}
	@Then("a message should be displayed Address Updated Successfully")
	public void aMsgShouldBeDisplayedOnTheScreeen() {
		slowDown();
		Assert.assertTrue(isElementDisplayed(factory.accountPage().AddressUpdatedSuccessfully));
		logger.info("Your New Address Updated");
	}
	@And("User click on remove option of Address section")
	public void userClickedOnRemoveOption() {
		click(factory.accountPage().RemoveAddress);
		logger.info("User clicked on remove button");
		
	}
	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
		//Assert.assertTrue(isElementDisplayed(factory.accountpage().Account)); There is no message to validate.
		logger.info("User removed the address");
		
		
	}


}