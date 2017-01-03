package pl.dietmanager.reader;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MeasurementsReaderTest {

    @Test
    public void should_return_6_lines(){
        MeasurementsReader reader = new MeasurementsReader();
        List<String> strings = reader.readFromFile("src/test/resources/Measurements.csv");

        assertThat("List has size 5", strings.size(), is(equalTo(6)));
    }



}