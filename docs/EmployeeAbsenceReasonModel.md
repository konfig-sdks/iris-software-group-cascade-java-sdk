

# EmployeeAbsenceReasonModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**employeeId** | **String** | The Parent ID of this Absence Reason. &lt;br /&gt;  Cascade Source: [ValidAttendanceTypes].[Key]. |  [optional] |
|**absenceReasonId** | **String** | The Name of this Absence Reason. &lt;br /&gt;  Cascade Source: &lt;br /&gt;  [ValidAttendanceCategory].[Category] when ParentID is null; &lt;br /&gt;  [ValidAttendanceTypes].[Type] when ParentID is not null. |  [optional] |
|**showInDays** | **Boolean** | The Absence Reason For The Employee should be recorded in Days or not. |  [optional] |
|**id** | **String** | The ID of the Employee Absence Reason. |  [optional] |
|**createdOn** | **OffsetDateTime** | The date time when the Employee Absence Reason was created in the Iris HR platform. |  [optional] |
|**createdBy** | **String** | Not used as the Iris HR platform has no concept of users at the moment. |  [optional] |
|**lastModifiedOn** | **OffsetDateTime** | The date time when the Employee Absence Reason was created or last updated. |  [optional] |
|**lastModifiedBy** | **String** | Not used as the Iris HR platform has no concept of users at the moment. |  [optional] |



