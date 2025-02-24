package io.github.mohammadrezaeicode.model;

import io.github.mohammadrezaeicode.excel.annotation.Options;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class FormatModel {
    @Options(title = "Date",order = 0)
    private String date;
    @Options(title = "Time",order = 1)
    private String time;
    @Options(title = "Percentage",order = 2)
    private Number percentage;
    @Options(title = "Float",order = 3)
    private Number Float;
    @Options(title = "Fraction",order = 4)
    private String fraction;
    @Options(title = "Long Number Column 1",order = 5)
    private Long longNumberColumn1;
    @Options(title = "Long Number Column 2",order = 6)
    private Long longNumberColumn2;
}
