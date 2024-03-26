

# CreateBankDetailsCommand


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**employeeId** | **String** | The ID of the HR Employee. &lt;br /&gt;  Must exist in the Employee Service. |  [optional] |
|**bankName** | **String** | Bank Name. &lt;br /&gt;  Cascade Source: [EmployeeBank].[BankName] |  [optional] |
|**bankAddress** | [**BankAddress**](BankAddress.md) |  |  [optional] |
|**accountName** | **String** | Account Name. &lt;br /&gt;  Cascade Source: [EmployeeBank].[AccountName] |  [optional] |
|**accountNumber** | **String** | Account Number. &lt;br /&gt;  Cascade Source: [EmployeeBank].[AccountNumber] |  [optional] |
|**sortCode** | **String** | Sort Code. &lt;br /&gt;  Cascade Source: [EmployeeBank].[SortCode] |  [optional] |
|**rollNumber** | **String** | Roll Number. &lt;br /&gt;  Cascade Source: [EmployeeBank].[RollNumber] |  [optional] |



