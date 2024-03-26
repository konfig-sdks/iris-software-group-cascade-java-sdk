# BankDetailsApi

All URIs are relative to *https://api.iris.co.uk/hr/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBankDetail**](BankDetailsApi.md#createBankDetail) | **POST** /bankdetails | Creates a Bank Details. |
| [**getById**](BankDetailsApi.md#getById) | **GET** /bankdetails/{id} | Gets a single Bank Details by an ID. |
| [**getList**](BankDetailsApi.md#getList) | **GET** /bankdetails | Gets a list of Bank Details. |
| [**updateBankDetail**](BankDetailsApi.md#updateBankDetail) | **PUT** /bankdetails/{id} | Updates Bank Details. |


<a name="createBankDetail"></a>
# **createBankDetail**
> String createBankDetail().createBankDetailsCommand(createBankDetailsCommand).execute();

Creates a Bank Details.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IrisSoftwareGroupCascade;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BankDetailsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.iris.co.uk/hr/v2";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    IrisSoftwareGroupCascade client = new IrisSoftwareGroupCascade(configuration);
    String employeeId = "employeeId_example"; // The ID of the HR Employee. <br />  Must exist in the Employee Service.
    String bankName = "bankName_example"; // Bank Name. <br />  Cascade Source: [EmployeeBank].[BankName]
    BankAddress bankAddress = new BankAddress();
    String accountName = "accountName_example"; // Account Name. <br />  Cascade Source: [EmployeeBank].[AccountName]
    String accountNumber = "accountNumber_example"; // Account Number. <br />  Cascade Source: [EmployeeBank].[AccountNumber]
    String sortCode = "sortCode_example"; // Sort Code. <br />  Cascade Source: [EmployeeBank].[SortCode]
    String rollNumber = "rollNumber_example"; // Roll Number. <br />  Cascade Source: [EmployeeBank].[RollNumber]
    try {
      String result = client
              .bankDetails
              .createBankDetail()
              .employeeId(employeeId)
              .bankName(bankName)
              .bankAddress(bankAddress)
              .accountName(accountName)
              .accountNumber(accountNumber)
              .sortCode(sortCode)
              .rollNumber(rollNumber)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BankDetailsApi#createBankDetail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .bankDetails
              .createBankDetail()
              .employeeId(employeeId)
              .bankName(bankName)
              .bankAddress(bankAddress)
              .accountName(accountName)
              .accountNumber(accountNumber)
              .sortCode(sortCode)
              .rollNumber(rollNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BankDetailsApi#createBankDetail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createBankDetailsCommand** | [**CreateBankDetailsCommand**](CreateBankDetailsCommand.md)| The value of Bank Details. | [optional] |

### Return type

**String**

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json;odata.metadata=minimal;odata.streaming=true; version=1, application/json;odata.metadata=minimal;odata.streaming=false; version=1, application/json;odata.metadata=minimal; version=1, application/json;odata.metadata=full;odata.streaming=true; version=1, application/json;odata.metadata=full;odata.streaming=false; version=1, application/json;odata.metadata=full; version=1, application/json;odata.metadata=none;odata.streaming=true; version=1, application/json;odata.metadata=none;odata.streaming=false; version=1, application/json;odata.metadata=none; version=1, application/json;odata.streaming=true; version=1, application/json;odata.streaming=false; version=1, application/json; version=1, application/xml; version=1, application/prs.odatatestxx-odata; version=1, text/json; version=1, application/*+json; version=1
 - **Accept**: application/json;odata.metadata=minimal;odata.streaming=true; version=1, application/json;odata.metadata=minimal;odata.streaming=false; version=1, application/json;odata.metadata=minimal; version=1, application/json;odata.metadata=full;odata.streaming=true; version=1, application/json;odata.metadata=full;odata.streaming=false; version=1, application/json;odata.metadata=full; version=1, application/json;odata.metadata=none;odata.streaming=true; version=1, application/json;odata.metadata=none;odata.streaming=false; version=1, application/json;odata.metadata=none; version=1, application/json;odata.streaming=true; version=1, application/json;odata.streaming=false; version=1, application/json; version=1, application/xml; version=1, application/prs.odatatestxx-odata; version=1, text/plain; version=1, text/json; version=1

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getById"></a>
# **getById**
> BankDetailsModel getById(id).execute();

Gets a single Bank Details by an ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IrisSoftwareGroupCascade;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BankDetailsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.iris.co.uk/hr/v2";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    IrisSoftwareGroupCascade client = new IrisSoftwareGroupCascade(configuration);
    String id = "id_example"; // Bank Details ID.
    try {
      BankDetailsModel result = client
              .bankDetails
              .getById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmployeeId());
      System.out.println(result.getBankName());
      System.out.println(result.getBankAddress());
      System.out.println(result.getAccountName());
      System.out.println(result.getAccountNumber());
      System.out.println(result.getSortCode());
      System.out.println(result.getRollNumber());
      System.out.println(result.getSourceSystemId());
      System.out.println(result.getSourceSystemCreatedOn());
      System.out.println(result.getSourceSystemLastModifiedOn());
      System.out.println(result.getId());
      System.out.println(result.getCreatedOn());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getLastModifiedOn());
      System.out.println(result.getLastModifiedBy());
    } catch (ApiException e) {
      System.err.println("Exception when calling BankDetailsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BankDetailsModel> response = client
              .bankDetails
              .getById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BankDetailsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| Bank Details ID. | |

### Return type

[**BankDetailsModel**](BankDetailsModel.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;odata.metadata=minimal;odata.streaming=true; version=1, application/json;odata.metadata=minimal;odata.streaming=false; version=1, application/json;odata.metadata=minimal; version=1, application/json;odata.metadata=full;odata.streaming=true; version=1, application/json;odata.metadata=full;odata.streaming=false; version=1, application/json;odata.metadata=full; version=1, application/json;odata.metadata=none;odata.streaming=true; version=1, application/json;odata.metadata=none;odata.streaming=false; version=1, application/json;odata.metadata=none; version=1, application/json;odata.streaming=true; version=1, application/json;odata.streaming=false; version=1, application/json; version=1, application/xml; version=1, application/prs.odatatestxx-odata; version=1, text/plain; version=1, text/json; version=1

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getList"></a>
# **getList**
> BankDetailsQueryModel getList().$top($top).$skip($skip).$filter($filter).$select($select).$orderby($orderby).$count($count).execute();

Gets a list of Bank Details.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IrisSoftwareGroupCascade;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BankDetailsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.iris.co.uk/hr/v2";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    IrisSoftwareGroupCascade client = new IrisSoftwareGroupCascade(configuration);
    Integer $top = 56; // Show only the first n items, maximum of 250, see [Paging - Top](https://docs.oasis-open.org/odata/odata/v4.01/odata-v4.01-part1-protocol.html#sec_SystemQueryOptiontop)
    Integer $skip = 56; // Skip the first n items, see [Paging - Skip](https://docs.oasis-open.org/odata/odata/v4.01/odata-v4.01-part1-protocol.html#sec_SystemQueryOptionskip)
    String $filter = "$filter_example"; // Filter items by property values, see [Filtering](https://docs.oasis-open.org/odata/odata/v4.01/odata-v4.01-part1-protocol.html#sec_SystemQueryOptionfilter)
    List<String> $select = Arrays.asList(); // Select properties to be returned, see [Select](https://docs.oasis-open.org/odata/odata/v4.01/odata-v4.01-part1-protocol.html#sec_SystemQueryOptionselect)
    String $orderby = "$orderby_example"; // Order items by property values, see [Sorting](https://docs.oasis-open.org/odata/odata/v4.01/odata-v4.01-part1-protocol.html#sec_SystemQueryOptionorderby)
    Boolean $count = true; // Include count of items, see [Count](https://docs.oasis-open.org/odata/odata/v4.01/odata-v4.01-part1-protocol.html#sec_SystemQueryOptioncount)
    try {
      BankDetailsQueryModel result = client
              .bankDetails
              .getList()
              .$top($top)
              .$skip($skip)
              .$filter($filter)
              .$select($select)
              .$orderby($orderby)
              .$count($count)
              .execute();
      System.out.println(result);
      System.out.println(result.getOdataContext());
      System.out.println(result.getOdataCount());
      System.out.println(result.getOdataNextLink());
      System.out.println(result.getValue());
    } catch (ApiException e) {
      System.err.println("Exception when calling BankDetailsApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BankDetailsQueryModel> response = client
              .bankDetails
              .getList()
              .$top($top)
              .$skip($skip)
              .$filter($filter)
              .$select($select)
              .$orderby($orderby)
              .$count($count)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BankDetailsApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **$top** | **Integer**| Show only the first n items, maximum of 250, see [Paging - Top](https://docs.oasis-open.org/odata/odata/v4.01/odata-v4.01-part1-protocol.html#sec_SystemQueryOptiontop) | [optional] |
| **$skip** | **Integer**| Skip the first n items, see [Paging - Skip](https://docs.oasis-open.org/odata/odata/v4.01/odata-v4.01-part1-protocol.html#sec_SystemQueryOptionskip) | [optional] |
| **$filter** | **String**| Filter items by property values, see [Filtering](https://docs.oasis-open.org/odata/odata/v4.01/odata-v4.01-part1-protocol.html#sec_SystemQueryOptionfilter) | [optional] |
| **$select** | [**List&lt;String&gt;**](String.md)| Select properties to be returned, see [Select](https://docs.oasis-open.org/odata/odata/v4.01/odata-v4.01-part1-protocol.html#sec_SystemQueryOptionselect) | [optional] |
| **$orderby** | **String**| Order items by property values, see [Sorting](https://docs.oasis-open.org/odata/odata/v4.01/odata-v4.01-part1-protocol.html#sec_SystemQueryOptionorderby) | [optional] |
| **$count** | **Boolean**| Include count of items, see [Count](https://docs.oasis-open.org/odata/odata/v4.01/odata-v4.01-part1-protocol.html#sec_SystemQueryOptioncount) | [optional] |

### Return type

[**BankDetailsQueryModel**](BankDetailsQueryModel.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;odata.metadata=minimal;odata.streaming=true; version=1, application/json;odata.metadata=minimal;odata.streaming=false; version=1, application/json;odata.metadata=minimal; version=1, application/json;odata.metadata=full;odata.streaming=true; version=1, application/json;odata.metadata=full;odata.streaming=false; version=1, application/json;odata.metadata=full; version=1, application/json;odata.metadata=none;odata.streaming=true; version=1, application/json;odata.metadata=none;odata.streaming=false; version=1, application/json;odata.metadata=none; version=1, application/json;odata.streaming=true; version=1, application/json;odata.streaming=false; version=1, application/json; version=1, application/xml; version=1, application/prs.odatatestxx-odata; version=1, text/plain; version=1, text/json; version=1

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateBankDetail"></a>
# **updateBankDetail**
> updateBankDetail(id).updateBankDetailsCommand(updateBankDetailsCommand).execute();

Updates Bank Details.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IrisSoftwareGroupCascade;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BankDetailsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.iris.co.uk/hr/v2";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    IrisSoftwareGroupCascade client = new IrisSoftwareGroupCascade(configuration);
    String id = "id_example"; // The ID of Bank Details to update.
    String bankName = "bankName_example"; // Bank Name. <br />  Cascade Source: [EmployeeBank].[BankName]
    BankAddress bankAddress = new BankAddress();
    String accountName = "accountName_example"; // Account Name. <br />  Cascade Source: [EmployeeBank].[AccountName]
    String accountNumber = "accountNumber_example"; // Account Number. <br />  Cascade Source: [EmployeeBank].[AccountNumber]
    String sortCode = "sortCode_example"; // Sort Code. <br />  Cascade Source: [EmployeeBank].[SortCode]
    String rollNumber = "rollNumber_example"; // Roll Number. <br />  Cascade Source: [EmployeeBank].[RollNumber]
    String id = "id_example"; // The ID of Bank Details to update. <br />  Must exist in Bank Details Service.
    try {
      client
              .bankDetails
              .updateBankDetail(id)
              .bankName(bankName)
              .bankAddress(bankAddress)
              .accountName(accountName)
              .accountNumber(accountNumber)
              .sortCode(sortCode)
              .rollNumber(rollNumber)
              .id(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BankDetailsApi#updateBankDetail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .bankDetails
              .updateBankDetail(id)
              .bankName(bankName)
              .bankAddress(bankAddress)
              .accountName(accountName)
              .accountNumber(accountNumber)
              .sortCode(sortCode)
              .rollNumber(rollNumber)
              .id(id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BankDetailsApi#updateBankDetail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of Bank Details to update. | |
| **updateBankDetailsCommand** | [**UpdateBankDetailsCommand**](UpdateBankDetailsCommand.md)| The value of Bank Details. | [optional] |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json;odata.metadata=minimal;odata.streaming=true; version=1, application/json;odata.metadata=minimal;odata.streaming=false; version=1, application/json;odata.metadata=minimal; version=1, application/json;odata.metadata=full;odata.streaming=true; version=1, application/json;odata.metadata=full;odata.streaming=false; version=1, application/json;odata.metadata=full; version=1, application/json;odata.metadata=none;odata.streaming=true; version=1, application/json;odata.metadata=none;odata.streaming=false; version=1, application/json;odata.metadata=none; version=1, application/json;odata.streaming=true; version=1, application/json;odata.streaming=false; version=1, application/json; version=1, application/xml; version=1, application/prs.odatatestxx-odata; version=1, text/json; version=1, application/*+json; version=1
 - **Accept**: application/json;odata.metadata=minimal;odata.streaming=true; version=1, application/json;odata.metadata=minimal;odata.streaming=false; version=1, application/json;odata.metadata=minimal; version=1, application/json;odata.metadata=full;odata.streaming=true; version=1, application/json;odata.metadata=full;odata.streaming=false; version=1, application/json;odata.metadata=full; version=1, application/json;odata.metadata=none;odata.streaming=true; version=1, application/json;odata.metadata=none;odata.streaming=false; version=1, application/json;odata.metadata=none; version=1, application/json;odata.streaming=true; version=1, application/json;odata.streaming=false; version=1, application/json; version=1, application/xml; version=1, application/prs.odatatestxx-odata; version=1, text/plain; version=1, text/json; version=1

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Success |  -  |

