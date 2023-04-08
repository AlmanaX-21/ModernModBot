package me.almana.models;

import java.util.List;

public class ModernServer {

    public ModernServer(long serverId, List<Long> modRoles, List<ReportOption> reportOptions, long modChannelId) {
        this.serverId = serverId;
        this.modRoles = modRoles;
        this.reportOptions = reportOptions;
        this.modChannelId = modChannelId;
    }

    private long serverId;
    private List<Long> modRoles;
    private List<ReportOption> reportOptions;
    private long modChannelId;

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

    public long getModChannelId() {
        return modChannelId;
    }

    public void setModChannelId(long modChannelId) {
        this.modChannelId = modChannelId;
    }
}
