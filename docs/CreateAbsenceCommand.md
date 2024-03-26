

# CreateAbsenceCommand


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**employeeId** | **String** | The ID of the Employee. &lt;br /&gt;  Must exist in the Employees Service. &lt;br /&gt;  Cannot be updated once Absence created. |  [optional] |
|**absenceReasonId** | **String** | The Absence Reason ID. &lt;br /&gt;  Must exist in the Attendance Absence Reasons Service. &lt;br /&gt;  Cannot be updated once Absence created. |  [optional] |
|**narrative** | **String** | The Narrative relating to the Attendance. &lt;br /&gt;  Cascade Source: [EmployeeAttendance].[Narrative] |  [optional] |
|**startDate** | **OffsetDateTime** | The Start Date of the Attendance. &lt;br /&gt;  Cascade Source: [EmployeeAttendance].[StartDate] |  [optional] |
|**endDate** | **OffsetDateTime** | The End Date of the Attendance. &lt;br /&gt;  Cascade Source: [EmployeeAttendance].[EndDate]  Null if Opened Ended - Cascade Source: [EmployeeAttendance].[OpenEnded] |  [optional] |



