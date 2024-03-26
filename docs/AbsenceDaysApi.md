# AbsenceDaysApi

All URIs are relative to *https://api.iris.co.uk/hr/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAbsenceDay**](AbsenceDaysApi.md#createAbsenceDay) | **POST** /attendance/absencedays | Creates an Absence Day. |
| [**deleteById**](AbsenceDaysApi.md#deleteById) | **DELETE** /attendance/absencedays/{id} | Deletes an Absence Day. |
| [**getById**](AbsenceDaysApi.md#getById) | **GET** /attendance/absencedays/{id} | Gets a single Absence Day based on ID given. |
| [**getList**](AbsenceDaysApi.md#getList) | **GET** /attendance/absencedays | Gets a list of all Absence Days. |
| [**updateAbsenceDay**](AbsenceDaysApi.md#updateAbsenceDay) | **PUT** /attendance/absencedays/{id} | Updates an Absence Day. |


<a name="createAbsenceDay"></a>
# **createAbsenceDay**
> String createAbsenceDay().createAbsenceDayCommand(createAbsenceDayCommand).execute();

Creates an Absence Day.

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
import com.konfigthis.client.api.AbsenceDaysApi;
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
    String absenceId = "absenceId_example"; // The ID of the parent Absence. <br />  Must exist in the Attendance Absence Service.
    String employeeId = "employeeId_example"; // The ID of the Employee. <br />  Must exist in the Employees Service.
    OffsetDateTime date = OffsetDateTime.now(); // The date of the Absence Day. <br />  Cascade Source: [EmployeeAttendanceDates].[StartDate]
    Double durationDays = 3.4D; // The duration in days for this Absence Day. <br />  Cascade Source: [EmployeeAttendanceDates].[DurationDays]
    Integer durationMinutes = 56; // The duration in minutes for this Absence Day. <br />  Cascade Source: [EmployeeAttendanceDates].[Duration]
    DayPart dayPart = DayPart.fromValue("AM");
    try {
      String result = client
              .absenceDays
              .createAbsenceDay()
              .absenceId(absenceId)
              .employeeId(employeeId)
              .date(date)
              .durationDays(durationDays)
              .durationMinutes(durationMinutes)
              .dayPart(dayPart)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsenceDaysApi#createAbsenceDay");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .absenceDays
              .createAbsenceDay()
              .absenceId(absenceId)
              .employeeId(employeeId)
              .date(date)
              .durationDays(durationDays)
              .durationMinutes(durationMinutes)
              .dayPart(dayPart)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsenceDaysApi#createAbsenceDay");
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
| **createAbsenceDayCommand** | [**CreateAbsenceDayCommand**](CreateAbsenceDayCommand.md)| The values for an Absence Day. | [optional] |

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

Deletes an Absence Day.

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
import com.konfigthis.client.api.AbsenceDaysApi;
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
    String id = "id_example"; // The ID of the Absence Day to delete.
    try {
      client
              .absenceDays
              .deleteById(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsenceDaysApi#deleteById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .absenceDays
              .deleteById(id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsenceDaysApi#deleteById");
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
| **id** | **String**| The ID of the Absence Day to delete. | |

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
> AbsenceDayModel getById(id).execute();

Gets a single Absence Day based on ID given.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IrisSoftwareGroupCascade;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AbsenceDaysApi;
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
    String id = "id_example"; // Absence Day ID.
    try {
      AbsenceDayModel result = client
              .absenceDays
              .getById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getAbsenceId());
      System.out.println(result.getEmployeeId());
      System.out.println(result.getDate());
      System.out.println(result.getDurationDays());
      System.out.println(result.getDurationMinutes());
      System.out.println(result.getDayPart());
      System.out.println(result.getSourceSystemId());
      System.out.println(result.getId());
      System.out.println(result.getCreatedOn());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getLastModifiedOn());
      System.out.println(result.getLastModifiedBy());
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsenceDaysApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AbsenceDayModel> response = client
              .absenceDays
              .getById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsenceDaysApi#getById");
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
| **id** | **String**| Absence Day ID. | |

### Return type

[**AbsenceDayModel**](AbsenceDayModel.md)

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
> AbsenceDayQueryModel getList().$top($top).$skip($skip).$filter($filter).$select($select).$orderby($orderby).$count($count).execute();

Gets a list of all Absence Days.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IrisSoftwareGroupCascade;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AbsenceDaysApi;
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
      AbsenceDayQueryModel result = client
              .absenceDays
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
      System.err.println("Exception when calling AbsenceDaysApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AbsenceDayQueryModel> response = client
              .absenceDays
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
      System.err.println("Exception when calling AbsenceDaysApi#getList");
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

[**AbsenceDayQueryModel**](AbsenceDayQueryModel.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;odata.metadata=minimal;odata.streaming=true; version=1, application/json;odata.metadata=minimal;odata.streaming=false; version=1, application/json;odata.metadata=minimal; version=1, application/json;odata.metadata=full;odata.streaming=true; version=1, application/json;odata.metadata=full;odata.streaming=false; version=1, application/json;odata.metadata=full; version=1, application/json;odata.metadata=none;odata.streaming=true; version=1, application/json;odata.metadata=none;odata.streaming=false; version=1, application/json;odata.metadata=none; version=1, application/json;odata.streaming=true; version=1, application/json;odata.streaming=false; version=1, application/json; version=1, application/xml; version=1, application/prs.odatatestxx-odata; version=1, text/plain; version=1, text/json; version=1

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateAbsenceDay"></a>
# **updateAbsenceDay**
> updateAbsenceDay(id).updateAbsenceDayCommand(updateAbsenceDayCommand).execute();

Updates an Absence Day.

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
import com.konfigthis.client.api.AbsenceDaysApi;
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
    String id = "id_example"; // The ID of the Absence Day to update.
    OffsetDateTime date = OffsetDateTime.now(); // The date of the Absence Day. <br />  Cascade Source: [EmployeeAttendanceDates].[StartDate]
    Double durationDays = 3.4D; // The duration in days for this Absence Day. <br />  Cascade Source: [EmployeeAttendanceDates].[DurationDays]
    Integer durationMinutes = 56; // The duration in minutes for this Absence Day. <br />  Cascade Source: [EmployeeAttendanceDates].[Duration]
    DayPart dayPart = DayPart.fromValue("AM");
    String id = "id_example"; // The ID of the Absence Day. <br />  Must exist in the Attendance Absence Day Service.
    try {
      client
              .absenceDays
              .updateAbsenceDay(id)
              .date(date)
              .durationDays(durationDays)
              .durationMinutes(durationMinutes)
              .dayPart(dayPart)
              .id(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsenceDaysApi#updateAbsenceDay");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .absenceDays
              .updateAbsenceDay(id)
              .date(date)
              .durationDays(durationDays)
              .durationMinutes(durationMinutes)
              .dayPart(dayPart)
              .id(id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AbsenceDaysApi#updateAbsenceDay");
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
| **id** | **String**| The ID of the Absence Day to update. | |
| **updateAbsenceDayCommand** | [**UpdateAbsenceDayCommand**](UpdateAbsenceDayCommand.md)| The value of an Absence Day. | [optional] |

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

