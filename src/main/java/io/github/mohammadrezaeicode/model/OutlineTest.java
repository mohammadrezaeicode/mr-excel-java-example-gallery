package io.github.mohammadrezaeicode.model;

import io.github.mohammadrezaeicode.excel.model.DataOption;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OutlineTest extends DataOption {
    private Integer id;
    private String name;
    private Integer column1;
    private Integer column2;
    private Integer column3;
    private Integer column4;
    private Integer column5;
//    @ExcludeProperty
    private Integer outlineLevel;
//    @ExcludeProperty
    private Boolean hidden;

    @Override
    public Integer getHeight() {
        return null;
    }

    @Override
    public Integer getOutlineLevel() {
        return outlineLevel;
    }

    @Override
    public Boolean getHidden() {
        return hidden;
    }


    public static class Builder{
        private OutlineTest outlineTest;

        public Builder() {
            outlineTest=new OutlineTest();
        }

        public Builder id(Integer id) {
            outlineTest.setId(id);
            return this;
        }

        public Builder name(String name) {
            outlineTest.name = name;
            return this;
        }

        public Builder column1(Integer column1) {
            outlineTest.column1 = column1;
            return this;
        }

        public Builder column2(Integer column2) {
            outlineTest.column2 = column2;
            return this;
        }

        public Builder column3(Integer column3) {
            outlineTest.column3 = column3;
            return this;
        }

        public Builder column4(Integer column4) {
            outlineTest.column4 = column4;
            return this;
        }

        public Builder column5(Integer column5) {
            outlineTest.column5 = column5;
            return this;
        }

        public Builder outlineLevel(Integer outlineLevel) {
            outlineTest.outlineLevel = outlineLevel;
            return this;
        }

        public Builder hidden(Boolean hidden) {
            outlineTest.hidden = hidden;
            return this;
        }
        public OutlineTest build(){
            return outlineTest;
        }
    }
    public static Builder eBuilder(){
        return new Builder();
    }
}
