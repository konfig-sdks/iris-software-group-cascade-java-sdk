# JobsApi

All URIs are relative to *https://api.iris.co.uk/hr/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewJob**](JobsApi.md#createNewJob) | **POST** /jobs | Creates a new Job. |
| [**getById**](JobsApi.md#getById) | **GET** /jobs/{id} | Gets a single Job referenced by an ID. |
| [**getList**](JobsApi.md#getList) | **GET** /jobs | Gets a list of Jobs. |
| [**updateById**](JobsApi.md#updateById) | **PUT** /jobs/{id} | Update a Job referenced by an ID. |


<a name="createNewJob"></a>
# **createNewJob**
> String createNewJob().createJobCommand(createJobCommand).execute();

Creates a new Job.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IrisSoftwareGroupCascade;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobsApi;
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
    String jobTitle = "jobTitle_example"; // The title of the Job. <br />  Cascade Source: [EmployeeJobs].[JobTitle]
    String classification = "classification_example"; // The classification of the Job e.g. Technical, Professional, Managerial. <br />  Cascade Source: [EmployeeJobs].[Classification] translated through the JOBCLASSIFICATION system list.
    OffsetDateTime startDate = OffsetDateTime.now(); // The start date of the Job. <br />  Required. <br />  Cascade Source: [EmployeeJobs].[SYS_EffectiveDate]
    OffsetDateTime endDate = OffsetDateTime.now(); // The end date of the Job. <br />  Automatically Calculated. <br />  Cascade Source: [EmployeeJobs].[SYS_CalculatedEndDate]
    String workingCalendar = "workingCalendar_example"; // The name of the working calendar of the Job. <br />  Cascade Source: [EmployeeJobs].[CalendarName] which comes from [ValidWorkingCalendar].[CalendarName]
    String lineManagerId = "lineManagerId_example"; // The ID of the Employee that is the line manager for this Job. <br />  Must exist in Employees Service. <br />  Cascade Source: [EmployeeJobs].[WorksForEmployeeId]
    String hierarchyNodeId = "hierarchyNodeId_example"; // The ID of the Employee's Hierarchy node of the Job. <br />  Must exist in Hierarchy Service.
    Boolean active = true; // The Job is currently active. <br />  Automatically Calculated. <br />  Cascade Source: [EmployeeJobs].[sys_ActiveJob]
    Double salary = 3.4D; // The salary of the Job. <br />  Cascade Source: [EmployeeJobs].[BasicPay]
    String employeeId = "employeeId_example"; // The ID of the Employee of the Job. <br />  Must exist in Employee Service.
    String contract = "contract_example"; // The contract of the Job e.g. Full Time, Part Time. <br />  Cascade Source: [EmployeeJobs].[ContractType] translated through the EMPLOYMENTTYPES system list.
    String payFrequency = "payFrequency_example"; // How often the Job's salary will be paid e.g. Monthly, Weekly. <br />  Cascade Source: [EmployeeJobs].[PayFrequency] translated through the PAY FREQ system list.
    String payBasis = "payBasis_example"; // The unit of measurement the salary is specified against e.g. Yearly, Hourly. <br />  Cascade Source: [EmployeeJobs].[PayBasis] translated through the PAY BASIS system list.
    Double fullTimeEquivalent = 3.4D; // The full-time equivalent to a full time employee's hours e.g. 1 = Full Time, 0.5 = Half Hours. <br />  Cascade Source: [EmployeeJobs].[FTE].
    String changeReason = "changeReason_example"; // The reason for the change. <br />  Cascade Source: [EmployeeJobs].[Reason].
    OffsetDateTime nextIncrementDate = OffsetDateTime.now(); // The next increment date.  <br />  Cascade Source: [EmployeeJobs].[IncrementDate].
    String timesheetLocation = "timesheetLocation_example"; // The timesheet location. <br />  Cascade Source: [EmployeeJobs].[TimesheetLocation].
    String timesheetLunchDuration = "timesheetLunchDuration_example"; // The time set lunch duration. <br />  Cascade Source: [EmployeeJobs].[LunchDuration].
    String expenseSubmissionFrequency = "expenseSubmissionFrequency_example"; // The expense submission frequency. <br />  Cascade Source: [EmployeeJobs].[ExpenseSubmissionFrequency].
    String costCentre = "costCentre_example"; // The cost centre. <br />  Cascade Source: [EmployeeJobs].[CostCentre].
    String jobFamily = "jobFamily_example"; // The job family. <br />  Cascade Source: [EmployeeJobs].[JobFamily].
    Boolean apprenticeUnder25 = true; // The flag to indicate if the employee is an apprentice under 25. <br />  Cascade Source: [EmployeeJobs].[ApprenticeUnder25].
    OffsetDateTime apprenticeshipEndDate = OffsetDateTime.now(); // The end date of the apprenticeship. <br />  Cascade Source: [EmployeeJobs].[ApprenticeshipEndDate].
    OffsetDateTime contractEndDate = OffsetDateTime.now(); // The end date of the contract. <br />  Cascade Source: [EmployeeJobs].[ContractEndDate].
    Double normalHours = 3.4D; // Normal hours. <br />  Cascade Source: [EmployeeJobs].[NormalHours].
    String realTimeInformationIrregularFrequency = "realTimeInformationIrregularFrequency_example"; // The real time information of irregular frequency. <br />  Cascade Source: [EmployeeJobs].[RTIIrregularFrequency].
    String noticePeriod = "noticePeriod_example"; // The notice period. <br />  Cascade Source: [EmployeeJobs].[NoticePeriod].
    try {
      String result = client
              .jobs
              .createNewJob()
              .jobTitle(jobTitle)
              .classification(classification)
              .startDate(startDate)
              .endDate(endDate)
              .workingCalendar(workingCalendar)
              .lineManagerId(lineManagerId)
              .hierarchyNodeId(hierarchyNodeId)
              .active(active)
              .salary(salary)
              .employeeId(employeeId)
              .contract(contract)
              .payFrequency(payFrequency)
              .payBasis(payBasis)
              .fullTimeEquivalent(fullTimeEquivalent)
              .changeReason(changeReason)
              .nextIncrementDate(nextIncrementDate)
              .timesheetLocation(timesheetLocation)
              .timesheetLunchDuration(timesheetLunchDuration)
              .expenseSubmissionFrequency(expenseSubmissionFrequency)
              .costCentre(costCentre)
              .jobFamily(jobFamily)
              .apprenticeUnder25(apprenticeUnder25)
              .apprenticeshipEndDate(apprenticeshipEndDate)
              .contractEndDate(contractEndDate)
              .normalHours(normalHours)
              .realTimeInformationIrregularFrequency(realTimeInformationIrregularFrequency)
              .noticePeriod(noticePeriod)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#createNewJob");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .jobs
              .createNewJob()
              .jobTitle(jobTitle)
              .classification(classification)
              .startDate(startDate)
              .endDate(endDate)
              .workingCalendar(workingCalendar)
              .lineManagerId(lineManagerId)
              .hierarchyNodeId(hierarchyNodeId)
              .active(active)
              .salary(salary)
              .employeeId(employeeId)
              .contract(contract)
              .payFrequency(payFrequency)
              .payBasis(payBasis)
              .fullTimeEquivalent(fullTimeEquivalent)
              .changeReason(changeReason)
              .nextIncrementDate(nextIncrementDate)
              .timesheetLocation(timesheetLocation)
              .timesheetLunchDuration(timesheetLunchDuration)
              .expenseSubmissionFrequency(expenseSubmissionFrequency)
              .costCentre(costCentre)
              .jobFamily(jobFamily)
              .apprenticeUnder25(apprenticeUnder25)
              .apprenticeshipEndDate(apprenticeshipEndDate)
              .contractEndDate(contractEndDate)
              .normalHours(normalHours)
              .realTimeInformationIrregularFrequency(realTimeInformationIrregularFrequency)
              .noticePeriod(noticePeriod)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#createNewJob");
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
| **createJobCommand** | [**CreateJobCommand**](CreateJobCommand.md)| New Job. | [optional] |

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
> String getById(id).execute();

Gets a single Job referenced by an ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IrisSoftwareGroupCascade;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobsApi;
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
    String id = "id_example"; // Job ID.
    try {
      String result = client
              .jobs
              .getById(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .jobs
              .getById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#getById");
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
| **id** | **String**| Job ID. | |

### Return type

**String**

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
> JobQueryModel getList().$top($top).$skip($skip).$filter($filter).$select($select).$orderby($orderby).$count($count).execute();

Gets a list of Jobs.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IrisSoftwareGroupCascade;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobsApi;
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
      JobQueryModel result = client
              .jobs
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
      System.err.println("Exception when calling JobsApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JobQueryModel> response = client
              .jobs
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
      System.err.println("Exception when calling JobsApi#getList");
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

[**JobQueryModel**](JobQueryModel.md)

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
> updateById(id).updateJobCommand(updateJobCommand).execute();

Update a Job referenced by an ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IrisSoftwareGroupCascade;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobsApi;
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
    String id = "id_example"; // The ID of the Job to update.
    String jobTitle = "jobTitle_example"; // The title of the Job. <br />  Cascade Source: [EmployeeJobs].[JobTitle]
    String classification = "classification_example"; // The classification of the Job e.g. Technical, Professional, Managerial. <br />  Cascade Source: [EmployeeJobs].[Classification] translated through the JOBCLASSIFICATION system list.
    OffsetDateTime startDate = OffsetDateTime.now(); // The start date of the Job. <br />  Required. <br />  Cascade Source: [EmployeeJobs].[SYS_EffectiveDate]
    OffsetDateTime endDate = OffsetDateTime.now(); // The end date of the Job. <br />  Automatically Calculated. <br />  Cascade Source: [EmployeeJobs].[SYS_CalculatedEndDate]
    String workingCalendar = "workingCalendar_example"; // The name of the working calendar of the Job. <br />  Cascade Source: [EmployeeJobs].[CalendarName] which comes from [ValidWorkingCalendar].[CalendarName]
    String lineManagerId = "lineManagerId_example"; // The ID of the Employee that is the line manager for this Job. <br />  Must exist in Employees Service. <br />  Cascade Source: [EmployeeJobs].[WorksForEmployeeId]
    String hierarchyNodeId = "hierarchyNodeId_example"; // The ID of the Employee's Hierarchy node of the Job. <br />  Must exist in Hierarchy Service.
    Boolean active = true; // The Job is currently active. <br />  Automatically Calculated. <br />  Cascade Source: [EmployeeJobs].[sys_ActiveJob]
    Double salary = 3.4D; // The salary of the Job. <br />  Cascade Source: [EmployeeJobs].[BasicPay]
    String contract = "contract_example"; // The contract of the Job e.g. Full Time, Part Time. <br />  Cascade Source: [EmployeeJobs].[ContractType] translated through the EMPLOYMENTTYPES system list.
    String payFrequency = "payFrequency_example"; // How often the Job's salary will be paid e.g. Monthly, Weekly. <br />  Cascade Source: [EmployeeJobs].[PayFrequency] translated through the PAY FREQ system list.
    String payBasis = "payBasis_example"; // The unit of measurement the salary is specified against e.g. Yearly, Hourly. <br />  Cascade Source: [EmployeeJobs].[PayBasis] translated through the PAY BASIS system list.
    Double fullTimeEquivalent = 3.4D; // The full-time equivalent to a full time employee's hours e.g. 1 = Full Time, 0.5 = Half Hours. <br />  Cascade Source: [EmployeeJobs].[FTE].
    String changeReason = "changeReason_example"; // The reason for the change. <br />  Cascade Source: [EmployeeJobs].[Reason].
    OffsetDateTime nextIncrementDate = OffsetDateTime.now(); // The next increment date.  <br />  Cascade Source: [EmployeeJobs].[IncrementDate].
    String timesheetLocation = "timesheetLocation_example"; // The timesheet location. <br />  Cascade Source: [EmployeeJobs].[TimesheetLocation].
    String timesheetLunchDuration = "timesheetLunchDuration_example"; // The time set lunch duration. <br />  Cascade Source: [EmployeeJobs].[LunchDuration].
    String expenseSubmissionFrequency = "expenseSubmissionFrequency_example"; // The expense submission frequency. <br />  Cascade Source: [EmployeeJobs].[ExpenseSubmissionFrequency].
    String costCentre = "costCentre_example"; // The cost centre. <br />  Cascade Source: [EmployeeJobs].[CostCentre].
    String jobFamily = "jobFamily_example"; // The job family. <br />  Cascade Source: [EmployeeJobs].[JobFamily].
    Boolean apprenticeUnder25 = true; // The flag to indicate if the employee is an apprentice under 25. <br />  Cascade Source: [EmployeeJobs].[ApprenticeUnder25].
    OffsetDateTime apprenticeshipEndDate = OffsetDateTime.now(); // The end date of the apprenticeship. <br />  Cascade Source: [EmployeeJobs].[ApprenticeshipEndDate].
    OffsetDateTime contractEndDate = OffsetDateTime.now(); // The end date of the contract. <br />  Cascade Source: [EmployeeJobs].[ContractEndDate].
    Double normalHours = 3.4D; // Normal hours. <br />  Cascade Source: [EmployeeJobs].[NormalHours].
    String realTimeInformationIrregularFrequency = "realTimeInformationIrregularFrequency_example"; // The real time information of irregular frequency. <br />  Cascade Source: [EmployeeJobs].[RTIIrregularFrequency].
    String noticePeriod = "noticePeriod_example"; // The notice period. <br />  Cascade Source: [EmployeeJobs].[NoticePeriod].
    String id = "id_example"; // The ID of the Job to update. <br />  Must exist in the Jobs Service.
    try {
      client
              .jobs
              .updateById(id)
              .jobTitle(jobTitle)
              .classification(classification)
              .startDate(startDate)
              .endDate(endDate)
              .workingCalendar(workingCalendar)
              .lineManagerId(lineManagerId)
              .hierarchyNodeId(hierarchyNodeId)
              .active(active)
              .salary(salary)
              .contract(contract)
              .payFrequency(payFrequency)
              .payBasis(payBasis)
              .fullTimeEquivalent(fullTimeEquivalent)
              .changeReason(changeReason)
              .nextIncrementDate(nextIncrementDate)
              .timesheetLocation(timesheetLocation)
              .timesheetLunchDuration(timesheetLunchDuration)
              .expenseSubmissionFrequency(expenseSubmissionFrequency)
              .costCentre(costCentre)
              .jobFamily(jobFamily)
              .apprenticeUnder25(apprenticeUnder25)
              .apprenticeshipEndDate(apprenticeshipEndDate)
              .contractEndDate(contractEndDate)
              .normalHours(normalHours)
              .realTimeInformationIrregularFrequency(realTimeInformationIrregularFrequency)
              .noticePeriod(noticePeriod)
              .id(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#updateById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .jobs
              .updateById(id)
              .jobTitle(jobTitle)
              .classification(classification)
              .startDate(startDate)
              .endDate(endDate)
              .workingCalendar(workingCalendar)
              .lineManagerId(lineManagerId)
              .hierarchyNodeId(hierarchyNodeId)
              .active(active)
              .salary(salary)
              .contract(contract)
              .payFrequency(payFrequency)
              .payBasis(payBasis)
              .fullTimeEquivalent(fullTimeEquivalent)
              .changeReason(changeReason)
              .nextIncrementDate(nextIncrementDate)
              .timesheetLocation(timesheetLocation)
              .timesheetLunchDuration(timesheetLunchDuration)
              .expenseSubmissionFrequency(expenseSubmissionFrequency)
              .costCentre(costCentre)
              .jobFamily(jobFamily)
              .apprenticeUnder25(apprenticeUnder25)
              .apprenticeshipEndDate(apprenticeshipEndDate)
              .contractEndDate(contractEndDate)
              .normalHours(normalHours)
              .realTimeInformationIrregularFrequency(realTimeInformationIrregularFrequency)
              .noticePeriod(noticePeriod)
              .id(id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#updateById");
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
| **id** | **String**| The ID of the Job to update. | |
| **updateJobCommand** | [**UpdateJobCommand**](UpdateJobCommand.md)| The new state of the Job. | [optional] |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json;odata.metadata=minimal;odata.streaming=true; version=2, application/json;odata.metadata=minimal;odata.streaming=false; version=2, application/json;odata.metadata=minimal; version=2, application/json;odata.metadata=full;odata.streaming=true; version=2, application/json;odata.metadata=full;odata.streaming=false; version=2, application/json;odata.metadata=full; version=2, application/json;odata.metadata=none;odata.streaming=true; version=2, application/json;odata.metadata=none;odata.streaming=false; version=2, application/json;odata.metadata=none; version=2, application/json;odata.streaming=true; version=2, application/json;odata.streaming=false; version=2, application/json; version=2, application/xml; version=2, application/prs.odatatestxx-odata; version=2, text/json; version=2, application/*+json; version=2
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Success |  -  |

