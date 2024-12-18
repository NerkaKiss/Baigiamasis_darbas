# Online Depo Automation Test


#### Reference: https://online.depo-diy.lt/
## Description:
#### Automated tests for seven chosen scenarios for [Online Depo](https://online.depo-diy.lt/):
* Login with valid email and password
* Login with invalid data
* Logout
* Add new delivery address in profile settings
* Search product(s)

## Technologies:
* JAVA/Maven
#### Dependencies:
* testNg
* Selenium
* Webdriver manager


## Test cases
### **Sign In and Logout Tests**
- **Test 1 (testPositive_Login_ExpectedAccountIsVisible)**

##### *Positive Test: Login with Valid Credentials*
1. Navigate to the login page. 
2. Enter valid email.
3. Enter valid password.
4. Click button *"Prisijungti"*

Expected result: user's full name is displayed and the URL contains the homepage URL.

- **Test 2 (testNegative_LoginWithEmptyEmail_ExpectedErrorMessage)**

##### *Negative Test: Login with Empty Email*
1. Navigate to the login page.
2. Leave the email field empty.
3. Enter valid password.
4. Click button *"Prisijungti"*

Expected result: an error message appears "Būtinai užpildomas laukelis!" and that the user remains on the login page.

- **Test 3 (testNegative_LoginWithEmptyEmail_ExpectedErrorMessage)**

#### *Negative Test: Login with Empty Password*
1. Navigate to the login page.
2. Enter valid email.
3. Leave the email field empty.
4. Click button *"Prisijungti"*.

Expected result: an error message appears "Būtinai užpildomas laukelis!" and that the user remains on the login page.

- **Test 4 (testLogout)**

##### *Logout Test*
1. Log in with valid credentials.
2. Click button *"Atsijungti"*.

Expected result: The user is redirected to the login page, session data is cleared, and the "Accept Cookies" prompt is visible.

### **Profile Tests**
- **Test 1 (testPositive_AddDeliveryAddress)**

##### *Positive Test: Add Delivery Address*
1. Click on button *Pridėti pristatymo adresą*.
2. Enter address.
3. Enter city.
4. Choose country Lithuania.
5. Enter postcode.
6. Click button *"Išsaugoti"*

Expected result: the newly added address details are correctly displayed.

### **Product Tests**
- **Test 1 (testPositive_SearchProductWithBarcode)**

##### *Positive Test: Search Product by Barcode*
1. Enter the product barcode in search input bar.
2. Click on button search.
3. Click on first found product.

Expected result: the correct product page is displayed with matching barcode, name, and URL.

- **Test 2 (testPositive_SearchProductWithName)**

##### *Positive Test: Search Product by Name*
1. Enter the product name in search input bar.
2. Click on button search.
3. Click on first found product.

Expected result: the correct product page is displayed with matching barcode, name, and URL.