# DefaultApi

All URIs are relative to *https://pesamoni.com/api/live/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transactionsPost**](DefaultApi.md#transactionsPost) | **POST** /transactions | 


<a name="transactionsPost"></a>
# **transactionsPost**
> InlineResponse200 transactionsPost(method, amount, mobile, holdername, cardnumber, cvv, exp, currency, account, reference, genericmsg, token, bouquet, payoption, meternumber)



Below are parameters and their respective expected responses. In order to try out the service, simply click Try it out.

### Example
```java
// Import classes:
//import psm.ApiClient;
//import psm.ApiException;
//import psm.Configuration;
//import psm.auth.*;
//import pesamoni_java.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apipassword
ApiKeyAuth apipassword = (ApiKeyAuth) defaultClient.getAuthentication("apipassword");
apipassword.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apipassword.setApiKeyPrefix("Token");

// Configure API key authorization: apiusername
ApiKeyAuth apiusername = (ApiKeyAuth) defaultClient.getAuthentication("apiusername");
apiusername.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiusername.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String method = "method_example"; // String | Enter a request method. To check for request methods <a href=''>click here</a>
String amount = "amount_example"; // String | Enter the amount you would like to request for. <p style=\"color:red\">This method applies for request methods <b>acreceive, acreceivekeac, acsend, acsendkeac, acsendbank, pesab2c, sendairtime, cardaccept</b></p>
String mobile = "mobile_example"; // String | Enter the mobile number you would like to execute the above method in format 256.... or 254...<p style=\"color:red\">This method applies for request methods <b>acreceive, acreceivekeac, acsend, acsendkeac, senderid, sendsms, sendairtime</b></p>
String holdername = "holdername_example"; // String | Enter name of payer for Visa/MasterCard transactions<p style=\"color:red\">This method applies for request method <b>cardaccept</b></p>
String cardnumber = "cardnumber_example"; // String | Enter the Visa/MasterCard cardnumber<p style=\"color:red\">This method applies for request method <b>cardaccept</b></p>
String cvv = "cvv_example"; // String | Enter the Visa/MasterCard cvv<p style=\"color:red\">This method applies for request method <b>cardaccept</b></p>
String exp = "exp_example"; // String | Enter the Visa/MasterCard expiry date in the format MM/YYYY e.g 07/2030<p style=\"color:red\">This method applies for request method <b>cardaccept</b></p>
String currency = "currency_example"; // String | Enter the currency you intend to make the transaction for Visa/MasterCard based transactions<p style=\"color:red\">This method applies for request method <b>cardaccept</b></p>
String account = "account_example"; // String | Enter the Pesamoni account you would like to use for this transaction<p style=\"color:red\">This method applies for request method <b>paybills</b></p>
String reference = "reference_example"; // String | Enter your user generated transaction reference<p style=\"color:red\">This method applies for request methods <b>acreceive, acreceivekeac, acsend, acsendkeac, sendsms, transactionstatus, sendairtime, pesab2c, sendsms, cardaccept</b></p>
String genericmsg = "genericmsg_example"; // String | Enter your user generated generic message for the requested transaction<p style=\"color:red\">This method applies for request methods <b>acreceive, acreceivekeac, acsend, acsendkeac, sendsms, sendairtime, pesab2c, sendsms, cardaccept</b></p>
String token = "token_example"; // String | Enter your user generated token for the above mentioned method<p style=\"color:red\">This method applies for request methods <b>acreceive, acreceivekeac, acsend, acsendkeac, sendsms, sendairtime, pesab2c, sendsms, cardaccept</b></p>
String bouquet = "bouquet_example"; // String | Enter the bouquet or package you would like to pay for<p style=\"color:red\">This method applies for request methods <b>paybills</b></p>
String payoption = "payoption_example"; // String | Enter your prefered payment option<p style=\"color:red\">This method applies for request methods <b>paybills</b></p>
String meternumber = "meternumber_example"; // String | Enter the meter number for the intended payment<p style=\"color:red\">This method applies for request methods <b>paybills</b></p>
try {
    InlineResponse200 result = apiInstance.transactionsPost(method, amount, mobile, holdername, cardnumber, cvv, exp, currency, account, reference, genericmsg, token, bouquet, payoption, meternumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#transactionsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **method** | **String**| Enter a request method. To check for request methods &lt;a href&#x3D;&#39;&#39;&gt;click here&lt;/a&gt; |
 **amount** | **String**| Enter the amount you would like to request for. &lt;p style&#x3D;\&quot;color:red\&quot;&gt;This method applies for request methods &lt;b&gt;acreceive, acreceivekeac, acsend, acsendkeac, acsendbank, pesab2c, sendairtime, cardaccept&lt;/b&gt;&lt;/p&gt; |
 **mobile** | **String**| Enter the mobile number you would like to execute the above method in format 256.... or 254...&lt;p style&#x3D;\&quot;color:red\&quot;&gt;This method applies for request methods &lt;b&gt;acreceive, acreceivekeac, acsend, acsendkeac, senderid, sendsms, sendairtime&lt;/b&gt;&lt;/p&gt; | [optional]
 **holdername** | **String**| Enter name of payer for Visa/MasterCard transactions&lt;p style&#x3D;\&quot;color:red\&quot;&gt;This method applies for request method &lt;b&gt;cardaccept&lt;/b&gt;&lt;/p&gt; | [optional]
 **cardnumber** | **String**| Enter the Visa/MasterCard cardnumber&lt;p style&#x3D;\&quot;color:red\&quot;&gt;This method applies for request method &lt;b&gt;cardaccept&lt;/b&gt;&lt;/p&gt; | [optional]
 **cvv** | **String**| Enter the Visa/MasterCard cvv&lt;p style&#x3D;\&quot;color:red\&quot;&gt;This method applies for request method &lt;b&gt;cardaccept&lt;/b&gt;&lt;/p&gt; | [optional]
 **exp** | **String**| Enter the Visa/MasterCard expiry date in the format MM/YYYY e.g 07/2030&lt;p style&#x3D;\&quot;color:red\&quot;&gt;This method applies for request method &lt;b&gt;cardaccept&lt;/b&gt;&lt;/p&gt; | [optional]
 **currency** | **String**| Enter the currency you intend to make the transaction for Visa/MasterCard based transactions&lt;p style&#x3D;\&quot;color:red\&quot;&gt;This method applies for request method &lt;b&gt;cardaccept&lt;/b&gt;&lt;/p&gt; | [optional]
 **account** | **String**| Enter the Pesamoni account you would like to use for this transaction&lt;p style&#x3D;\&quot;color:red\&quot;&gt;This method applies for request method &lt;b&gt;paybills&lt;/b&gt;&lt;/p&gt; | [optional]
 **reference** | **String**| Enter your user generated transaction reference&lt;p style&#x3D;\&quot;color:red\&quot;&gt;This method applies for request methods &lt;b&gt;acreceive, acreceivekeac, acsend, acsendkeac, sendsms, transactionstatus, sendairtime, pesab2c, sendsms, cardaccept&lt;/b&gt;&lt;/p&gt; | [optional]
 **genericmsg** | **String**| Enter your user generated generic message for the requested transaction&lt;p style&#x3D;\&quot;color:red\&quot;&gt;This method applies for request methods &lt;b&gt;acreceive, acreceivekeac, acsend, acsendkeac, sendsms, sendairtime, pesab2c, sendsms, cardaccept&lt;/b&gt;&lt;/p&gt; | [optional]
 **token** | **String**| Enter your user generated token for the above mentioned method&lt;p style&#x3D;\&quot;color:red\&quot;&gt;This method applies for request methods &lt;b&gt;acreceive, acreceivekeac, acsend, acsendkeac, sendsms, sendairtime, pesab2c, sendsms, cardaccept&lt;/b&gt;&lt;/p&gt; | [optional]
 **bouquet** | **String**| Enter the bouquet or package you would like to pay for&lt;p style&#x3D;\&quot;color:red\&quot;&gt;This method applies for request methods &lt;b&gt;paybills&lt;/b&gt;&lt;/p&gt; | [optional]
 **payoption** | **String**| Enter your prefered payment option&lt;p style&#x3D;\&quot;color:red\&quot;&gt;This method applies for request methods &lt;b&gt;paybills&lt;/b&gt;&lt;/p&gt; | [optional]
 **meternumber** | **String**| Enter the meter number for the intended payment&lt;p style&#x3D;\&quot;color:red\&quot;&gt;This method applies for request methods &lt;b&gt;paybills&lt;/b&gt;&lt;/p&gt; | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[apipassword](../README.md#apipassword), [apiusername](../README.md#apiusername)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

