<div align="center">

[![Visit Iris software group](./header.png)](https://www.iris.co.uk&#x2F;products&#x2F;iris-cascade&#x2F;)

# [Iris software group](https://www.iris.co.uk&#x2F;products&#x2F;iris-cascade&#x2F;)

<a href='swaggerv2.json'>Download Swagger Json in OAS2 Format.</a>

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=IRIS%20Software%20Group&serviceName=Cascade&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>iris-software-group-cascade-java-sdk</artifactId>
  <version>2</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:iris-software-group-cascade-java-sdk:2"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/iris-software-group-cascade-java-sdk-2.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://api.iris.co.uk/hr/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AbsenceDaysApi* | [**createAbsenceDay**](docs/AbsenceDaysApi.md#createAbsenceDay) | **POST** /attendance/absencedays | Creates an Absence Day.
*AbsenceDaysApi* | [**deleteById**](docs/AbsenceDaysApi.md#deleteById) | **DELETE** /attendance/absencedays/{id} | Deletes an Absence Day.
*AbsenceDaysApi* | [**getById**](docs/AbsenceDaysApi.md#getById) | **GET** /attendance/absencedays/{id} | Gets a single Absence Day based on ID given.
*AbsenceDaysApi* | [**getList**](docs/AbsenceDaysApi.md#getList) | **GET** /attendance/absencedays | Gets a list of all Absence Days.
*AbsenceDaysApi* | [**updateAbsenceDay**](docs/AbsenceDaysApi.md#updateAbsenceDay) | **PUT** /attendance/absencedays/{id} | Updates an Absence Day.
*AbsenceReasonsApi* | [**getById**](docs/AbsenceReasonsApi.md#getById) | **GET** /attendance/absencereasons/{id} | Gets a single Absence Reason referenced by ID.
*AbsenceReasonsApi* | [**getEmployeeById**](docs/AbsenceReasonsApi.md#getEmployeeById) | **GET** /attendance/absencereasons/{id}/employees/{employeeId} | Gets a single Employee Absence Reason referenced by ID.
*AbsenceReasonsApi* | [**list**](docs/AbsenceReasonsApi.md#list) | **GET** /attendance/absencereasons | Gets a list of Absence Reasons
*AbsencesApi* | [**createNewAbsence**](docs/AbsencesApi.md#createNewAbsence) | **POST** /attendance/absences | Creates a new Absence.
*AbsencesApi* | [**deleteById**](docs/AbsencesApi.md#deleteById) | **DELETE** /attendance/absences/{id} | Delete an Absence referenced by ID.
*AbsencesApi* | [**getById**](docs/AbsencesApi.md#getById) | **GET** /attendance/absences/{id} | Gets a single Absence referenced by ID.
*AbsencesApi* | [**getList**](docs/AbsencesApi.md#getList) | **GET** /attendance/absences | Gets a list of Absences.
*AbsencesApi* | [**updateById**](docs/AbsencesApi.md#updateById) | **PUT** /attendance/absences/{id} | Update an Absence referenced by ID.
*BankDetailsApi* | [**createBankDetail**](docs/BankDetailsApi.md#createBankDetail) | **POST** /bankdetails | Creates a Bank Details.
*BankDetailsApi* | [**getById**](docs/BankDetailsApi.md#getById) | **GET** /bankdetails/{id} | Gets a single Bank Details by an ID.
*BankDetailsApi* | [**getList**](docs/BankDetailsApi.md#getList) | **GET** /bankdetails | Gets a list of Bank Details.
*BankDetailsApi* | [**updateBankDetail**](docs/BankDetailsApi.md#updateBankDetail) | **PUT** /bankdetails/{id} | Updates Bank Details.
*BenefitsApi* | [**getById**](docs/BenefitsApi.md#getById) | **GET** /benefits/{id} | Gets a single Benefit referenced by ID.
*BenefitsApi* | [**getList**](docs/BenefitsApi.md#getList) | **GET** /benefits | Gets a list of Benefits.
*EmployeesApi* | [**createNewEmployee**](docs/EmployeesApi.md#createNewEmployee) | **POST** /employees | Creates a new Employee.
*EmployeesApi* | [**getById**](docs/EmployeesApi.md#getById) | **GET** /employees/{id} | Gets a single Employee referenced by ID.
*EmployeesApi* | [**getList**](docs/EmployeesApi.md#getList) | **GET** /employees | Gets a list of Employees.
*EmployeesApi* | [**updateById**](docs/EmployeesApi.md#updateById) | **PUT** /employees/{id} | Update an Employee referenced by ID.
*EntitlementsApi* | [**getById**](docs/EntitlementsApi.md#getById) | **GET** /attendance/entitlements/{id} | Gets an Entitlement by ID.
*EntitlementsApi* | [**getList**](docs/EntitlementsApi.md#getList) | **GET** /attendance/entitlements | Gets a list of Entitlements.
*HierarchyApi* | [**getList**](docs/HierarchyApi.md#getList) | **GET** /hierarchy | Gets a list of Hierarchy Nodes.
*HierarchyApi* | [**getNodeById**](docs/HierarchyApi.md#getNodeById) | **GET** /hierarchy/{id} | Gets a single Hierarchy Node by ID.
*HierarchyApi* | [**getPathById**](docs/HierarchyApi.md#getPathById) | **GET** /hierarchy/{id}/path | Gets a Hierarchy Path by ID. The path is an array of nodes traversed from the root to the node specified.
*JobsApi* | [**createNewJob**](docs/JobsApi.md#createNewJob) | **POST** /jobs | Creates a new Job.
*JobsApi* | [**getById**](docs/JobsApi.md#getById) | **GET** /jobs/{id} | Gets a single Job referenced by an ID.
*JobsApi* | [**getList**](docs/JobsApi.md#getList) | **GET** /jobs | Gets a list of Jobs.
*JobsApi* | [**updateById**](docs/JobsApi.md#updateById) | **PUT** /jobs/{id} | Update a Job referenced by an ID.
*PublicHolidaysApi* | [**getLocationListById**](docs/PublicHolidaysApi.md#getLocationListById) | **GET** /publicholidays/{id} | Gets a location based Public Holiday list by ID.
*PublicHolidaysApi* | [**getLocations**](docs/PublicHolidaysApi.md#getLocations) | **GET** /publicholidays | Gets a set of Public Holidays with locations.


## Documentation for Models

 - [AbsenceDayModel](docs/AbsenceDayModel.md)
 - [AbsenceDayQueryModel](docs/AbsenceDayQueryModel.md)
 - [AbsenceModel](docs/AbsenceModel.md)
 - [AbsenceQueryModel](docs/AbsenceQueryModel.md)
 - [AbsenceReasonModel](docs/AbsenceReasonModel.md)
 - [AbsenceReasonQueryModel](docs/AbsenceReasonQueryModel.md)
 - [Address](docs/Address.md)
 - [BankAddress](docs/BankAddress.md)
 - [BankDetailsModel](docs/BankDetailsModel.md)
 - [BankDetailsQueryModel](docs/BankDetailsQueryModel.md)
 - [BenefitModel](docs/BenefitModel.md)
 - [BenefitQueryModel](docs/BenefitQueryModel.md)
 - [CreateAbsenceCommand](docs/CreateAbsenceCommand.md)
 - [CreateAbsenceDayCommand](docs/CreateAbsenceDayCommand.md)
 - [CreateBankDetailsCommand](docs/CreateBankDetailsCommand.md)
 - [CreateEmployeeCommand](docs/CreateEmployeeCommand.md)
 - [CreateJobCommand](docs/CreateJobCommand.md)
 - [DayPart](docs/DayPart.md)
 - [Email](docs/Email.md)
 - [EmployeeAbsenceReasonModel](docs/EmployeeAbsenceReasonModel.md)
 - [EmployeeModel](docs/EmployeeModel.md)
 - [EmployeeQueryModel](docs/EmployeeQueryModel.md)
 - [EntitlementModel](docs/EntitlementModel.md)
 - [EntitlementQueryModel](docs/EntitlementQueryModel.md)
 - [HierarchyNodeModel](docs/HierarchyNodeModel.md)
 - [HierarchyNodeQueryModel](docs/HierarchyNodeQueryModel.md)
 - [JobModel](docs/JobModel.md)
 - [JobQueryModel](docs/JobQueryModel.md)
 - [Ownership](docs/Ownership.md)
 - [Phone](docs/Phone.md)
 - [PhoneType](docs/PhoneType.md)
 - [PublicHolidayDay](docs/PublicHolidayDay.md)
 - [PublicHolidayModel](docs/PublicHolidayModel.md)
 - [PublicHolidayQueryModel](docs/PublicHolidayQueryModel.md)
 - [UpdateAbsenceCommand](docs/UpdateAbsenceCommand.md)
 - [UpdateAbsenceDayCommand](docs/UpdateAbsenceDayCommand.md)
 - [UpdateBankDetailsCommand](docs/UpdateBankDetailsCommand.md)
 - [UpdateEmployeeCommand](docs/UpdateEmployeeCommand.md)
 - [UpdateJobCommand](docs/UpdateJobCommand.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
