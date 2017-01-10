package pl.dietmanager.service.acuire;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import pl.dietmanager.model.Measurements;
import pl.dietmanager.file.FileReader;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;

@RunWith(MockitoJUnitRunner.class)
public class AcquireMeasurementsTest {

    @Mock
    FileReader reader;


    AcquireMeasurements acquireMeasurements;

    @Before
    public void setUp(){
        acquireMeasurements = new AcquireMeasurements(reader);
    }

    @Test
    public void should_return_5_records() {

        Mockito.when(reader.readFromFile(anyString())).thenReturn(Arrays.asList(
                "Person1;2017-01-01;160;85.5;100;95;95;125;117;127;70;65;61;50;45;25;38;37;17",
                "Person1;2017-01-10;160;84;99;94;94;120;112;125;68;64;60;49;44;25;37.5;36;16.5",
                "Person2;2017-01-01;160;75;85;80;85;110;100;115;65;60;55;45;43;25;37;35;16",
                "Person1;2017-01-15;160;83.5;98;94;93;115;110;122;67;63;59;48;40;25;36;35;16",
                "Person2;2017-01-10;160;74;97;79;84;108;95;112;64;59;54;43;39;25;35;34;16"
        ));


        List<Measurements> measurements = acquireMeasurements.acquireMeasurements();
        System.out.println("measurements.get(0) = " + measurements.get(0).toString());

        assertThat(measurements.size(), is(equalTo(5)));
        assertThat(measurements.get(1).getPerson(), is(equalTo("Person1")));
        assertThat(measurements.get(4).getPerson(), is(equalTo("Person2")));
        assertThat(measurements.get(4).getWeight(), is(equalTo(new BigDecimal(74))));
        assertThat(measurements.get(4).getWrist(), is(equalTo(new BigDecimal(16))));

    }
}