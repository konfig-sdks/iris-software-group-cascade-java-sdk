

# CreateAbsenceDayCommand


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**absenceId** | **String** | The ID of the parent Absence. &lt;br /&gt;  Must exist in the Attendance Absence Service. |  [optional] |
|**employeeId** | **String** | The ID of the Employee. &lt;br /&gt;  Must exist in the Employees Service. |  [optional] |
|**date** | **OffsetDateTime** | The date of the Absence Day. &lt;br /&gt;  Cascade Source: [EmployeeAttendanceDates].[StartDate] |  [optional] |
|**durationDays** | **Double** | The duration in days for this Absence Day. &lt;br /&gt;  Cascade Source: [EmployeeAttendanceDates].[DurationDays] |  [optional] |
|**durationMinutes** | **Integer** | The duration in minutes for this Absence Day. &lt;br /&gt;  Cascade Source: [EmployeeAttendanceDates].[Duration] |  [optional] |
|**dayPart** | **DayPart** |  |  [optional] |



