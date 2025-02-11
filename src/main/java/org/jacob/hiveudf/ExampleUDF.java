package org.jacob.hiveudf;


import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.*;

// Description of the UDF
@Description(
        name="ExampleUDF",
        value="returns a lower case version of the input string.",
        extended="select ExampleUDF(deviceplatform) from hivesampletable limit 10;"
)
public class ExampleUDF extends UDF {
    // Accept a string input
    public String evaluate(String input) {
        // If the value is null, return a null
        if(input == null)
            return null;
        // Lowercase the input string and return it
        return input.toLowerCase();
    }
}