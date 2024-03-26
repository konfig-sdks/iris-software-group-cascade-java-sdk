

# EntitlementModel

An Employee's Attendance Entitlement.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**employeeId** | **String** | The ID of the HR Employee. &lt;br /&gt;  Must exist in the Employee Service. |  [optional] |
|**absenceReasonId** | **String** | The Absence Reason ID. &lt;br /&gt;  Must exist in the Absence Reason Service. |  [optional] |
|**entitlementYearName** | **String** | The Entitlement Year Name. &lt;br /&gt;  Cascade Source: [EmployeeAttendanceEntitlementYear].[EntitlementYearName] |  [optional] |
|**open** | **Boolean** | The status of Open indicates whether the entitlement is active. &lt;br /&gt;  Cascade Source: [EmployeeAttendanceEntitlementYear].[Open] |  [optional] |
|**startDate** | **OffsetDateTime** | The Start Date of this Entitlement. &lt;br /&gt;  Cascade Source: [EmployeeAttendanceEntitlementYear].[StartDate] |  [optional] |
|**endDate** | **OffsetDateTime** | The End Date of this Entitlement. &lt;br /&gt;  Cascade Source: [EmployeeAttendanceEntitlementYear].[EndDate] |  [optional] |
|**narrative** | **String** | The optional description of this Entitlement. &lt;br /&gt;  Cascade Source: [EmployeeAttendanceEntitlementYear].[Narrative] |  [optional] |
|**baseDays** | **Double** | The number of Base Entitlement Days. &lt;br /&gt;  Cascade Source: [EmployeeAttendanceEntitlementYear].[BaseEntitlementDays] |  [optional] |
|**baseMinutes** | **Integer** | The number of Base Entitlement Minutes. &lt;br /&gt;  Cascade Source: [EmployeeAttendanceEntitlementYear].[BaseEntitlement] |  [optional] |
|**carryDays** | **Double** | The number of Carry Days allowed. &lt;br /&gt;  Cascade Source: [EmployeeAttendanceEntitlementYear].[CarryDays] |  [optional] |
|**carryMinutes** | **Integer** | The number of Carry Minutes allowed. &lt;br /&gt;  Cascade Source: [EmployeeAttendanceEntitlementYear].[Carry] |  [optional] |
|**carryUseByDate** | **OffsetDateTime** | The date when Carry Days should be used by. &lt;br /&gt;  Cascade Source: [EmployeeAttendanceEntitlementYear].[CarryUsebyDays] |  [optional] |
|**carryLostDays** | **Double** | The number of Carry Days lost. &lt;br /&gt;  Cascade Source: [EmployeeAttendanceEntitlementYear].[CarryLostDays] |  [optional] |
|**carryLostMinutes** | **Integer** | The number of Carry Minutes lost. &lt;br /&gt;  Cascade Source: [EmployeeAttendanceEntitlementYear].[CarryLost] |  [optional] |
|**manualAdjustmentDays** | **Double** | The number of Manual Adjustment Days. &lt;br /&gt;  Cascade Source: [EmployeeAttendanceEntitlementYear].[ManualAdjustmentDays] |  [optional] |
|**manualAdjustmentMinutes** | **Integer** | The number of Manual Adjustment Minutes. &lt;br /&gt;  Cascade Source: [EmployeeAttendanceEntitlementYear].[ManualAdjustment] |  [optional] |
|**serviceLengthAdjustmentDays** | **Double** | The number of Adjustment Days due to service length. &lt;br /&gt;  Cascade Source: [EmployeeAttendanceEntitlementYear].[ServiceLengthAdjustmentDays] |  [optional] |
|**serviceLengthAdjustmentMinutes** | **Integer** | The number of Adjustment Minutes due to service length. &lt;br /&gt;  Cascade Source: [EmployeeAttendanceEntitlementYear].[ServiceLengthAdjustment] |  [optional] |
|**newStarterAdjustmentDays** | **Double** | The number of New Starter Adjustment Days. &lt;br /&gt;  Cascade Source: [EmployeeAttendanceEntitlementYear].[NewStarterAdjustmentDays] |  [optional] |
|**newStarterAdjustmentMinutes** | **Integer** | The number of New Starter Adjustment Minutes. &lt;br /&gt;  Cascade Source: [EmployeeAttendanceEntitlementYear].[NewStarterAdjustment] |  [optional] |
|**leaverAdjusmentDays** | **Double** | [Obsolete] The number of Leaver Adjustment Days. &lt;br /&gt;  Cascade Source: [EmployeeAttendanceEntitlementYear].[LeaverAdjustmentDays] |  [optional] |
|**leaverAdjusmentMinutes** | **Integer** | [Obsolete] The number of Leaver Adjustment Minutes. &lt;br /&gt;  Cascade Source: [EmployeeAttendanceEntitlementYear].[LeaverAdjustment] |  [optional] |
|**leaverAdjustmentDays** | **Double** | The number of Leaver Adjustment Days. &lt;br /&gt;  Cascade Source: [EmployeeAttendanceEntitlementYear].[LeaverAdjustmentDays] |  [optional] |
|**leaverAdjustmentMinutes** | **Integer** | The number of Leaver Adjustment Minutes. &lt;br /&gt;  Cascade Source: [EmployeeAttendanceEntitlementYear].[LeaverAdjustment] |  [optional] |
|**partTimeAdjustmentDays** | **Double** | The number of Part Time Adjustment Days. &lt;br /&gt;  Cascade Source: [EmployeeAttendanceEntitlementYear].[PTProrataDays] |  [optional] |
|**partTimeAdjustmentMinutes** | **Integer** | The number of Part Time Adjustment Minutes. &lt;br /&gt;  Cascade Source: [EmployeeAttendanceEntitlementYear].[PTProrata] |  [optional] |
|**bankHolidayAdjustmentDays** | **Double** | The number of Bank Holiday Adjustment Day. &lt;br /&gt;  Cascade Source: [EmployeeAttendanceEntitlementYear].[BHProrataDays] |  [optional] |
|**bankHolidayAdjustmentMinutes** | **Integer** | The number of Bank Holiday Adjustment Minutes. &lt;br /&gt;  Cascade Source: [EmployeeAttendanceEntitlementYear].[BHProrata] |  [optional] |
|**buySellDays** | **Double** | The number of Buy Sell Days. &lt;br /&gt;  Cascade Source: [EmployeeAttendanceEntitlementYear].[BuySellDays] |  [optional] |
|**buySellMinutes** | **Integer** | The number of Buy Sell Minutes. &lt;br /&gt;  Cascade Source: [EmployeeAttendanceEntitlementYear].[BuySell] |  [optional] |
|**totalEntitlementDays** | **Double** | The total Entitlement in days. &lt;br /&gt;  &#x3D; BaseDays &lt;br /&gt;      + ServiceLengthAdjustmentDays &lt;br /&gt;      + NewStarterAdjustmentDays &lt;br /&gt;      + ManualAdjustmentDays &lt;br /&gt;      + CarryDays &lt;br /&gt;      + PartTimeAdjustmentDays &lt;br /&gt;      + BankHolidayAdjustmentDays &lt;br /&gt;      + BuySellDays &lt;br /&gt;      - CarryLostDays &lt;br /&gt;      + LeaverAdjustmentDays |  [optional] |
|**totalEntitlementMinutes** | **Integer** | The total Entitlement in minutes. &lt;br /&gt;  &#x3D; BaseMinutes &lt;br /&gt;      + ServiceLengthAdjustmentMinutes &lt;br /&gt;      + NewStarterAdjustmentMinutes &lt;br /&gt;      + ManualAdjustmentMinutes &lt;br /&gt;      + CarryMinutes &lt;br /&gt;      + PartTimeAdjustmentMinutes &lt;br /&gt;      + BankHolidayAdjustmentMinutes &lt;br /&gt;      + BuySellMinutes &lt;br /&gt;      - CarryLostMinutes &lt;br /&gt;      + LeaverAdjustmentMinutes |  [optional] |
|**sourceSystemId** | **String** | The Internal ID of the Source HR Product. &lt;br /&gt;  Cascade Source: [EmployeeAttendanceEntitlementYear].[Key] |  [optional] [readonly] |
|**sourceSystemCreatedOn** | **OffsetDateTime** | The date when the Entitlement record was created in the Source HR System. &lt;br /&gt;  Cascade Source: [EmployeeAttendanceEntitlementYear].[SYS_EffectiveDate] |  [optional] [readonly] |
|**sourceSystemLastModifiedOn** | **OffsetDateTime** | The date when the Entitlement record was created or last updated in the Source HR System. &lt;br /&gt;  Cascade Source: [EmployeeAttendanceEntitlementYear].[SYS_ModifiedDate] |  [optional] [readonly] |
|**id** | **String** | This ID is generated by the Iris HR platform and does not relate to the Cascade Employee Entitlement ID. |  [optional] |
|**createdOn** | **OffsetDateTime** | The date when the Entitlement was created in the Iris HR platform. |  [optional] |
|**createdBy** | **String** | Not used as the Iris HR platform has no concept of users at the moment. |  [optional] |
|**lastModifiedOn** | **OffsetDateTime** | The date when the Entitlement was created or last updated. |  [optional] |
|**lastModifiedBy** | **String** | Not used as the Iris HR platform has no concept of users at the moment. |  [optional] |



