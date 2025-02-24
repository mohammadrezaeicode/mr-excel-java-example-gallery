package io.github.mohammadrezaeicode.model;

import io.github.mohammadrezaeicode.excel.annotation.ExcludeProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class OutlineCustomPropertyTest {
    private Integer id;
    private String name;
    private Integer column1;
    private Integer column2;
    private Integer column3;
    private Integer column4;
    private Integer column5;
    @ExcludeProperty
    private Integer group;
    @ExcludeProperty
    private Integer h;
    @ExcludeProperty
    private Boolean notShow;

}
