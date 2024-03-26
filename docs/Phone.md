

# Phone

A Phone Number with Ownership and Type properties

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ownership** | **Ownership** |  |  [optional] |
|**type** | **PhoneType** |  |  [optional] |
|**value** | **String** | The Phone Number value. &lt;br /&gt;  Cascade Source:  &lt;br /&gt;  Ownership &#x3D; Organization, Type &#x3D; Landline Then [Employee].[WorkPhone] &lt;br /&gt;  Ownership &#x3D; Organization, Type &#x3D; Mobile Then [Employee].[WorkMobilePhoneNumber] &lt;br /&gt;  Ownership &#x3D; Personal, Type &#x3D; Landline Then [EmployeeHomeAddress].[Phone] &lt;br /&gt;  Ownership &#x3D; Personal, Type &#x3D; Mobile Then [EmployeeHomeAddress].[MobilePhone] |  [optional] |



