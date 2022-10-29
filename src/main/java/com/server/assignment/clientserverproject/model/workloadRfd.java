package com.server.assignment.clientserverproject.model;

public class workloadRfd {

    private int rfwId;
    private int batchId;
    private int batchSize;
    private String dataAnalytics;

    public int getRfwId() {
        return rfwId;
    }

    public void setRfwId(int rfwId) {
        this.rfwId = rfwId;
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

    public String getDataAnalytics() {
        return dataAnalytics;
    }

    public void setDataAnalytics(String dataAnalytics) {
        this.dataAnalytics = dataAnalytics;
    }
}