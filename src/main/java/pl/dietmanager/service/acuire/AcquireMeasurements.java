package pl.dietmanager.service.acuire;

import pl.dietmanager.model.Measurements;
import pl.dietmanager.model.MeasurementsBuilder;
import pl.dietmanager.reader.MeasurementsReader;

import javax.ejb.Startup;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Startup
public class AcquireMeasurements {
    private static final String STRING_PATH_TO_FILE = "src/main/resources/Measurements.csv";
MeasurementsReader measurementsReader;

    public AcquireMeasurements(MeasurementsReader measurementsReader) {
        this.measurementsReader = measurementsReader;
    }

    public List<Measurements> acquireMeasurements(){
        List<String> strings = measurementsReader.readFromFile(STRING_PATH_TO_FILE);
        System.out.println("strings.size() = " + strings.size());
        List<Measurements> measurements = new ArrayList<Measurements>();
        int i=0;
        for (String s :
                strings) {
                System.out.println("s = " + s);
                String[] split = s.split(";");
                Measurements measurement = new MeasurementsBuilder().withPerson(split[0])
                        .withDate(LocalDate.parse(split[1]))
                        .withHeight(new BigDecimal(split[2]))
                        .withWeight(new BigDecimal(split[3]))
                        .withBust(new BigDecimal(split[4]))
                        .withUnderTheBust(new BigDecimal(split[5]))
                        .withWaistLowest(new BigDecimal(split[6]))
                        .withWaistLargest(new BigDecimal(split[7]))
                        .withWaistAboveHips(new BigDecimal(split[8]))
                        .withHip(new BigDecimal(split[9]))
                        .withThighLargest(new BigDecimal(split[10]))
                        .withThigh(new BigDecimal(split[11]))
                        .withThighLowest(new BigDecimal(split[12]))
                        .withCalfBelowKnee(new BigDecimal(split[13]))
                        .withCalf(new BigDecimal(split[14]))
                        .withAnkle(new BigDecimal(split[15]))
                        .withArmByShoulder(new BigDecimal(split[16]))
                        .withArm(new BigDecimal(split[17]))
                        .withWrist(new BigDecimal(split[18]))
                        .build();
                measurements.add(measurement);
      }
        return measurements;

    }

}
