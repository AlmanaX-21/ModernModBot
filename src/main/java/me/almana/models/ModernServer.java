package me.almana.models;

import java.util.List;

public class ModernServer {

    public ModernServer(long serverId, List<Long> modRoles, List<ReportOption> reportOptions) {
        this.serverId = serverId;
        this.modRoles = modRoles;
        this.reportOptions = reportOptions;
    }

    private long serverId;
    private List<Long> modRoles;
    private List<ReportOption> reportOptions;

    public long getServerId() {
        return serverId;
    }

    public void setServerId(long serverId) {
        this.serverId = serverId;
    }

    public List<Long> getModRoles() {
        return modRoles;
    }

    public void setModRoles(List<Long> modRoles) {
        this.modRoles = modRoles;
    }

    public List<ReportOption> getReportOptions() {
        return reportOptions;
    }

    public void setReportOptions(List<ReportOption> reportOptions) {
        this.reportOptions = reportOptions;
    }
}
