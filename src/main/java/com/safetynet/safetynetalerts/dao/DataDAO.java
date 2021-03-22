package com.safetynet.safetynetalerts.dao;

import com.jsoniter.JsonIterator;
import com.safetynet.safetynetalerts.entity.InputDataEntity;
import com.safetynet.safetynetalerts.entity.PersonEntity;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

@Component
public class DataDAO {

    InputDataEntity iData;

    public Iterable<PersonEntity> getPersons() throws IOException {
        InputDataEntity data = this.getInputData();
        return Arrays.asList(data.getPersons());
    }

    private InputDataEntity getInputData() throws IOException {
        if (iData == null) {
            final String input = "https://s3-eu-west-1.amazonaws.com/course.oc-static.com/projects/DA+Java+EN/P5+/data.json";
            final URL url = new URL(input);

            final Scanner scan = new Scanner(url.openStream());
            final StringBuilder strBuilder = new StringBuilder();
            while (scan.hasNext())
                strBuilder.append(scan.nextLine());
            scan.close();
            final String strIn = strBuilder.toString();
            iData = JsonIterator.deserialize(strIn, InputDataEntity.class);
        }
        return iData;
    }

}
