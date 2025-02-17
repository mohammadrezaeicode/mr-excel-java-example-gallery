package io.github.mohammadrezaeicode;

import io.github.mohammadrezaeicode.excel.function.GenerateExcel;
import io.github.mohammadrezaeicode.excel.model.ExcelTableOption;
import io.github.mohammadrezaeicode.excel.model.Result;
import io.github.mohammadrezaeicode.excel.model.test.OB;
import io.github.mohammadrezaeicode.excel.model.types.GenerateType;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class App 
{
    public static void main( String[] args ) throws IOException, InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        System.out.println( "Hello World!" );
        Result<InputStream> data= GenerateExcel.generateHeaderAndGenerateExcel(Arrays.asList(
                new OB("er","gdh","gfdh"),
                new OB("er1","gdh2","gfd4h"),
                new OB("er2","gdh3","gfdh5")
        ), ExcelTableOption.eBuilder()
                .fileName("this is by name")
                .notSave(false)
                .generateType(GenerateType.INPUT_STREAM)
                .build(),null,null);
    }
}
