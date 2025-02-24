package io.github.mohammadrezaeicode.model;

import io.github.mohammadrezaeicode.excel.annotation.Options;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Unknown {
    @Options(title = "Name",order=3)
    private String c3;
    @Options(title = "**",order=1)
    private Number c1;
    @Options(title = "++",order=2)
    private Number c2;
    @Options(title = "Gender",order=4)
    private Number c5;
}
