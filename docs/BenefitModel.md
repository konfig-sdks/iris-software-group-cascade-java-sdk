

# BenefitModel

An HR Employee's Benefits.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**employeeId** | **String** | The EmployeeId. &lt;br /&gt;  Cascade Source: [EmployeeBenefits].[EmployeeId] |  [optional] |
|**type** | **String** | The Type. &lt;br /&gt;  Cascade Source: [EmployeeBenefits].[Code] |  [optional] |
|**description** | **String** | The Description. &lt;br /&gt;  Cascade Source: [EmployeeBenefits].[Notes] |  [optional] |
|**value** | **Double** | The Value. &lt;br /&gt;  Cascade Source: [EmployeeBenefits].[Value] |  [optional] |
|**startDate** | **OffsetDateTime** | The Start Date. &lt;br /&gt;  Cascade Source: [EmployeeBenefits].[StartDate] |  [optional] |
|**endDate** | **OffsetDateTime** | The End Date. &lt;br /&gt;  Cascade Source: [EmployeeBenefits].[EndDate] |  [optional] |
|**p11DValue** | **Double** | The P11DValue. &lt;br /&gt;  Cascade Source: [EmployeeBenefits].[P11DValueCurrency] |  [optional] |
|**suspended** | **Boolean** | The Suspended value. &lt;br /&gt;  Cascade Source: [EmployeeBenefits].[Suspended] |  [optional] |
|**id** | **String** | The ID of the Benefit. &lt;br /&gt;  This field is generated by Iris HR platform and not related to the Cascade ID. |  [optional] |
|**sourceSystemId** | **String** | Source HR System Id. &lt;br /&gt;  Cascade Source: [EmployeeBenefits].[Ruid] &lt;br /&gt;  Read Only |  [optional] |
|**createdOn** | **OffsetDateTime** | The date time when the Benefit was created in the Iris HR platform. |  [optional] |
|**createdBy** | **String** | Not used as the Iris HR platform has no concept of users at the moment. |  [optional] |
|**lastModifiedOn** | **OffsetDateTime** | Not used as the Iris HR platform has no concept of users at the moment. |  [optional] |
|**lastModifiedBy** | **String** | Not used as the Iris HR platform has no concept of users at the moment. |  [optional] |



