package com.safetynet.safetynetalerts.dao;

import com.jsoniter.JsonIterator;
import com.safetynet.safetynetalerts.entity.InputData;
import com.safetynet.safetynetalerts.entity.Person;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

@Component
public class DataDAO {

    InputData iData;

    public Iterable<Person> getPersons() throws IOException {
        InputData data = this.getInputData();
        return Arrays.asList(data.getPersons());
    }

    private InputData getInputData() throws IOException {
        if (iData == null) {
            final String input = "https://s3-eu-west-1.amazonaws.com/course.oc-static.com/projects/DA+Java+EN/P5+/data.json";
            final URL url = new URL(input);

            final Scanner scan = new Scanner(url.openStream());
            final StringBuilder strBuilder = new StringBuilder();
            while (scan.hasNext())
                strBuilder.append(scan.nextLine());
            scan.close();
            final String strIn = strBuilder.toString();
            iData = JsonIterator.deserialize(strIn, InputData.class);
        }
        return iData;
    }

}
