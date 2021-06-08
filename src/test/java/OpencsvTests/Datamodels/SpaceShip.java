package OpencsvTests.Datamodels;

import java.time.LocalDate;

import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvCustomBindByPosition;
/*
@Data
@AllArgsConstructor
@NoArgsConstructor
*/
public class SpaceShip {
    @CsvBindByPosition(position = 0)
    private Integer id;
    @CsvBindByPosition(position = 2)
    private String name;
    @CsvBindByPosition(position = 1)
    private Integer crew;
    @CsvCustomBindByPosition(position = 3, converter = LocalDateConverter.class)
    private LocalDate launchdate;
}