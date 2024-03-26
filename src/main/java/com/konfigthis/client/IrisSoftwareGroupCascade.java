package com.konfigthis.client;

import com.konfigthis.client.api.AbsenceDaysApi;
import com.konfigthis.client.api.AbsenceReasonsApi;
import com.konfigthis.client.api.AbsencesApi;
import com.konfigthis.client.api.BankDetailsApi;
import com.konfigthis.client.api.BenefitsApi;
import com.konfigthis.client.api.EmployeesApi;
import com.konfigthis.client.api.EntitlementsApi;
import com.konfigthis.client.api.HierarchyApi;
import com.konfigthis.client.api.JobsApi;
import com.konfigthis.client.api.PublicHolidaysApi;

public class IrisSoftwareGroupCascade {
    private ApiClient apiClient;
    public final AbsenceDaysApi absenceDays;
    public final AbsenceReasonsApi absenceReasons;
    public final AbsencesApi absences;
    public final BankDetailsApi bankDetails;
    public final BenefitsApi benefits;
    public final EmployeesApi employees;
    public final EntitlementsApi entitlements;
    public final HierarchyApi hierarchy;
    public final JobsApi jobs;
    public final PublicHolidaysApi publicHolidays;

    public IrisSoftwareGroupCascade() {
        this(null);
    }

    public IrisSoftwareGroupCascade(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.absenceDays = new AbsenceDaysApi(this.apiClient);
        this.absenceReasons = new AbsenceReasonsApi(this.apiClient);
        this.absences = new AbsencesApi(this.apiClient);
        this.bankDetails = new BankDetailsApi(this.apiClient);
        this.benefits = new BenefitsApi(this.apiClient);
        this.employees = new EmployeesApi(this.apiClient);
        this.entitlements = new EntitlementsApi(this.apiClient);
        this.hierarchy = new HierarchyApi(this.apiClient);
        this.jobs = new JobsApi(this.apiClient);
        this.publicHolidays = new PublicHolidaysApi(this.apiClient);
    }

}
