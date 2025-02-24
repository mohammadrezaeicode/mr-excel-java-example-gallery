package io.github.mohammadrezaeicode.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Good {
    private String name;
    private String color;
    private String size;
    private Float price;
}
