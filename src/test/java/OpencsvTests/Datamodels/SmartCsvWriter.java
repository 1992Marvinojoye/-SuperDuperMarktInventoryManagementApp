  package OpencsvTests.Datamodels;

import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class SmartCsvWriter {

    public void writeSpaceships() throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException, InterruptedException {
        Writer writer  = new FileWriter("smartspaceships.csv");


        StatefulBeanToCsv<SpaceShip> beanToCsv = new StatefulBeanToCsvBuilder<SpaceShip>(writer)
                .withSeparator(';')
                .withLineEnd(CSVWriter.DEFAULT_LINE_END)
                .withOrderedResults(true)
                .build();

//        List<SpaceShip> spaceShips = List.of(new SpaceShip(10, "Mike", 1, "20190724")
//                , new SpaceShip(11, "Big Bottle", 134, "20170524")
//                , new SpaceShip(12, "Castle", 2435, "20180721"));
//
//        beanToCsv.write(spaceShips);
//        beanToCsv.write(new SpaceShip(13, "Test", 2435, "20180721"));
//        beanToCsv.getCapturedExceptions();
//        writer.close();
    }
}