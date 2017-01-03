package pl.dietmanager.service.acuiredata;

import pl.dietmanager.model.Measurements;
import pl.dietmanager.model.MeasurementsBuilder;
import pl.dietmanager.reader.MeasurementsReader;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AcquireMeasurements {
    private static final String STRING_PATH_TO_FILE = "src/main/resources/Measurements.csv";

    public List<Measurements> acquireMeasurements(){
        MeasurementsReader measurementsReader = new MeasurementsReader();
        List<String> strings = measurementsReader.readFromFile(STRING_PATH_TO_FILE);
        List<Measurements> measurements = new ArrayList<Measurements>();
        int i=0;
        for (String s :
                strings) {
            if(i==0){i++;}
            else{
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
                        .withThighLargest(new BigDecimal(split[8]))
                        .withThigh(new BigDecimal(split[9]))
                        .withThighLowest(new BigDecimal(split[10]))
                        .withCalfBelowKnee(new BigDecimal(split[11]))
                        .withCalf(new BigDecimal(split[12]))
                        .withArmByShoulder(new BigDecimal(split[13]))
                        .withArm(new BigDecimal(split[14]))
                        .withWrist(new BigDecimal(split[15]))
                        .build();
                measurements.add(measurement);

            }
        }
        return measurements;

    }

}
