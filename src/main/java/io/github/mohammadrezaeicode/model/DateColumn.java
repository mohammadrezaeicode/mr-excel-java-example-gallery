package io.github.mohammadrezaeicode.model;

import io.github.mohammadrezaeicode.excel.annotation.Options;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class DateColumn {
    @Options(title = "Date")
    private String date;

    @Options(title = "Column 1")
    private int column1;
    @Options(title = "Column 2")
    private int column2;
    @Options(title = "Column 3")
    private int column3;
    @Options(title = "Column 4")
    private int column4;
    @Options(title = "Column 5")
    private int column5;

}
