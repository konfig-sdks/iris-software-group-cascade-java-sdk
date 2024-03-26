

# JobModel

An HR Employee's Job.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**jobTitle** | **String** | The title of the Job. &lt;br /&gt;  Cascade Source: [EmployeeJobs].[JobTitle] |  [optional] |
|**classification** | **String** | The classification of the Job e.g. Technical, Professional, Managerial. &lt;br /&gt;  Cascade Source: [EmployeeJobs].[Classification] translated through the JOBCLASSIFICATION system list. |  [optional] |
|**startDate** | **OffsetDateTime** | The start date of the Job. &lt;br /&gt;  Required. &lt;br /&gt;  Cascade Source: [EmployeeJobs].[SYS_EffectiveDate] |  [optional] |
|**endDate** | **OffsetDateTime** | The end date of the Job. &lt;br /&gt;  Automatically Calculated. &lt;br /&gt;  Cascade Source: [EmployeeJobs].[SYS_CalculatedEndDate] |  [optional] |
|**workingCalendar** | **String** | The name of the working calendar of the Job. &lt;br /&gt;  Cascade Source: [EmployeeJobs].[CalendarName] which comes from [ValidWorkingCalendar].[CalendarName] |  [optional] |
|**lineManagerId** | **String** | The ID of the Employee that is the line manager for this Job. &lt;br /&gt;  Must exist in Employees Service. &lt;br /&gt;  Cascade Source: [EmployeeJobs].[WorksForEmployeeId] |  [optional] |
|**hierarchyNodeId** | **String** | The ID of the Employee&#39;s Hierarchy node of the Job. &lt;br /&gt;  Must exist in Hierarchy Service. |  [optional] |
|**active** | **Boolean** | The Job is currently active. &lt;br /&gt;  Automatically Calculated. &lt;br /&gt;  Cascade Source: [EmployeeJobs].[sys_ActiveJob] |  [optional] |
|**salary** | **Double** | The salary of the Job. &lt;br /&gt;  Cascade Source: [EmployeeJobs].[BasicPay] |  [optional] |
|**employeeId** | **String** | The ID of the Employee of the Job. &lt;br /&gt;  Must exist in Employee Service. |  [optional] |
|**contract** | **String** | The contract of the Job e.g. Full Time, Part Time. &lt;br /&gt;  Cascade Source: [EmployeeJobs].[ContractType] translated through the EMPLOYMENTTYPES system list. |  [optional] |
|**payFrequency** | **String** | How often the Job&#39;s salary will be paid e.g. Monthly, Weekly. &lt;br /&gt;  Cascade Source: [EmployeeJobs].[PayFrequency] translated through the PAY FREQ system list. |  [optional] |
|**payBasis** | **String** | The unit of measurement the salary is specified against e.g. Yearly, Hourly. &lt;br /&gt;  Cascade Source: [EmployeeJobs].[PayBasis] translated through the PAY BASIS system list. |  [optional] |
|**fullTimeEquivalent** | **Double** | The full-time equivalent to a full time employee&#39;s hours e.g. 1 &#x3D; Full Time, 0.5 &#x3D; Half Hours. &lt;br /&gt;  Cascade Source: [EmployeeJobs].[FTE]. |  [optional] |
|**position** | **String** | The readonly property of employee position. &lt;br /&gt;  Cascade Source: [EmployeeJobs].[Postid]. |  [optional] [readonly] |
|**changeReason** | **String** | The reason for the change. &lt;br /&gt;  Cascade Source: [EmployeeJobs].[Reason]. |  [optional] |
|**publicHoliday** | **String** | The readonly property of public holiday. &lt;br /&gt;  Cascade Soruce: [EmployeeJobs].[HolidayLocation]. |  [optional] [readonly] |
|**payGrade** | **String** | The readonly property of pay grade.  &lt;br /&gt;  Cascade Source: [EmployeeJobs].[PayGrade]. |  [optional] [readonly] |
|**spinalPoint** | **Integer** | The readonly property of pay spinal point. &lt;br /&gt;  Cascade Source: [EmployeeJobs].[SpinalPoint]. |  [optional] [readonly] |
|**nextIncrementDate** | **OffsetDateTime** | The next increment date.  &lt;br /&gt;  Cascade Source: [EmployeeJobs].[IncrementDate]. |  [optional] |
|**timesheetLocation** | **String** | The timesheet location. &lt;br /&gt;  Cascade Source: [EmployeeJobs].[TimesheetLocation]. |  [optional] |
|**timesheetRuleSet** | **String** | The readonly property of time sheet rule set. &lt;br /&gt;  Cascade Source: [EmployeeJobs].[TimesheetRuleSetID]. |  [optional] [readonly] |
|**timesheetLunchDuration** | **String** | The time set lunch duration. &lt;br /&gt;  Cascade Source: [EmployeeJobs].[LunchDuration]. |  [optional] |
|**autoEnrolmentProfile** | **String** | The readonly property of automatic enrolment profiles. &lt;br /&gt;  Cascade Source: [EmployeeJobs].[AutoEnrolmentProfile]. |  [optional] [readonly] |
|**expenseSubmissionFrequency** | **String** | The expense submission frequency. &lt;br /&gt;  Cascade Source: [EmployeeJobs].[ExpenseSubmissionFrequency]. |  [optional] |
|**costCentre** | **String** | The cost centre. &lt;br /&gt;  Cascade Source: [EmployeeJobs].[CostCentre]. |  [optional] |
|**jobFamily** | **String** | The job family. &lt;br /&gt;  Cascade Source: [EmployeeJobs].[JobFamily]. |  [optional] |
|**apprenticeUnder25** | **Boolean** | The flag to indicate if the employee is an apprentice under 25. &lt;br /&gt;  Cascade Source: [EmployeeJobs].[ApprenticeUnder25]. |  [optional] |
|**apprenticeshipEndDate** | **OffsetDateTime** | The end date of the apprenticeship. &lt;br /&gt;  Cascade Source: [EmployeeJobs].[ApprenticeshipEndDate]. |  [optional] |
|**contractEndDate** | **OffsetDateTime** | The end date of the contract. &lt;br /&gt;  Cascade Source: [EmployeeJobs].[ContractEndDate]. |  [optional] |
|**reportsToPost** | **String** | The readonly property of reports to post. &lt;br /&gt;  Cascade Source: [EmployeeJobs].[ReportsToPost]. |  [optional] [readonly] |
|**normalHours** | **Double** | Normal hours. &lt;br /&gt;  Cascade Source: [EmployeeJobs].[NormalHours]. |  [optional] |
|**realTimeInformationIrregularFrequency** | **String** | The real time information of irregular frequency. &lt;br /&gt;  Cascade Source: [EmployeeJobs].[RTIIrregularFrequency]. |  [optional] |
|**noticePeriod** | **String** | The notice period. &lt;br /&gt;  Cascade Source: [EmployeeJobs].[NoticePeriod]. |  [optional] |
|**id** | **String** | This ID is generated by the Iris Hr platform and does not relate to the Cascade ID. |  [optional] |
|**sourceSystemId** | **String** | Source HR System Id. &lt;br /&gt;  Cascade Source: [EmployeeJobs].[Ruid] &lt;br /&gt;  Read Only |  [optional] |
|**createdOn** | **OffsetDateTime** | The date when the Job was created in the Iris Hr platform. |  [optional] |
|**sourceSystemCreatedOn** | **OffsetDateTime** | The date when the Job was created in the Source HR System. &lt;br /&gt;  Cascade Source: [EmployeeJobs].[SYS_EffectiveDate] &lt;br /&gt;  Note: In Cascade this value is also the Start Date of the Job and can changed at any time. &lt;br /&gt;  Read Only |  [optional] |
|**createdBy** | **String** | Not used as the Iris Hr platform has no concept of users at the moment. |  [optional] |
|**lastModifiedOn** | **OffsetDateTime** | The date when the Job was created or last updated. |  [optional] |
|**sourceSystemLastModifiedOn** | **OffsetDateTime** | The date when the Job was created or last updated in the Source HR System. &lt;br /&gt;  Cascade Source: [EmployeeJobs].[SYS_ModifiedDate] &lt;br /&gt;  Read Only |  [optional] |
|**lastModifiedBy** | **String** | Not used as Iris Hr platform has no concept of users at the moment. |  [optional] |



