

# UpdateAbsenceCommand


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**narrative** | **String** | The Narrative relating to the Attendance. &lt;br /&gt;  Cascade Source: [EmployeeAttendance].[Narrative] |  [optional] |
|**startDate** | **OffsetDateTime** | The Start Date of the Attendance. &lt;br /&gt;  Cascade Source: [EmployeeAttendance].[StartDate] |  [optional] |
|**endDate** | **OffsetDateTime** | The End Date of the Attendance. &lt;br /&gt;  Cascade Source: [EmployeeAttendance].[EndDate]  Null if Opened Ended - Cascade Source: [EmployeeAttendance].[OpenEnded] |  [optional] |
|**id** | **String** | The ID of the Absence. &lt;br /&gt;  Must exist in the Attendance Absences Service. |  [optional] |



