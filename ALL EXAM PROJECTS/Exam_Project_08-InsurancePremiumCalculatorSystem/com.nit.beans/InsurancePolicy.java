package com.nit.beans;

public class InsurancePolicy {

    private int policyId;
    private String customerName;
    private int age;
    private String policyType;
    private double coverageAmount;

    public InsurancePolicy(int policyId,String customerName,
            int age,String policyType,double coverageAmount) {

        this.policyId=policyId;
        this.customerName=customerName;
        this.age=age;
        this.policyType=policyType;
        this.coverageAmount=coverageAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getAge() {
        return age;
    }

    public double getCoverageAmount() {
        return coverageAmount;
    }
}
