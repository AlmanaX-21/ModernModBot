package me.almana.models;

import me.almana.utils.ReportSeverity;
import net.dv8tion.jda.api.entities.emoji.Emoji;

public class ReportOption {

    public ReportOption(String reportType, Emoji reportIcon, ReportSeverity severity) {
        this.reportType = reportType;
        this.reportIcon = reportIcon;
        this.severity = severity;
    }

    public ReportOption(String reportType, ReportSeverity severity) {
        this.reportType = reportType;
        this.reportIcon = Emoji.fromFormatted(":red_circle:");
        this.severity = severity;
    }

    private String reportType;
    private Emoji reportIcon;
    private ReportSeverity severity;

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public Emoji getReportIcon() {
        return reportIcon;
    }

    public void setReportIcon(Emoji reportIcon) {
        this.reportIcon = reportIcon;
    }

    public ReportSeverity getSeverity() {
        return severity;
    }

    public void setSeverity(ReportSeverity severity) {
        this.severity = severity;
    }
}
