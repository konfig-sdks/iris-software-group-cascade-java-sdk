# PublicHolidaysApi

All URIs are relative to *https://api.iris.co.uk/hr/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getLocationListById**](PublicHolidaysApi.md#getLocationListById) | **GET** /publicholidays/{id} | Gets a location based Public Holiday list by ID. |
| [**getLocations**](PublicHolidaysApi.md#getLocations) | **GET** /publicholidays | Gets a set of Public Holidays with locations. |


<a name="getLocationListById"></a>
# **getLocationListById**
> PublicHolidayModel getLocationListById(id).execute();

Gets a location based Public Holiday list by ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IrisSoftwareGroupCascade;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PublicHolidaysApi;
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
    String id = "id_example"; // Public Holiday ID.
    try {
      PublicHolidayModel result = client
              .publicHolidays
              .getLocationListById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getDays());
      System.out.println(result.getId());
      System.out.println(result.getCreatedOn());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getLastModifiedOn());
      System.out.println(result.getLastModifiedBy());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicHolidaysApi#getLocationListById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PublicHolidayModel> response = client
              .publicHolidays
              .getLocationListById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicHolidaysApi#getLocationListById");
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
| **id** | **String**| Public Holiday ID. | |

### Return type

[**PublicHolidayModel**](PublicHolidayModel.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;odata.metadata=minimal;odata.streaming=true; version=1, application/json;odata.metadata=minimal;odata.streaming=false; version=1, application/json;odata.metadata=minimal; version=1, application/json;odata.metadata=full;odata.streaming=true; version=1, application/json;odata.metadata=full;odata.streaming=false; version=1, application/json;odata.metadata=full; version=1, application/json;odata.metadata=none;odata.streaming=true; version=1, application/json;odata.metadata=none;odata.streaming=false; version=1, application/json;odata.metadata=none; version=1, application/json;odata.streaming=true; version=1, application/json;odata.streaming=false; version=1, application/json; version=1, application/xml; version=1, application/prs.odatatestxx-odata; version=1, text/plain; version=1, text/json; version=1

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getLocations"></a>
# **getLocations**
> PublicHolidayQueryModel getLocations().$top($top).$skip($skip).$filter($filter).$select($select).$orderby($orderby).$count($count).execute();

Gets a set of Public Holidays with locations.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IrisSoftwareGroupCascade;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PublicHolidaysApi;
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
      PublicHolidayQueryModel result = client
              .publicHolidays
              .getLocations()
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
      System.err.println("Exception when calling PublicHolidaysApi#getLocations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PublicHolidayQueryModel> response = client
              .publicHolidays
              .getLocations()
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
      System.err.println("Exception when calling PublicHolidaysApi#getLocations");
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

[**PublicHolidayQueryModel**](PublicHolidayQueryModel.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;odata.metadata=minimal;odata.streaming=true; version=1, application/json;odata.metadata=minimal;odata.streaming=false; version=1, application/json;odata.metadata=minimal; version=1, application/json;odata.metadata=full;odata.streaming=true; version=1, application/json;odata.metadata=full;odata.streaming=false; version=1, application/json;odata.metadata=full; version=1, application/json;odata.metadata=none;odata.streaming=true; version=1, application/json;odata.metadata=none;odata.streaming=false; version=1, application/json;odata.metadata=none; version=1, application/json;odata.streaming=true; version=1, application/json;odata.streaming=false; version=1, application/json; version=1, application/xml; version=1, application/prs.odatatestxx-odata; version=1, text/plain; version=1, text/json; version=1

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

