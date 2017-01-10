package pl.dietmanager.file;

import org.junit.Test;
import pl.dietmanager.model.Measurements;
import pl.dietmanager.model.MeasurementsBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class WriterTest {

    private static final String PATH_TO_FILE ="src/test/resources/TestFile.csv";

    @Test
    public void should_write_values_to_file() throws IOException {

        Writer writer = new Writer();
        List<Measurements> measurements = Arrays.asList(
                new MeasurementsBuilder().withAnkle(new BigDecimal(5)).build(),
                new MeasurementsBuilder().withAnkle(new BigDecimal(3)).build(),
                new MeasurementsBuilder().withAnkle(new BigDecimal(1)).build(),
                new MeasurementsBuilder().withWrist(new BigDecimal(1)).withPerson("test").build()

        );
        writer.writeToFile(PATH_TO_FILE, measurements);
        System.out.println("measurements.toString() = " + measurements.toString());

        FileReader fileReader = new FileReader();
        List<String> result = fileReader.readFromFile(PATH_TO_FILE);

        assertThat(result.size(),is(equalTo(4)));
        assertThat(result.get(3),is(equalTo("test;null;null;null;null;null;null;null;null;null;null;null;null;null;null;null;null;null;1")));

        //clear test file
        File file = new File(PATH_TO_FILE);
        file.createNewFile();
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("");
        fileWriter.flush();
        fileWriter.close();
    }

}