# AbsencesApi

All URIs are relative to *https://api.iris.co.uk/hr/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewAbsence**](AbsencesApi.md#createNewAbsence) | **POST** /attendance/absences | Creates a new Absence. |
| [**deleteById**](AbsencesApi.md#deleteById) | **DELETE** /attendance/absences/{id} | Delete an Absence referenced by ID. |
| [**getById**](AbsencesApi.md#getById) | **GET** /attendance/absences/{id} | Gets a single Absence referenced by ID. |
| [**getList**](AbsencesApi.md#getList) | **GET** /attendance/absences | Gets a list of Absences. |
| [**updateById**](AbsencesApi.md#updateById) | **PUT** /attendance/absences/{id} | Update an Absence referenced by ID. |


<a name="createNewAbsence"></a>
# **createNewAbsence**
> String createNewAbsence().createAbsenceCommand(createAbsenceCommand).execute();

Creates a new Absence.

![Beta](https://img.shields.io/badge/Status-Beta-yellow) &lt;b&gt;This API request method is currently in beta testing.&lt;/b&gt; To gain access to use this method, please contact &lt;a href&#x3D;&#39;mailto:hrapi@iris.co.uk&#39;&gt;hrapi@iris.co.uk.&lt;/a&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IrisSoftwareGroupCascade;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AbsencesApi;
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
    String employeeId = "employeeId_example"; // The ID of the Employee. <br />  Must exist in the Employees Service. <br />  Cannot be updated once Absence created.
    String absenceReasonId = "absenceReasonId_example"; // The Absence Reason ID. <br />  Must exist in the Attendance Absence Reasons Service. <br />  Cannot be updated once Absence created.
    String narrative = "narrative_example"; // The Narrative relating to the Attendance. <br />  Cascade Source: [EmployeeAttendance].[Narrative]
    OffsetDateTime startDate = OffsetDateTime.now(); // The Start Date of the Attendance. <br />  Cascade Source: [EmployeeAttendance].[StartDate]
    OffsetDateTime endDate = OffsetDateTime.now(); // The End Date of the Attendance. <br />  Cascade Source: [EmployeeAttendance].[EndDate]  Null if Opened Ended - Cascade Source: [EmployeeAttendance].[OpenEnded]
    try {
      String result = client
              .absences
              .createNewAbsence()
              .employeeId(employeeId)
              .absenceReasonId(absenceReasonId)
              .narrative(narrative)
              .startDate(startDate)
              .endDate(endDate)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsencesApi#createNewAbsence");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .absences
              .createNewAbsence()
              .employeeId(employeeId)
              .absenceReasonId(absenceReasonId)
              .narrative(narrative)
              .startDate(startDate)
              .endDate(endDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsencesApi#createNewAbsence");
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
| **createAbsenceCommand** | [**CreateAbsenceCommand**](CreateAbsenceCommand.md)| New Absence. | [optional] |

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

<a name="deleteById"></a>
# **deleteById**
> deleteById(id).execute();

Delete an Absence referenced by ID.

![Beta](https://img.shields.io/badge/Status-Beta-yellow) &lt;b&gt;This API request method is currently in beta testing.&lt;/b&gt; To gain access to use this method, please contact &lt;a href&#x3D;&#39;mailto:hrapi@iris.co.uk&#39;&gt;hrapi@iris.co.uk.&lt;/a&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IrisSoftwareGroupCascade;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AbsencesApi;
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
    String id = "id_example"; // The ID of the Absence to delete.
    try {
      client
              .absences
              .deleteById(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsencesApi#deleteById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .absences
              .deleteById(id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsencesApi#deleteById");
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
| **id** | **String**| The ID of the Absence to delete. | |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Success |  -  |

<a name="getById"></a>
# **getById**
> AbsenceModel getById(id).execute();

Gets a single Absence referenced by ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IrisSoftwareGroupCascade;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AbsencesApi;
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
    String id = "id_example"; // Absence ID.
    try {
      AbsenceModel result = client
              .absences
              .getById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmployeeId());
      System.out.println(result.getAbsenceReasonId());
      System.out.println(result.getNarrative());
      System.out.println(result.getStartDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getSourceSystemId());
      System.out.println(result.getSourceSystemCreatedOn());
      System.out.println(result.getSourceSystemLastModifiedOn());
      System.out.println(result.getId());
      System.out.println(result.getCreatedOn());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getLastModifiedOn());
      System.out.println(result.getLastModifiedBy());
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsencesApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AbsenceModel> response = client
              .absences
              .getById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsencesApi#getById");
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
| **id** | **String**| Absence ID. | |

### Return type

[**AbsenceModel**](AbsenceModel.md)

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
> AbsenceQueryModel getList().$top($top).$skip($skip).$filter($filter).$select($select).$orderby($orderby).$count($count).execute();

Gets a list of Absences.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IrisSoftwareGroupCascade;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AbsencesApi;
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
      AbsenceQueryModel result = client
              .absences
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
      System.err.println("Exception when calling AbsencesApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AbsenceQueryModel> response = client
              .absences
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
      System.err.println("Exception when calling AbsencesApi#getList");
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

[**AbsenceQueryModel**](AbsenceQueryModel.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;odata.metadata=minimal;odata.streaming=true; version=1, application/json;odata.metadata=minimal;odata.streaming=false; version=1, application/json;odata.metadata=minimal; version=1, application/json;odata.metadata=full;odata.streaming=true; version=1, application/json;odata.metadata=full;odata.streaming=false; version=1, application/json;odata.metadata=full; version=1, application/json;odata.metadata=none;odata.streaming=true; version=1, application/json;odata.metadata=none;odata.streaming=false; version=1, application/json;odata.metadata=none; version=1, application/json;odata.streaming=true; version=1, application/json;odata.streaming=false; version=1, application/json; version=1, application/xml; version=1, application/prs.odatatestxx-odata; version=1, text/plain; version=1, text/json; version=1

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateById"></a>
# **updateById**
> updateById(id).updateAbsenceCommand(updateAbsenceCommand).execute();

Update an Absence referenced by ID.

![Beta](https://img.shields.io/badge/Status-Beta-yellow) &lt;b&gt;This API request method is currently in beta testing.&lt;/b&gt; To gain access to use this method, please contact &lt;a href&#x3D;&#39;mailto:hrapi@iris.co.uk&#39;&gt;hrapi@iris.co.uk.&lt;/a&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IrisSoftwareGroupCascade;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AbsencesApi;
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
    String id = "id_example"; // The ID of the Absence to update.
    String narrative = "narrative_example"; // The Narrative relating to the Attendance. <br />  Cascade Source: [EmployeeAttendance].[Narrative]
    OffsetDateTime startDate = OffsetDateTime.now(); // The Start Date of the Attendance. <br />  Cascade Source: [EmployeeAttendance].[StartDate]
    OffsetDateTime endDate = OffsetDateTime.now(); // The End Date of the Attendance. <br />  Cascade Source: [EmployeeAttendance].[EndDate]  Null if Opened Ended - Cascade Source: [EmployeeAttendance].[OpenEnded]
    String id = "id_example"; // The ID of the Absence. <br />  Must exist in the Attendance Absences Service.
    try {
      client
              .absences
              .updateById(id)
              .narrative(narrative)
              .startDate(startDate)
              .endDate(endDate)
              .id(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsencesApi#updateById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .absences
              .updateById(id)
              .narrative(narrative)
              .startDate(startDate)
              .endDate(endDate)
              .id(id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsencesApi#updateById");
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
| **id** | **String**| The ID of the Absence to update. | |
| **updateAbsenceCommand** | [**UpdateAbsenceCommand**](UpdateAbsenceCommand.md)| The new state of the Absence. | [optional] |

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

