package pl.dietmanager.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Measurements {
    private String person;
    private LocalDate date;
    private BigDecimal height;
    private BigDecimal weight;
    private BigDecimal bust;
    private BigDecimal underTheBust;
    private BigDecimal waistLowest;
    private BigDecimal waistLargest;
    private BigDecimal waistAboveHips;
    private BigDecimal hip;
    private BigDecimal thighLargest;
    private BigDecimal thigh;
    private BigDecimal thighLowest;
    private BigDecimal calfBelowKnee;
    private BigDecimal calf;
    private BigDecimal ankle;
    private BigDecimal armByShoulder;
    private BigDecimal arm;
    private BigDecimal wrist;

    public BigDecimal getAnkle() {
        return ankle;
    }

    public String getPerson() {
        return person;
    }
    public LocalDate getDate() {
        return date;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public BigDecimal getBust() {
        return bust;
    }

    public BigDecimal getUnderTheBust() {
        return underTheBust;
    }

    public BigDecimal getWaistLowest() {
        return waistLowest;
    }

    public BigDecimal getWaistLargest() {
        return waistLargest;
    }

    public BigDecimal getWaistAboveHips() {
        return waistAboveHips;
    }

    public BigDecimal getHip() {
        return hip;
    }

    public BigDecimal getThighLargest() {
        return thighLargest;
    }

    public BigDecimal getThigh() {
        return thigh;
    }

    public BigDecimal getCalfBelowKnee() {
        return calfBelowKnee;
    }

    public BigDecimal getCalf() {
        return calf;
    }

    public BigDecimal getArmByShoulder() {
        return armByShoulder;
    }

    public BigDecimal getArm() {
        return arm;
    }

    public BigDecimal getWrist() {
        return wrist;
    }

    public BigDecimal getThighLowest() {
        return thighLowest;
    }

    public Measurements() {
    }

    @Override
    public String toString() {
        return "Measurements{" +
                "person='" + person + '\'' +
                ", date=" + date +
                ", height=" + height +
                ", weight=" + weight +
                ", bust=" + bust +
                ", underTheBust=" + underTheBust +
                ", waistLowest=" + waistLowest +
                ", waistLargest=" + waistLargest +
                ", waistAboveHips=" + waistAboveHips +
                ", hip=" + hip +
                ", thighLargest=" + thighLargest +
                ", thigh=" + thigh +
                ", thighLowest=" + thighLowest +
                ", calfBelowKnee=" + calfBelowKnee +
                ", calf=" + calf +
                ", ankle=" + ankle +
                ", armByShoulder=" + armByShoulder +
                ", arm=" + arm +
                ", wrist=" + wrist +
                '}';
    }

    public Measurements(String person, LocalDate date, BigDecimal height, BigDecimal weight, BigDecimal bust, BigDecimal underTheBust, BigDecimal waistLowest, BigDecimal waistLargest, BigDecimal waistAboveHips, BigDecimal hip, BigDecimal thighLargest, BigDecimal thigh, BigDecimal thighLowest, BigDecimal calfBelowKnee, BigDecimal calf, BigDecimal ankle, BigDecimal armByShoulder, BigDecimal arm, BigDecimal wrist) {
        this.person = person;
        this.date = date;
        this.height = height;
        this.weight = weight;
        this.bust = bust;
        this.underTheBust = underTheBust;
        this.waistLowest = waistLowest;
        this.waistLargest = waistLargest;
        this.waistAboveHips = waistAboveHips;
        this.hip = hip;
        this.thighLargest = thighLargest;
        this.thigh = thigh;
        this.thighLowest = thighLowest;
        this.calfBelowKnee = calfBelowKnee;
        this.calf = calf;
        this.ankle = ankle;
        this.armByShoulder = armByShoulder;
        this.arm = arm;
        this.wrist = wrist;
    }

}