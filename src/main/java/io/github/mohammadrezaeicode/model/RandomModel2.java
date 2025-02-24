package io.github.mohammadrezaeicode.model;

import io.github.mohammadrezaeicode.excel.annotation.Options;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RandomModel2 {
    @Options(order = 1)
    private Integer column1;
    @Options(order = 12)
    private Integer column2;
    @Options(order = 123)
    private Integer column3;
    @Options(order = 1234)
    private Integer column4;
    @Options(order = 1235)
    private Integer column5;
    @Options(order = 1236)
    private Integer column6;
    @Options(order = 1237)
    private Integer column7;
}
