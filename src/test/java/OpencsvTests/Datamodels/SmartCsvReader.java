package OpencsvTests.Datamodels;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class SmartCsvReader {

    public List<SpaceShip> readCsvFile() throws FileNotFoundException {
        FileReader reader =  new FileReader("smartspaceships.csv");
        CsvToBean<SpaceShip> csvtobean= new CsvToBeanBuilder<SpaceShip>(reader)
                .withType(SpaceShip.class)
                .withSeparator(';')
                .build();

        return csvtobean.parse();
    }
}