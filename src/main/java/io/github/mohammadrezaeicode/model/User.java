package io.github.mohammadrezaeicode.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Builder
@AllArgsConstructor
@Data
public class User {
    private Long id;
    private String name;
    private String surname;
    private Long  parentId;
    private String work;
    private String birthDate;
}
