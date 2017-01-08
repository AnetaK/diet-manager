package pl.dietmanager.service.acuiredata;

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
                        .withWeight(new BigDecimal(split[2]))
                        .withBust(new BigDecimal(split[3]))
                        .withUnderTheBust(new BigDecimal(split[4]))
                        .withWaistLowest(new BigDecimal(split[5]))
                        .withWaistLargest(new BigDecimal(split[6]))
                        .withWaistAboveHips(new BigDecimal(split[7]))
                        .withHip(new BigDecimal(split[8]))
                        .withThighLargest(new BigDecimal(split[9]))
                        .withThigh(new BigDecimal(split[10]))
                        .withThighLowest(new BigDecimal(split[11]))
                        .withCalfBelowKnee(new BigDecimal(split[12]))
                        .withCalf(new BigDecimal(split[13]))
                        .withAnkle(new BigDecimal(split[14]))
                        .withArmByShoulder(new BigDecimal(split[15]))
                        .withArm(new BigDecimal(split[16]))
                        .withWrist(new BigDecimal(split[17]))
                        .build();
                measurements.add(measurement);
      }
        return measurements;

    }

}
