package pl.dietmanager.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class MeasurementsBuilder {
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

    public MeasurementsBuilder withPerson(String person) {
        this.person = person;
        return this;
    }

    public MeasurementsBuilder withDate(LocalDate date) {
        this.date = date;
        return this;
    }

    public MeasurementsBuilder withHeight(BigDecimal height) {
        this.height = height;
        return this;
    }

    public MeasurementsBuilder withWeight(BigDecimal weight) {
        this.weight = weight;
        return this;
    }

    public MeasurementsBuilder withBust(BigDecimal bust) {
        this.bust = bust;
        return this;
    }

    public MeasurementsBuilder withUnderTheBust(BigDecimal underTheBust) {
        this.underTheBust = underTheBust;
        return this;
    }

    public MeasurementsBuilder withWaistLowest(BigDecimal waistLowest) {
        this.waistLowest = waistLowest;
        return this;
    }

    public MeasurementsBuilder withWaistLargest(BigDecimal waistLargest) {
        this.waistLargest = waistLargest;
        return this;
    }

    public MeasurementsBuilder withWaistAboveHips(BigDecimal waistAboveHips) {
        this.waistAboveHips = waistAboveHips;
        return this;
    }

    public MeasurementsBuilder withHip(BigDecimal hip) {
        this.hip = hip;
        return this;
    }

    public MeasurementsBuilder withThighLargest(BigDecimal thighLargest) {
        this.thighLargest = thighLargest;
        return this;
    }

    public MeasurementsBuilder withThigh(BigDecimal thigh) {
        this.thigh = thigh;
        return this;
    }

    public MeasurementsBuilder withThighLowest(BigDecimal thighLowest){
        this.thighLowest = thighLowest;
        return this;
    }

    public MeasurementsBuilder withCalfBelowKnee(BigDecimal calfBelowKnee) {
        this.calfBelowKnee = calfBelowKnee;
        return this;
    }

    public MeasurementsBuilder withCalf(BigDecimal calf) {
        this.calf = calf;
        return this;
    }

    public MeasurementsBuilder withAnkle(BigDecimal ankle) {
        this.ankle = ankle;
        return this;
    }

    public MeasurementsBuilder withArmByShoulder(BigDecimal armByShoulder) {
        this.armByShoulder = armByShoulder;
        return this;
    }

    public MeasurementsBuilder withArm(BigDecimal arm) {
        this.arm = arm;
        return this;
    }

    public MeasurementsBuilder withWrist(BigDecimal wrist) {
        this.wrist = wrist;
        return this;
    }

    public pl.dietmanager.model.Measurements build() {
        return new pl.dietmanager.model.Measurements(person, date, height, weight, bust, underTheBust, waistLowest, waistLargest, waistAboveHips, hip, thighLargest, thigh, thighLowest, calfBelowKnee, calf, ankle, armByShoulder, arm, wrist);
    }
}