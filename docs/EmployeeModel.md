

# EmployeeModel

An HR Employee.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**displayId** | **String** | The Display ID of the Employee. &lt;br /&gt;  If provided must be unqiue, If null then it will automatically be generated. &lt;br /&gt;  Cascade Source: [Employee].[DisplayEmployeeId] |  [optional] |
|**titleHonorific** | **String** | The Title of the Employee. E.g. Mr, Mrs, Miss. &lt;br /&gt;  Cascade Source: [Employee].[Title] translated through the TITLE system list. |  [optional] |
|**firstName** | **String** | The First Name of the Employee. &lt;br /&gt;  Required. &lt;br /&gt;  Cascade Source: [Employee].[Forename] |  [optional] |
|**knownAs** | **String** | The name the Employee is commonly known as. &lt;br /&gt;  Cascade Source: [Employee].[KnownAs] |  [optional] |
|**otherName** | **String** | Any other name that the Employee has. &lt;br /&gt;  Cascade Source: [Employee].[OtherName] |  [optional] |
|**lastName** | **String** | The Last Name, Surname or Family Name of the Employee. &lt;br /&gt;  Required. &lt;br /&gt;  Cascade Source: [Employee].[Surname] |  [optional] |
|**costCentre** | **String** | The Cost Centre assigned to the Employee. &lt;br /&gt;  Cascade Source: [Employee].[CostCentre] |  [optional] |
|**workingStatus** | **String** | The Status of the Employee E.g. On Holiday, Sick. &lt;br /&gt;  Automatically Calculated. &lt;br /&gt;  Cascade Source: [Sysview_Employee_Status].[StatusDescription] |  [optional] |
|**isManager** | **Boolean** | Indicates if the Employee is a Manager. &lt;br /&gt;  True if any other Employee&#39;s active &lt;see cref&#x3D;\&quot;T:Iris.Api.Hr.Employee.Domain.Entities.V1.Job\&quot;&gt;Job&lt;/see&gt; has this Employee as their Line Manager. &lt;br /&gt;  Automaticaly Calculated. |  [optional] |
|**nationalInsuranceNumber** | **String** | The National Insurance Number of the Employee. &lt;br /&gt;  Cascade Source: [Employee].[NationalInsuranceNo] |  [optional] |
|**payrollId** | **String** | The Payroll ID of the Employee. &lt;br /&gt;  Cascade Source: [Employee].[PayrollId] |  [optional] |
|**taxCode** | **String** | The Tax Code of the Employee. &lt;br /&gt;  Cascade Source: [Employee].[TaxCode] |  [optional] |
|**includeInPayroll** | **Boolean** | Indicates if the Employee should be included in Payroll. &lt;br /&gt;  Cascade Source: [Employee].[IncludeInPayroll] |  [optional] |
|**employmentStartDate** | **OffsetDateTime** | The date the Employee started with their current Employer. &lt;br /&gt;  Cascade Source: [Employee].[EmployeeStartDate] |  [optional] |
|**employmentLeftDate** | **OffsetDateTime** | The date the Employee left their current Employer. &lt;br /&gt;  Cascade Source: [Employee].[EmployementLeftDate] |  [optional] |
|**continuousServiceDate** | **OffsetDateTime** | The date the Employee&#39;s continuous service should be applied from. &lt;br /&gt;  Cascade Source: [Employee].[ContServiceDate] |  [optional] |
|**dateOfBirth** | **OffsetDateTime** | The Date of Birth of the Employee. &lt;br /&gt;  Cascade Source: [Employee].[DateOfBirth] |  [optional] |
|**lastWorkingDate** | **OffsetDateTime** | The date of the last working date of the Employee. &lt;br /&gt;  Cascade Source: [Employee].[LeaverLastWorkDate] |  [optional] |
|**gender** | **String** | The Gender of the Employee. &lt;br /&gt;  Cascade Source: [Employee].[Sex] translated through the GENDER system list. |  [optional] |
|**ethnicity** | **String** | The Ethnicity of the Employee. &lt;br /&gt;  Cascade Source: [Employee].[EthnicOrigin] translated through the ETHNICTORIGIN system list. |  [optional] |
|**nationality** | **String** | The Nationality of the Employee. &lt;br /&gt;  Cascade Source: [Employee].[Nationality] translated through the NATIONALITY system list. |  [optional] |
|**religion** | **String** | The Religion of the Employee. &lt;br /&gt;  Cascade Source: [Employee].[Religion] transalated through the RELIGION system list. |  [optional] |
|**leaverReason** | **String** | The reason for the Employee to Leave. &lt;br /&gt;  Cascade Source: [Employee].[LeaverReason] |  [optional] |
|**maritalStatus** | **String** | The marrital status of the Employee. &lt;br /&gt;  Cascade Source: [Employee.[MaritalStatus] translated through the MARITALSTATUS system list. |  [optional] |
|**phones** | [**List&lt;Phone&gt;**](Phone.md) | The &lt;see cref&#x3D;\&quot;T:Iris.Api.Hr.Employee.Domain.Entities.V1.Phone\&quot;&gt;Phone Numbers&lt;/see&gt; belonging to the Employee. |  [optional] |
|**emails** | [**List&lt;Email&gt;**](Email.md) | The &lt;see cref&#x3D;\&quot;T:Iris.Api.Hr.Employee.Domain.Entities.V1.Email\&quot;&gt;Email Addresses&lt;/see&gt; belonging to the Employee. |  [optional] |
|**addresses** | [**List&lt;Address&gt;**](Address.md) | The &lt;see cref&#x3D;\&quot;T:Iris.Api.Hr.Employee.Domain.Entities.V1.Address\&quot;&gt;Addresses&lt;/see&gt; belonging to the Employee. |  [optional] |
|**genderIdentity** | **String** | The Gender Identity of the Employee. &lt;br /&gt;  Cascade Source: [Employee].[GenderIdentity] translated through the GenderIdentity system list. |  [optional] |
|**windowsUsername** | **String** | The Windows Username of the Employee. &lt;br /&gt;  Cascade Source: [Employee].[WindowsUsername] |  [optional] |
|**id** | **String** | This ID is generated by the Iris HR platform and does not relate to the Cascade Employee ID. |  [optional] |
|**sourceSystemId** | **String** | Source HR System Id. &lt;br /&gt;  Cascade Source: [Employee].[EmployeeId] &lt;br /&gt;  Read Only |  [optional] |
|**createdOn** | **OffsetDateTime** | The date when the Employee was created in the Iris HR platform. |  [optional] |
|**sourceSystemCreatedOn** | **OffsetDateTime** | The date when the Employee was created in the Source HR System. &lt;br /&gt;  Cascade Source: [Employee].[SYS_EffectiveDate] &lt;br /&gt;  Read Only |  [optional] |
|**createdBy** | **String** | Not used as the Iris HR platform has no concept of users. |  [optional] |
|**lastModifiedOn** | **OffsetDateTime** | The date when the Employee was created or last updated. |  [optional] |
|**sourceSystemLastModifiedOn** | **OffsetDateTime** | The latest date when the Employee or Home Address was created or last updated in the Source HR System. &lt;br /&gt;  Cascade Source: Latest of [Employee].[SYS_ModifiedDate] and [EmployeeHomeAddress].[SYS_ModifiedDate] &lt;br /&gt;  Read Only |  [optional] |
|**lastModifiedBy** | **String** | Not used as Iris HR platform has no concept of users. |  [optional] |



