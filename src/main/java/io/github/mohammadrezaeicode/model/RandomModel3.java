package io.github.mohammadrezaeicode.model;

import io.github.mohammadrezaeicode.excel.annotation.Options;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class RandomModel3 {

    @Options(order = 0)
    private String date;
    @Options(order = 1)
    private Integer column1;
    @Options(order = 12)
    private Integer column2;
    @Options(order = 123)
    private String column3;
    @Options(order = 1234)
    private Integer column4;
    @Options(order = 1235)
    private Integer column5;
}
