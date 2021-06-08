package OpencsvTests.Datamodels;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SpaceShipCsvWriter {

    public void doWrite() throws IOException {

        CSVWriter writer = new CSVWriter(new FileWriter("spaceships.csv"),
                ';',
                '"','\\'
                ,CSVWriter.DEFAULT_LINE_END);
        List<String[]> therows = new ArrayList<>();
        String[] header = new String[]{"id", "name", "crew", "launchdate"};
        therows.add(header);

        String[] row1 = new String[]{"1", "Falcon", "12", "20190724"};
        String[] row2 = new String[]{"2", "Flying sourcer", "134", "20190520"};
        String[] row3 = new String[]{"3", "Dice", "3", "20180304"};
        therows.add(row1);
        therows.add(row2);
        therows.add(row3);


        writer.writeAll(therows);
        writer.close();

    }
}