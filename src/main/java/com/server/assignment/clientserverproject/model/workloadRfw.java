package com.server.assignment.clientserverproject.model;

public class workloadRfw {

    private int rfwId;
    private String benchMarkType;
    private String workloadMetric;
    private int batchUnit;
    private int batchId;
    private int batchSize;
    private String dataType;
    private String dataAnalytics;

    public int getRfwId() {
        return rfwId;
    }

    public void setRfwId(int rfwId) {
        this.rfwId = rfwId;
    }

    public String getBenchMarkType() {
        return benchMarkType;
    }

    public void setBenchMarkType(String benchMarkType) {
        this.benchMarkType = benchMarkType;
    }

    public String getWorkloadMetric() {
        return workloadMetric;
    }

    public void setWorkloadMetric(String workloadMetric) {
        this.workloadMetric = workloadMetric;
    }

    public int getBatchUnit() {
        return batchUnit;
    }

    public void setBatchUnit(int batchUnit) {
        this.batchUnit = batchUnit;
    }

    public int getBatchId() {
        return batchId;
    }

    public void setBatchId(int batchId) {
        this.batchId = batchId;
    }

    public int getBatchSize() {
        return batchSize;
    }

    public void setBatchSize(int batchSize) {
        this.batchSize = batchSize;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getDataAnalytics() {
        return dataAnalytics;
    }

    public void setDataAnalytics(String dataAnalytics) {
        this.dataAnalytics = dataAnalytics;
    }

}
