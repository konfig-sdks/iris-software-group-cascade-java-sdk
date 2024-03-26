# EmployeesApi

All URIs are relative to *https://api.iris.co.uk/hr/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewEmployee**](EmployeesApi.md#createNewEmployee) | **POST** /employees | Creates a new Employee. |
| [**getById**](EmployeesApi.md#getById) | **GET** /employees/{id} | Gets a single Employee referenced by ID. |
| [**getList**](EmployeesApi.md#getList) | **GET** /employees | Gets a list of Employees. |
| [**updateById**](EmployeesApi.md#updateById) | **PUT** /employees/{id} | Update an Employee referenced by ID. |


<a name="createNewEmployee"></a>
# **createNewEmployee**
> String createNewEmployee().createEmployeeCommand(createEmployeeCommand).execute();

Creates a new Employee.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IrisSoftwareGroupCascade;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
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
    String displayId = "displayId_example"; // The Display ID of the Employee. <br />  If provided must be unqiue, If null then it will automatically be generated. <br />  Cascade Source: [Employee].[DisplayEmployeeId]
    String titleHonorific = "titleHonorific_example"; // The Title of the Employee. E.g. Mr, Mrs, Miss. <br />  Cascade Source: [Employee].[Title] translated through the TITLE system list.
    String firstName = "firstName_example"; // The First Name of the Employee. <br />  Required. <br />  Cascade Source: [Employee].[Forename]
    String knownAs = "knownAs_example"; // The name the Employee is commonly known as. <br />  Cascade Source: [Employee].[KnownAs]
    String otherName = "otherName_example"; // Any other name that the Employee has. <br />  Cascade Source: [Employee].[OtherName]
    String lastName = "lastName_example"; // The Last Name, Surname or Family Name of the Employee. <br />  Required. <br />  Cascade Source: [Employee].[Surname]
    String costCentre = "costCentre_example"; // The Cost Centre assigned to the Employee. <br />  Cascade Source: [Employee].[CostCentre]
    String workingStatus = "workingStatus_example"; // The Status of the Employee E.g. On Holiday, Sick. <br />  Automatically Calculated. <br />  Cascade Source: [Sysview_Employee_Status].[StatusDescription]
    Boolean isManager = true; // Indicates if the Employee is a Manager. <br />  True if any other Employee's active <see cref=\\\"T:Iris.Api.Hr.Employee.Domain.Entities.V1.Job\\\">Job</see> has this Employee as their Line Manager. <br />  Automaticaly Calculated.
    String nationalInsuranceNumber = "nationalInsuranceNumber_example"; // The National Insurance Number of the Employee. <br />  Cascade Source: [Employee].[NationalInsuranceNo]
    String payrollId = "payrollId_example"; // The Payroll ID of the Employee. <br />  Cascade Source: [Employee].[PayrollId]
    String taxCode = "taxCode_example"; // The Tax Code of the Employee. <br />  Cascade Source: [Employee].[TaxCode]
    Boolean includeInPayroll = true; // Indicates if the Employee should be included in Payroll. <br />  Cascade Source: [Employee].[IncludeInPayroll]
    OffsetDateTime employmentStartDate = OffsetDateTime.now(); // The date the Employee started with their current Employer. <br />  Cascade Source: [Employee].[EmployeeStartDate]
    OffsetDateTime employmentLeftDate = OffsetDateTime.now(); // The date the Employee left their current Employer. <br />  Cascade Source: [Employee].[EmployementLeftDate]
    OffsetDateTime continuousServiceDate = OffsetDateTime.now(); // The date the Employee's continuous service should be applied from. <br />  Cascade Source: [Employee].[ContServiceDate]
    OffsetDateTime dateOfBirth = OffsetDateTime.now(); // The Date of Birth of the Employee. <br />  Cascade Source: [Employee].[DateOfBirth]
    OffsetDateTime lastWorkingDate = OffsetDateTime.now(); // The date of the last working date of the Employee. <br />  Cascade Source: [Employee].[LeaverLastWorkDate]
    String gender = "gender_example"; // The Gender of the Employee. <br />  Cascade Source: [Employee].[Sex] translated through the GENDER system list.
    String ethnicity = "ethnicity_example"; // The Ethnicity of the Employee. <br />  Cascade Source: [Employee].[EthnicOrigin] translated through the ETHNICTORIGIN system list.
    String nationality = "nationality_example"; // The Nationality of the Employee. <br />  Cascade Source: [Employee].[Nationality] translated through the NATIONALITY system list.
    String religion = "religion_example"; // The Religion of the Employee. <br />  Cascade Source: [Employee].[Religion] transalated through the RELIGION system list.
    String leaverReason = "leaverReason_example"; // The reason for the Employee to Leave. <br />  Cascade Source: [Employee].[LeaverReason]
    String maritalStatus = "maritalStatus_example"; // The marrital status of the Employee. <br />  Cascade Source: [Employee.[MaritalStatus] translated through the MARITALSTATUS system list.
    List<Phone> phones = Arrays.asList(); // The <see cref=\\\"T:Iris.Api.Hr.Employee.Domain.Entities.V1.Phone\\\">Phone Numbers</see> belonging to the Employee.
    List<Email> emails = Arrays.asList(); // The <see cref=\\\"T:Iris.Api.Hr.Employee.Domain.Entities.V1.Email\\\">Email Addresses</see> belonging to the Employee.
    List<Address> addresses = Arrays.asList(); // The <see cref=\\\"T:Iris.Api.Hr.Employee.Domain.Entities.V1.Address\\\">Addresses</see> belonging to the Employee.
    String genderIdentity = "genderIdentity_example"; // The Gender Identity of the Employee. <br />  Cascade Source: [Employee].[GenderIdentity] translated through the GenderIdentity system list.
    String windowsUsername = "windowsUsername_example"; // The Windows Username of the Employee. <br />  Cascade Source: [Employee].[WindowsUsername]
    try {
      String result = client
              .employees
              .createNewEmployee()
              .displayId(displayId)
              .titleHonorific(titleHonorific)
              .firstName(firstName)
              .knownAs(knownAs)
              .otherName(otherName)
              .lastName(lastName)
              .costCentre(costCentre)
              .workingStatus(workingStatus)
              .isManager(isManager)
              .nationalInsuranceNumber(nationalInsuranceNumber)
              .payrollId(payrollId)
              .taxCode(taxCode)
              .includeInPayroll(includeInPayroll)
              .employmentStartDate(employmentStartDate)
              .employmentLeftDate(employmentLeftDate)
              .continuousServiceDate(continuousServiceDate)
              .dateOfBirth(dateOfBirth)
              .lastWorkingDate(lastWorkingDate)
              .gender(gender)
              .ethnicity(ethnicity)
              .nationality(nationality)
              .religion(religion)
              .leaverReason(leaverReason)
              .maritalStatus(maritalStatus)
              .phones(phones)
              .emails(emails)
              .addresses(addresses)
              .genderIdentity(genderIdentity)
              .windowsUsername(windowsUsername)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#createNewEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .employees
              .createNewEmployee()
              .displayId(displayId)
              .titleHonorific(titleHonorific)
              .firstName(firstName)
              .knownAs(knownAs)
              .otherName(otherName)
              .lastName(lastName)
              .costCentre(costCentre)
              .workingStatus(workingStatus)
              .isManager(isManager)
              .nationalInsuranceNumber(nationalInsuranceNumber)
              .payrollId(payrollId)
              .taxCode(taxCode)
              .includeInPayroll(includeInPayroll)
              .employmentStartDate(employmentStartDate)
              .employmentLeftDate(employmentLeftDate)
              .continuousServiceDate(continuousServiceDate)
              .dateOfBirth(dateOfBirth)
              .lastWorkingDate(lastWorkingDate)
              .gender(gender)
              .ethnicity(ethnicity)
              .nationality(nationality)
              .religion(religion)
              .leaverReason(leaverReason)
              .maritalStatus(maritalStatus)
              .phones(phones)
              .emails(emails)
              .addresses(addresses)
              .genderIdentity(genderIdentity)
              .windowsUsername(windowsUsername)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#createNewEmployee");
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
| **createEmployeeCommand** | [**CreateEmployeeCommand**](CreateEmployeeCommand.md)| New Employee. | [optional] |

### Return type

**String**

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json;odata.metadata=minimal;odata.streaming=true; version=2, application/json;odata.metadata=minimal;odata.streaming=false; version=2, application/json;odata.metadata=minimal; version=2, application/json;odata.metadata=full;odata.streaming=true; version=2, application/json;odata.metadata=full;odata.streaming=false; version=2, application/json;odata.metadata=full; version=2, application/json;odata.metadata=none;odata.streaming=true; version=2, application/json;odata.metadata=none;odata.streaming=false; version=2, application/json;odata.metadata=none; version=2, application/json;odata.streaming=true; version=2, application/json;odata.streaming=false; version=2, application/json; version=2, application/xml; version=2, application/prs.odatatestxx-odata; version=2, text/json; version=2, application/*+json; version=2
 - **Accept**: application/json;odata.metadata=minimal;odata.streaming=true; version=2, application/json;odata.metadata=minimal;odata.streaming=false; version=2, application/json;odata.metadata=minimal; version=2, application/json;odata.metadata=full;odata.streaming=true; version=2, application/json;odata.metadata=full;odata.streaming=false; version=2, application/json;odata.metadata=full; version=2, application/json;odata.metadata=none;odata.streaming=true; version=2, application/json;odata.metadata=none;odata.streaming=false; version=2, application/json;odata.metadata=none; version=2, application/json;odata.streaming=true; version=2, application/json;odata.streaming=false; version=2, application/json; version=2, application/xml; version=2, application/prs.odatatestxx-odata; version=2, text/plain; version=2, text/json; version=2

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getById"></a>
# **getById**
> EmployeeModel getById(id).execute();

Gets a single Employee referenced by ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IrisSoftwareGroupCascade;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
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
    String id = "id_example"; // Employee ID.
    try {
      EmployeeModel result = client
              .employees
              .getById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getDisplayId());
      System.out.println(result.getTitleHonorific());
      System.out.println(result.getFirstName());
      System.out.println(result.getKnownAs());
      System.out.println(result.getOtherName());
      System.out.println(result.getLastName());
      System.out.println(result.getCostCentre());
      System.out.println(result.getWorkingStatus());
      System.out.println(result.getIsManager());
      System.out.println(result.getNationalInsuranceNumber());
      System.out.println(result.getPayrollId());
      System.out.println(result.getTaxCode());
      System.out.println(result.getIncludeInPayroll());
      System.out.println(result.getEmploymentStartDate());
      System.out.println(result.getEmploymentLeftDate());
      System.out.println(result.getContinuousServiceDate());
      System.out.println(result.getDateOfBirth());
      System.out.println(result.getLastWorkingDate());
      System.out.println(result.getGender());
      System.out.println(result.getEthnicity());
      System.out.println(result.getNationality());
      System.out.println(result.getReligion());
      System.out.println(result.getLeaverReason());
      System.out.println(result.getMaritalStatus());
      System.out.println(result.getPhones());
      System.out.println(result.getEmails());
      System.out.println(result.getAddresses());
      System.out.println(result.getGenderIdentity());
      System.out.println(result.getWindowsUsername());
      System.out.println(result.getId());
      System.out.println(result.getSourceSystemId());
      System.out.println(result.getCreatedOn());
      System.out.println(result.getSourceSystemCreatedOn());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getLastModifiedOn());
      System.out.println(result.getSourceSystemLastModifiedOn());
      System.out.println(result.getLastModifiedBy());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeModel> response = client
              .employees
              .getById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#getById");
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
| **id** | **String**| Employee ID. | |

### Return type

[**EmployeeModel**](EmployeeModel.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;odata.metadata=minimal;odata.streaming=true; version=2, application/json;odata.metadata=minimal;odata.streaming=false; version=2, application/json;odata.metadata=minimal; version=2, application/json;odata.metadata=full;odata.streaming=true; version=2, application/json;odata.metadata=full;odata.streaming=false; version=2, application/json;odata.metadata=full; version=2, application/json;odata.metadata=none;odata.streaming=true; version=2, application/json;odata.metadata=none;odata.streaming=false; version=2, application/json;odata.metadata=none; version=2, application/json;odata.streaming=true; version=2, application/json;odata.streaming=false; version=2, application/json; version=2, application/xml; version=2, application/prs.odatatestxx-odata; version=2, text/plain; version=2, text/json; version=2

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getList"></a>
# **getList**
> EmployeeQueryModel getList().$top($top).$skip($skip).$filter($filter).$select($select).$orderby($orderby).$count($count).execute();

Gets a list of Employees.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IrisSoftwareGroupCascade;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
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
      EmployeeQueryModel result = client
              .employees
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
      System.err.println("Exception when calling EmployeesApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeQueryModel> response = client
              .employees
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
      System.err.println("Exception when calling EmployeesApi#getList");
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

[**EmployeeQueryModel**](EmployeeQueryModel.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;odata.metadata=minimal;odata.streaming=true; version=2, application/json;odata.metadata=minimal;odata.streaming=false; version=2, application/json;odata.metadata=minimal; version=2, application/json;odata.metadata=full;odata.streaming=true; version=2, application/json;odata.metadata=full;odata.streaming=false; version=2, application/json;odata.metadata=full; version=2, application/json;odata.metadata=none;odata.streaming=true; version=2, application/json;odata.metadata=none;odata.streaming=false; version=2, application/json;odata.metadata=none; version=2, application/json;odata.streaming=true; version=2, application/json;odata.streaming=false; version=2, application/json; version=2, application/xml; version=2, application/prs.odatatestxx-odata; version=2, text/plain; version=2, text/json; version=2

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateById"></a>
# **updateById**
> updateById(id).updateEmployeeCommand(updateEmployeeCommand).execute();

Update an Employee referenced by ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IrisSoftwareGroupCascade;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
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
    String id = "id_example"; // The ID of Employee to update.
    String displayId = "displayId_example"; // The Display ID of the Employee. <br />  If provided must be unqiue, If null then it will automatically be generated. <br />  Cascade Source: [Employee].[DisplayEmployeeId]
    String titleHonorific = "titleHonorific_example"; // The Title of the Employee. E.g. Mr, Mrs, Miss. <br />  Cascade Source: [Employee].[Title] translated through the TITLE system list.
    String firstName = "firstName_example"; // The First Name of the Employee. <br />  Required. <br />  Cascade Source: [Employee].[Forename]
    String knownAs = "knownAs_example"; // The name the Employee is commonly known as. <br />  Cascade Source: [Employee].[KnownAs]
    String otherName = "otherName_example"; // Any other name that the Employee has. <br />  Cascade Source: [Employee].[OtherName]
    String lastName = "lastName_example"; // The Last Name, Surname or Family Name of the Employee. <br />  Required. <br />  Cascade Source: [Employee].[Surname]
    String costCentre = "costCentre_example"; // The Cost Centre assigned to the Employee. <br />  Cascade Source: [Employee].[CostCentre]
    String workingStatus = "workingStatus_example"; // The Status of the Employee E.g. On Holiday, Sick. <br />  Automatically Calculated. <br />  Cascade Source: [Sysview_Employee_Status].[StatusDescription]
    Boolean isManager = true; // Indicates if the Employee is a Manager. <br />  True if any other Employee's active <see cref=\\\"T:Iris.Api.Hr.Employee.Domain.Entities.V1.Job\\\">Job</see> has this Employee as their Line Manager. <br />  Automaticaly Calculated.
    String nationalInsuranceNumber = "nationalInsuranceNumber_example"; // The National Insurance Number of the Employee. <br />  Cascade Source: [Employee].[NationalInsuranceNo]
    String payrollId = "payrollId_example"; // The Payroll ID of the Employee. <br />  Cascade Source: [Employee].[PayrollId]
    String taxCode = "taxCode_example"; // The Tax Code of the Employee. <br />  Cascade Source: [Employee].[TaxCode]
    Boolean includeInPayroll = true; // Indicates if the Employee should be included in Payroll. <br />  Cascade Source: [Employee].[IncludeInPayroll]
    OffsetDateTime employmentStartDate = OffsetDateTime.now(); // The date the Employee started with their current Employer. <br />  Cascade Source: [Employee].[EmployeeStartDate]
    OffsetDateTime employmentLeftDate = OffsetDateTime.now(); // The date the Employee left their current Employer. <br />  Cascade Source: [Employee].[EmployementLeftDate]
    OffsetDateTime continuousServiceDate = OffsetDateTime.now(); // The date the Employee's continuous service should be applied from. <br />  Cascade Source: [Employee].[ContServiceDate]
    OffsetDateTime dateOfBirth = OffsetDateTime.now(); // The Date of Birth of the Employee. <br />  Cascade Source: [Employee].[DateOfBirth]
    OffsetDateTime lastWorkingDate = OffsetDateTime.now(); // The date of the last working date of the Employee. <br />  Cascade Source: [Employee].[LeaverLastWorkDate]
    String gender = "gender_example"; // The Gender of the Employee. <br />  Cascade Source: [Employee].[Sex] translated through the GENDER system list.
    String ethnicity = "ethnicity_example"; // The Ethnicity of the Employee. <br />  Cascade Source: [Employee].[EthnicOrigin] translated through the ETHNICTORIGIN system list.
    String nationality = "nationality_example"; // The Nationality of the Employee. <br />  Cascade Source: [Employee].[Nationality] translated through the NATIONALITY system list.
    String religion = "religion_example"; // The Religion of the Employee. <br />  Cascade Source: [Employee].[Religion] transalated through the RELIGION system list.
    String leaverReason = "leaverReason_example"; // The reason for the Employee to Leave. <br />  Cascade Source: [Employee].[LeaverReason]
    String maritalStatus = "maritalStatus_example"; // The marrital status of the Employee. <br />  Cascade Source: [Employee.[MaritalStatus] translated through the MARITALSTATUS system list.
    List<Phone> phones = Arrays.asList(); // The <see cref=\\\"T:Iris.Api.Hr.Employee.Domain.Entities.V1.Phone\\\">Phone Numbers</see> belonging to the Employee.
    List<Email> emails = Arrays.asList(); // The <see cref=\\\"T:Iris.Api.Hr.Employee.Domain.Entities.V1.Email\\\">Email Addresses</see> belonging to the Employee.
    List<Address> addresses = Arrays.asList(); // The <see cref=\\\"T:Iris.Api.Hr.Employee.Domain.Entities.V1.Address\\\">Addresses</see> belonging to the Employee.
    String genderIdentity = "genderIdentity_example"; // The Gender Identity of the Employee. <br />  Cascade Source: [Employee].[GenderIdentity] translated through the GenderIdentity system list.
    String windowsUsername = "windowsUsername_example"; // The Windows Username of the Employee. <br />  Cascade Source: [Employee].[WindowsUsername]
    String id = "id_example"; // The ID of the Employee. <br />  Must exist in the Employee Service.
    try {
      client
              .employees
              .updateById(id)
              .displayId(displayId)
              .titleHonorific(titleHonorific)
              .firstName(firstName)
              .knownAs(knownAs)
              .otherName(otherName)
              .lastName(lastName)
              .costCentre(costCentre)
              .workingStatus(workingStatus)
              .isManager(isManager)
              .nationalInsuranceNumber(nationalInsuranceNumber)
              .payrollId(payrollId)
              .taxCode(taxCode)
              .includeInPayroll(includeInPayroll)
              .employmentStartDate(employmentStartDate)
              .employmentLeftDate(employmentLeftDate)
              .continuousServiceDate(continuousServiceDate)
              .dateOfBirth(dateOfBirth)
              .lastWorkingDate(lastWorkingDate)
              .gender(gender)
              .ethnicity(ethnicity)
              .nationality(nationality)
              .religion(religion)
              .leaverReason(leaverReason)
              .maritalStatus(maritalStatus)
              .phones(phones)
              .emails(emails)
              .addresses(addresses)
              .genderIdentity(genderIdentity)
              .windowsUsername(windowsUsername)
              .id(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#updateById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .employees
              .updateById(id)
              .displayId(displayId)
              .titleHonorific(titleHonorific)
              .firstName(firstName)
              .knownAs(knownAs)
              .otherName(otherName)
              .lastName(lastName)
              .costCentre(costCentre)
              .workingStatus(workingStatus)
              .isManager(isManager)
              .nationalInsuranceNumber(nationalInsuranceNumber)
              .payrollId(payrollId)
              .taxCode(taxCode)
              .includeInPayroll(includeInPayroll)
              .employmentStartDate(employmentStartDate)
              .employmentLeftDate(employmentLeftDate)
              .continuousServiceDate(continuousServiceDate)
              .dateOfBirth(dateOfBirth)
              .lastWorkingDate(lastWorkingDate)
              .gender(gender)
              .ethnicity(ethnicity)
              .nationality(nationality)
              .religion(religion)
              .leaverReason(leaverReason)
              .maritalStatus(maritalStatus)
              .phones(phones)
              .emails(emails)
              .addresses(addresses)
              .genderIdentity(genderIdentity)
              .windowsUsername(windowsUsername)
              .id(id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#updateById");
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
| **id** | **String**| The ID of Employee to update. | |
| **updateEmployeeCommand** | [**UpdateEmployeeCommand**](UpdateEmployeeCommand.md)| The new state of the Employee. | [optional] |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json;odata.metadata=minimal;odata.streaming=true; version=2, application/json;odata.metadata=minimal;odata.streaming=false; version=2, application/json;odata.metadata=minimal; version=2, application/json;odata.metadata=full;odata.streaming=true; version=2, application/json;odata.metadata=full;odata.streaming=false; version=2, application/json;odata.metadata=full; version=2, application/json;odata.metadata=none;odata.streaming=true; version=2, application/json;odata.metadata=none;odata.streaming=false; version=2, application/json;odata.metadata=none; version=2, application/json;odata.streaming=true; version=2, application/json;odata.streaming=false; version=2, application/json; version=2, application/xml; version=2, application/prs.odatatestxx-odata; version=2, text/json; version=2, application/*+json; version=2
 - **Accept**: application/json;odata.metadata=minimal;odata.streaming=true; version=2, application/json;odata.metadata=minimal;odata.streaming=false; version=2, application/json;odata.metadata=minimal; version=2, application/json;odata.metadata=full;odata.streaming=true; version=2, application/json;odata.metadata=full;odata.streaming=false; version=2, application/json;odata.metadata=full; version=2, application/json;odata.metadata=none;odata.streaming=true; version=2, application/json;odata.metadata=none;odata.streaming=false; version=2, application/json;odata.metadata=none; version=2, application/json;odata.streaming=true; version=2, application/json;odata.streaming=false; version=2, application/json; version=2, application/xml; version=2, application/prs.odatatestxx-odata; version=2, text/plain; version=2, text/json; version=2

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Success |  -  |

