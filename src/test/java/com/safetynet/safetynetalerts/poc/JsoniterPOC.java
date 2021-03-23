package com.safetynet.safetynetalerts.poc;

import com.jsoniter.JsonIterator;
import com.jsoniter.output.JsonStream;
import com.safetynet.safetynetalerts.entity.FireStationEntity;
import com.safetynet.safetynetalerts.entity.InputDataEntity;
import com.safetynet.safetynetalerts.entity.MedicalRecordEntity;
import com.safetynet.safetynetalerts.entity.PersonEntity;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;


public class JsoniterPOC {
    @Test
    public void whenParsedPersonsEndpoint_thenConvertedToJavaObjectCorrectly() {
        String input = "{ \"firstName\":\"John\", \"lastName\":\"Boyd\", \"address\":\"1509 Culver St\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-6512\", \"email\":\"jaboyd@email.com\" }";

        PersonEntity person = JsonIterator.deserialize(input, PersonEntity.class);

        Assert.assertEquals("John", person.getFirstName());
        Assert.assertEquals("Boyd", person.getLastName());
        Assert.assertEquals("1509 Culver St", person.getAddress());
        Assert.assertEquals("Culver", person.getCity());
        Assert.assertEquals("97451", person.getZip());
        Assert.assertEquals("841-874-6512", person.getPhone());
        Assert.assertEquals("jaboyd@email.com", person.getEmail());
    }

    @Test
    public void whenParsedPersonsListEndpoint_thenConvertedToJavaObjectCorrectly() throws IOException {
        String input = "[\n" +
                "        { \"firstName\":\"John\", \"lastName\":\"Boyd\", \"address\":\"1509 Culver St\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-6512\", \"email\":\"jaboyd@email.com\" },\n" +
                "        { \"firstName\":\"Jacob\", \"lastName\":\"Boyd\", \"address\":\"1509 Culver St\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-6513\", \"email\":\"drk@email.com\" },\n" +
                "        { \"firstName\":\"Tenley\", \"lastName\":\"Boyd\", \"address\":\"1509 Culver St\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-6512\", \"email\":\"tenz@email.com\" },\n" +
                "        { \"firstName\":\"Roger\", \"lastName\":\"Boyd\", \"address\":\"1509 Culver St\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-6512\", \"email\":\"jaboyd@email.com\" },\n" +
                "        { \"firstName\":\"Felicia\", \"lastName\":\"Boyd\", \"address\":\"1509 Culver St\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-6544\", \"email\":\"jaboyd@email.com\" },\n" +
                "        { \"firstName\":\"Jonanathan\", \"lastName\":\"Marrack\", \"address\":\"29 15th St\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-6513\", \"email\":\"drk@email.com\" },\n" +
                "        { \"firstName\":\"Tessa\", \"lastName\":\"Carman\", \"address\":\"834 Binoc Ave\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-6512\", \"email\":\"tenz@email.com\" },\n" +
                "        { \"firstName\":\"Peter\", \"lastName\":\"Duncan\", \"address\":\"644 Gershwin Cir\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-6512\", \"email\":\"jaboyd@email.com\" },\n" +
                "        { \"firstName\":\"Foster\", \"lastName\":\"Shepard\", \"address\":\"748 Townings Dr\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-6544\", \"email\":\"jaboyd@email.com\" },\n" +
                "        { \"firstName\":\"Tony\", \"lastName\":\"Cooper\", \"address\":\"112 Steppes Pl\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-6874\", \"email\":\"tcoop@ymail.com\" },\n" +
                "        { \"firstName\":\"Lily\", \"lastName\":\"Cooper\", \"address\":\"489 Manchester St\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-9845\", \"email\":\"lily@email.com\" },\n" +
                "        { \"firstName\":\"Sophia\", \"lastName\":\"Zemicks\", \"address\":\"892 Downing Ct\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-7878\", \"email\":\"soph@email.com\" },\n" +
                "        { \"firstName\":\"Warren\", \"lastName\":\"Zemicks\", \"address\":\"892 Downing Ct\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-7512\", \"email\":\"ward@email.com\" },\n" +
                "        { \"firstName\":\"Zach\", \"lastName\":\"Zemicks\", \"address\":\"892 Downing Ct\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-7512\", \"email\":\"zarc@email.com\" },\n" +
                "        { \"firstName\":\"Reginold\", \"lastName\":\"Walker\", \"address\":\"908 73rd St\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-8547\", \"email\":\"reg@email.com\" },\n" +
                "        { \"firstName\":\"Jamie\", \"lastName\":\"Peters\", \"address\":\"908 73rd St\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-7462\", \"email\":\"jpeter@email.com\" },\n" +
                "        { \"firstName\":\"Ron\", \"lastName\":\"Peters\", \"address\":\"112 Steppes Pl\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-8888\", \"email\":\"jpeter@email.com\" },\n" +
                "        { \"firstName\":\"Allison\", \"lastName\":\"Boyd\", \"address\":\"112 Steppes Pl\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-9888\", \"email\":\"aly@imail.com\" },\n" +
                "        { \"firstName\":\"Brian\", \"lastName\":\"Stelzer\", \"address\":\"947 E. Rose Dr\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-7784\", \"email\":\"bstel@email.com\" },\n" +
                "        { \"firstName\":\"Shawna\", \"lastName\":\"Stelzer\", \"address\":\"947 E. Rose Dr\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-7784\", \"email\":\"ssanw@email.com\" },\n" +
                "        { \"firstName\":\"Kendrik\", \"lastName\":\"Stelzer\", \"address\":\"947 E. Rose Dr\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-7784\", \"email\":\"bstel@email.com\" },\n" +
                "        { \"firstName\":\"Clive\", \"lastName\":\"Ferguson\", \"address\":\"748 Townings Dr\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-6741\", \"email\":\"clivfd@ymail.com\" },\n" +
                "        { \"firstName\":\"Eric\", \"lastName\":\"Cadigan\", \"address\":\"951 LoneTree Rd\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-7458\", \"email\":\"gramps@email.com\" }\n" +
                "\t]";

        JsonIterator iterator = JsonIterator.parse(input);
        iterator.readArray();

        PersonEntity person = iterator.read(PersonEntity.class);
        Assert.assertEquals("John", person.getFirstName());
        Assert.assertEquals("Boyd", person.getLastName());
        Assert.assertEquals("1509 Culver St", person.getAddress());
        Assert.assertEquals("Culver", person.getCity());
        Assert.assertEquals("97451", person.getZip());
        Assert.assertEquals("841-874-6512", person.getPhone());
        Assert.assertEquals("jaboyd@email.com", person.getEmail());

        iterator.readArray();
        person = iterator.read(PersonEntity.class);
        Assert.assertEquals("Jacob", person.getFirstName());
        Assert.assertEquals("Boyd", person.getLastName());
        Assert.assertEquals("1509 Culver St", person.getAddress());
        Assert.assertEquals("Culver", person.getCity());
        Assert.assertEquals("97451", person.getZip());
        Assert.assertEquals("841-874-6513", person.getPhone());
        Assert.assertEquals("drk@email.com", person.getEmail());

    }

    @Test
    public void whenParsedMedicalRecordEndpoint_thenConvertedToJavaObjectCorrectly() {
        String input = "{ \"firstName\":\"John\", \"lastName\":\"Boyd\", \"birthdate\":\"03/06/1984\", \"medications\":[\"aznol:350mg\", \"hydrapermazol:100mg\"], \"allergies\":[\"nillacilan\"] }";

        MedicalRecordEntity medicalRecord = JsonIterator.deserialize(input, MedicalRecordEntity.class);

        Assert.assertEquals("John", medicalRecord.getFirstName());
        Assert.assertEquals("Boyd", medicalRecord.getLastName());
        Assert.assertEquals("03/06/1984", medicalRecord.getBirthdate());
        //Assert.assertEquals("aznol:350mg", medicalRecord.getMedications()[0]);
        //Assert.assertEquals("hydrapermazol:100mg", medicalRecord.getMedications()[1]);
        //Assert.assertEquals("nillacilan", medicalRecord.getAllergies()[0]);

    }

    @Test
    public void whenParsedMedicalRecordListEndpoint_thenConvertedToJavaObjectCorrectly() throws IOException {
        String input = "[\n" +
                "        { \"firstName\":\"John\", \"lastName\":\"Boyd\", \"birthdate\":\"03/06/1984\", \"medications\":[\"aznol:350mg\", \"hydrapermazol:100mg\"], \"allergies\":[\"nillacilan\"] },\n" +
                "        { \"firstName\":\"Jacob\", \"lastName\":\"Boyd\", \"birthdate\":\"03/06/1989\", \"medications\":[\"pharmacol:5000mg\", \"terazine:10mg\", \"noznazol:250mg\"], \"allergies\":[] },\n" +
                "        { \"firstName\":\"Tenley\", \"lastName\":\"Boyd\", \"birthdate\":\"02/18/2012\", \"medications\":[], \"allergies\":[\"peanut\"] },\n" +
                "        { \"firstName\":\"Roger\", \"lastName\":\"Boyd\", \"birthdate\":\"09/06/2017\", \"medications\":[], \"allergies\":[] },\n" +
                "        { \"firstName\":\"Felicia\", \"lastName\":\"Boyd\",\"birthdate\":\"01/08/1986\", \"medications\":[\"tetracyclaz:650mg\"], \"allergies\":[\"xilliathal\"] },\n" +
                "        { \"firstName\":\"Jonanathan\", \"lastName\":\"Marrack\", \"birthdate\":\"01/03/1989\", \"medications\":[], \"allergies\":[] },\n" +
                "        { \"firstName\":\"Tessa\", \"lastName\":\"Carman\", \"birthdate\":\"02/18/2012\", \"medications\":[], \"allergies\":[] },\n" +
                "        { \"firstName\":\"Peter\", \"lastName\":\"Duncan\", \"birthdate\":\"09/06/2000\", \"medications\":[], \"allergies\":[\"shellfish\"] },\n" +
                "        { \"firstName\":\"Foster\", \"lastName\":\"Shepard\", \"birthdate\":\"01/08/1980\", \"medications\":[], \"allergies\":[] },\n" +
                "        { \"firstName\":\"Tony\", \"lastName\":\"Cooper\", \"birthdate\":\"03/06/1994\", \"medications\":[\"hydrapermazol:300mg\", \"dodoxadin:30mg\"], \"allergies\":[\"shellfish\"] },\n" +
                "        { \"firstName\":\"Lily\", \"lastName\":\"Cooper\", \"birthdate\":\"03/06/1994\", \"medications\":[], \"allergies\":[] },\n" +
                "        { \"firstName\":\"Sophia\", \"lastName\":\"Zemicks\", \"birthdate\":\"03/06/1988\", \"medications\":[\"aznol:60mg\", \"hydrapermazol:900mg\", \"pharmacol:5000mg\", \"terazine:500mg\"], \"allergies\":[\"peanut\", \"shellfish\", \"aznol\"] },\n" +
                "        { \"firstName\":\"Warren\", \"lastName\":\"Zemicks\", \"birthdate\":\"03/06/1985\", \"medications\":[], \"allergies\":[] },\n" +
                "        { \"firstName\":\"Zach\", \"lastName\":\"Zemicks\", \"birthdate\":\"03/06/2017\", \"medications\":[], \"allergies\":[] },\n" +
                "        { \"firstName\":\"Reginold\", \"lastName\":\"Walker\", \"birthdate\":\"08/30/1979\", \"medications\":[\"thradox:700mg\"], \"allergies\":[\"illisoxian\"] },\n" +
                "        { \"firstName\":\"Jamie\", \"lastName\":\"Peters\", \"birthdate\":\"03/06/1982\", \"medications\":[], \"allergies\":[] },\n" +
                "        { \"firstName\":\"Ron\", \"lastName\":\"Peters\", \"birthdate\":\"04/06/1965\", \"medications\":[], \"allergies\":[] },\n" +
                "        { \"firstName\":\"Allison\", \"lastName\":\"Boyd\", \"birthdate\":\"03/15/1965\", \"medications\":[\"aznol:200mg\"], \"allergies\":[\"nillacilan\"] },\n" +
                "        { \"firstName\":\"Brian\", \"lastName\":\"Stelzer\", \"birthdate\":\"12/06/1975\", \"medications\":[\"ibupurin:200mg\", \"hydrapermazol:400mg\"], \"allergies\":[\"nillacilan\"] },\n" +
                "        { \"firstName\":\"Shawna\", \"lastName\":\"Stelzer\", \"birthdate\":\"07/08/1980\", \"medications\":[], \"allergies\":[] },\n" +
                "        { \"firstName\":\"Kendrik\", \"lastName\":\"Stelzer\", \"birthdate\":\"03/06/2014\", \"medications\":[\"noxidian:100mg\", \"pharmacol:2500mg\"], \"allergies\":[] },\n" +
                "        { \"firstName\":\"Clive\", \"lastName\":\"Ferguson\", \"birthdate\":\"03/06/1994\", \"medications\":[], \"allergies\":[] },\n" +
                "        { \"firstName\":\"Eric\", \"lastName\":\"Cadigan\", \"birthdate\":\"08/06/1945\", \"medications\":[\"tradoxidine:400mg\"], \"allergies\":[] }\n" +
                "        ]";

        JsonIterator iterator = JsonIterator.parse(input);
        iterator.readArray();

        MedicalRecordEntity medicalRecord = iterator.read(MedicalRecordEntity.class);
        Assert.assertEquals("John", medicalRecord.getFirstName());
        Assert.assertEquals("Boyd", medicalRecord.getLastName());
        Assert.assertEquals("03/06/1984", medicalRecord.getBirthdate());
        //Assert.assertEquals("aznol:350mg", medicalRecord.getMedications()[0]);
        //Assert.assertEquals("hydrapermazol:100mg", medicalRecord.getMedications()[1]);
        //Assert.assertEquals("nillacilan", medicalRecord.getAllergies()[0]);

        iterator.readArray();
        medicalRecord = iterator.read(MedicalRecordEntity.class);
        Assert.assertEquals("Jacob", medicalRecord.getFirstName());
        Assert.assertEquals("Boyd", medicalRecord.getLastName());
        Assert.assertEquals("03/06/1989", medicalRecord.getBirthdate());
        //Assert.assertEquals("pharmacol:5000mg", medicalRecord.getMedications()[0]);
        //Assert.assertEquals("terazine:10mg", medicalRecord.getMedications()[1]);
        //Assert.assertEquals("noznazol:250mg", medicalRecord.getMedications()[2]);
        //Assert.assertEquals(0, medicalRecord.getAllergies().length);

    }

    @Test
    public void whenParsedFireStationEndpoint_thenConvertedToJavaObjectCorrectly() {
        String input = "{ \"address\":\"1509 Culver St\", \"station\":\"3\" }";

        FireStationEntity fireStation = JsonIterator.deserialize(input, FireStationEntity.class);

        Assert.assertEquals("1509 Culver St", fireStation.getAddress());
        Assert.assertEquals("3", fireStation.getStation());

    }

    @Test
    public void whenParsedFireStationListEndpoint_thenConvertedToJavaObjectCorrectly() throws IOException {
        String input = "[\n" +
                "\t    { \"address\":\"1509 Culver St\", \"station\":\"3\" },\n" +
                "        { \"address\":\"29 15th St\", \"station\":\"2\" },\n" +
                "        { \"address\":\"834 Binoc Ave\", \"station\":\"3\" },\n" +
                "        { \"address\":\"644 Gershwin Cir\", \"station\":\"1\" },\n" +
                "        { \"address\":\"748 Townings Dr\", \"station\":\"3\" },\n" +
                "        { \"address\":\"112 Steppes Pl\", \"station\":\"3\" },\n" +
                "        { \"address\":\"489 Manchester St\", \"station\":\"4\" },\n" +
                "        { \"address\":\"892 Downing Ct\", \"station\":\"2\" },\n" +
                "        { \"address\":\"908 73rd St\", \"station\":\"1\" },\n" +
                "        { \"address\":\"112 Steppes Pl\", \"station\":\"4\" },\n" +
                "        { \"address\":\"947 E. Rose Dr\", \"station\":\"1\" },\n" +
                "        { \"address\":\"748 Townings Dr\", \"station\":\"3\" },\n" +
                "        { \"address\":\"951 LoneTree Rd\", \"station\":\"2\" }\n" +
                "\t]";

        JsonIterator iterator = JsonIterator.parse(input);
        iterator.readArray();

        FireStationEntity fireStation = iterator.read(FireStationEntity.class);
        Assert.assertEquals("1509 Culver St", fireStation.getAddress());
        Assert.assertEquals("3", fireStation.getStation());

        iterator.readArray();
        fireStation = iterator.read(FireStationEntity.class);
        Assert.assertEquals("29 15th St", fireStation.getAddress());
        Assert.assertEquals("2", fireStation.getStation());

    }

    @Test
    public void whenParsedInputDataWithEndpoint_thenConvertedToJavaObjectCorrectly() {
        String input = "{\n" +
                "    \"persons\": [\n" +
                "        { \"firstName\":\"John\", \"lastName\":\"Boyd\", \"address\":\"1509 Culver St\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-6512\", \"email\":\"jaboyd@email.com\" },\n" +
                "        { \"firstName\":\"Jacob\", \"lastName\":\"Boyd\", \"address\":\"1509 Culver St\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-6513\", \"email\":\"drk@email.com\" },\n" +
                "        { \"firstName\":\"Tenley\", \"lastName\":\"Boyd\", \"address\":\"1509 Culver St\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-6512\", \"email\":\"tenz@email.com\" },\n" +
                "        { \"firstName\":\"Roger\", \"lastName\":\"Boyd\", \"address\":\"1509 Culver St\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-6512\", \"email\":\"jaboyd@email.com\" },\n" +
                "        { \"firstName\":\"Felicia\", \"lastName\":\"Boyd\", \"address\":\"1509 Culver St\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-6544\", \"email\":\"jaboyd@email.com\" },\n" +
                "        { \"firstName\":\"Jonanathan\", \"lastName\":\"Marrack\", \"address\":\"29 15th St\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-6513\", \"email\":\"drk@email.com\" },\n" +
                "        { \"firstName\":\"Tessa\", \"lastName\":\"Carman\", \"address\":\"834 Binoc Ave\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-6512\", \"email\":\"tenz@email.com\" },\n" +
                "        { \"firstName\":\"Peter\", \"lastName\":\"Duncan\", \"address\":\"644 Gershwin Cir\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-6512\", \"email\":\"jaboyd@email.com\" },\n" +
                "        { \"firstName\":\"Foster\", \"lastName\":\"Shepard\", \"address\":\"748 Townings Dr\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-6544\", \"email\":\"jaboyd@email.com\" },\n" +
                "        { \"firstName\":\"Tony\", \"lastName\":\"Cooper\", \"address\":\"112 Steppes Pl\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-6874\", \"email\":\"tcoop@ymail.com\" },\n" +
                "        { \"firstName\":\"Lily\", \"lastName\":\"Cooper\", \"address\":\"489 Manchester St\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-9845\", \"email\":\"lily@email.com\" },\n" +
                "        { \"firstName\":\"Sophia\", \"lastName\":\"Zemicks\", \"address\":\"892 Downing Ct\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-7878\", \"email\":\"soph@email.com\" },\n" +
                "        { \"firstName\":\"Warren\", \"lastName\":\"Zemicks\", \"address\":\"892 Downing Ct\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-7512\", \"email\":\"ward@email.com\" },\n" +
                "        { \"firstName\":\"Zach\", \"lastName\":\"Zemicks\", \"address\":\"892 Downing Ct\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-7512\", \"email\":\"zarc@email.com\" },\n" +
                "        { \"firstName\":\"Reginold\", \"lastName\":\"Walker\", \"address\":\"908 73rd St\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-8547\", \"email\":\"reg@email.com\" },\n" +
                "        { \"firstName\":\"Jamie\", \"lastName\":\"Peters\", \"address\":\"908 73rd St\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-7462\", \"email\":\"jpeter@email.com\" },\n" +
                "        { \"firstName\":\"Ron\", \"lastName\":\"Peters\", \"address\":\"112 Steppes Pl\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-8888\", \"email\":\"jpeter@email.com\" },\n" +
                "        { \"firstName\":\"Allison\", \"lastName\":\"Boyd\", \"address\":\"112 Steppes Pl\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-9888\", \"email\":\"aly@imail.com\" },\n" +
                "        { \"firstName\":\"Brian\", \"lastName\":\"Stelzer\", \"address\":\"947 E. Rose Dr\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-7784\", \"email\":\"bstel@email.com\" },\n" +
                "        { \"firstName\":\"Shawna\", \"lastName\":\"Stelzer\", \"address\":\"947 E. Rose Dr\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-7784\", \"email\":\"ssanw@email.com\" },\n" +
                "        { \"firstName\":\"Kendrik\", \"lastName\":\"Stelzer\", \"address\":\"947 E. Rose Dr\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-7784\", \"email\":\"bstel@email.com\" },\n" +
                "        { \"firstName\":\"Clive\", \"lastName\":\"Ferguson\", \"address\":\"748 Townings Dr\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-6741\", \"email\":\"clivfd@ymail.com\" },\n" +
                "        { \"firstName\":\"Eric\", \"lastName\":\"Cadigan\", \"address\":\"951 LoneTree Rd\", \"city\":\"Culver\", \"zip\":\"97451\", \"phone\":\"841-874-7458\", \"email\":\"gramps@email.com\" }\n" +
                "\t], \n" +
                "    \"firestations\": [\n" +
                "\t    { \"address\":\"1509 Culver St\", \"station\":\"3\" },\n" +
                "        { \"address\":\"29 15th St\", \"station\":\"2\" },\n" +
                "        { \"address\":\"834 Binoc Ave\", \"station\":\"3\" },\n" +
                "        { \"address\":\"644 Gershwin Cir\", \"station\":\"1\" },\n" +
                "        { \"address\":\"748 Townings Dr\", \"station\":\"3\" },\n" +
                "        { \"address\":\"112 Steppes Pl\", \"station\":\"3\" },\n" +
                "        { \"address\":\"489 Manchester St\", \"station\":\"4\" },\n" +
                "        { \"address\":\"892 Downing Ct\", \"station\":\"2\" },\n" +
                "        { \"address\":\"908 73rd St\", \"station\":\"1\" },\n" +
                "        { \"address\":\"112 Steppes Pl\", \"station\":\"4\" },\n" +
                "        { \"address\":\"947 E. Rose Dr\", \"station\":\"1\" },\n" +
                "        { \"address\":\"748 Townings Dr\", \"station\":\"3\" },\n" +
                "        { \"address\":\"951 LoneTree Rd\", \"station\":\"2\" }\n" +
                "\t],\n" +
                "    \"medicalrecords\": [\n" +
                "        { \"firstName\":\"John\", \"lastName\":\"Boyd\", \"birthdate\":\"03/06/1984\", \"medications\":[\"aznol:350mg\", \"hydrapermazol:100mg\"], \"allergies\":[\"nillacilan\"] },\n" +
                "        { \"firstName\":\"Jacob\", \"lastName\":\"Boyd\", \"birthdate\":\"03/06/1989\", \"medications\":[\"pharmacol:5000mg\", \"terazine:10mg\", \"noznazol:250mg\"], \"allergies\":[] },\n" +
                "        { \"firstName\":\"Tenley\", \"lastName\":\"Boyd\", \"birthdate\":\"02/18/2012\", \"medications\":[], \"allergies\":[\"peanut\"] },\n" +
                "        { \"firstName\":\"Roger\", \"lastName\":\"Boyd\", \"birthdate\":\"09/06/2017\", \"medications\":[], \"allergies\":[] },\n" +
                "        { \"firstName\":\"Felicia\", \"lastName\":\"Boyd\",\"birthdate\":\"01/08/1986\", \"medications\":[\"tetracyclaz:650mg\"], \"allergies\":[\"xilliathal\"] },\n" +
                "        { \"firstName\":\"Jonanathan\", \"lastName\":\"Marrack\", \"birthdate\":\"01/03/1989\", \"medications\":[], \"allergies\":[] },\n" +
                "        { \"firstName\":\"Tessa\", \"lastName\":\"Carman\", \"birthdate\":\"02/18/2012\", \"medications\":[], \"allergies\":[] },\n" +
                "        { \"firstName\":\"Peter\", \"lastName\":\"Duncan\", \"birthdate\":\"09/06/2000\", \"medications\":[], \"allergies\":[\"shellfish\"] },\n" +
                "        { \"firstName\":\"Foster\", \"lastName\":\"Shepard\", \"birthdate\":\"01/08/1980\", \"medications\":[], \"allergies\":[] },\n" +
                "        { \"firstName\":\"Tony\", \"lastName\":\"Cooper\", \"birthdate\":\"03/06/1994\", \"medications\":[\"hydrapermazol:300mg\", \"dodoxadin:30mg\"], \"allergies\":[\"shellfish\"] },\n" +
                "        { \"firstName\":\"Lily\", \"lastName\":\"Cooper\", \"birthdate\":\"03/06/1994\", \"medications\":[], \"allergies\":[] },\n" +
                "        { \"firstName\":\"Sophia\", \"lastName\":\"Zemicks\", \"birthdate\":\"03/06/1988\", \"medications\":[\"aznol:60mg\", \"hydrapermazol:900mg\", \"pharmacol:5000mg\", \"terazine:500mg\"], \"allergies\":[\"peanut\", \"shellfish\", \"aznol\"] },\n" +
                "        { \"firstName\":\"Warren\", \"lastName\":\"Zemicks\", \"birthdate\":\"03/06/1985\", \"medications\":[], \"allergies\":[] },\n" +
                "        { \"firstName\":\"Zach\", \"lastName\":\"Zemicks\", \"birthdate\":\"03/06/2017\", \"medications\":[], \"allergies\":[] },\n" +
                "        { \"firstName\":\"Reginold\", \"lastName\":\"Walker\", \"birthdate\":\"08/30/1979\", \"medications\":[\"thradox:700mg\"], \"allergies\":[\"illisoxian\"] },\n" +
                "        { \"firstName\":\"Jamie\", \"lastName\":\"Peters\", \"birthdate\":\"03/06/1982\", \"medications\":[], \"allergies\":[] },\n" +
                "        { \"firstName\":\"Ron\", \"lastName\":\"Peters\", \"birthdate\":\"04/06/1965\", \"medications\":[], \"allergies\":[] },\n" +
                "        { \"firstName\":\"Allison\", \"lastName\":\"Boyd\", \"birthdate\":\"03/15/1965\", \"medications\":[\"aznol:200mg\"], \"allergies\":[\"nillacilan\"] },\n" +
                "        { \"firstName\":\"Brian\", \"lastName\":\"Stelzer\", \"birthdate\":\"12/06/1975\", \"medications\":[\"ibupurin:200mg\", \"hydrapermazol:400mg\"], \"allergies\":[\"nillacilan\"] },\n" +
                "        { \"firstName\":\"Shawna\", \"lastName\":\"Stelzer\", \"birthdate\":\"07/08/1980\", \"medications\":[], \"allergies\":[] },\n" +
                "        { \"firstName\":\"Kendrik\", \"lastName\":\"Stelzer\", \"birthdate\":\"03/06/2014\", \"medications\":[\"noxidian:100mg\", \"pharmacol:2500mg\"], \"allergies\":[] },\n" +
                "        { \"firstName\":\"Clive\", \"lastName\":\"Ferguson\", \"birthdate\":\"03/06/1994\", \"medications\":[], \"allergies\":[] },\n" +
                "        { \"firstName\":\"Eric\", \"lastName\":\"Cadigan\", \"birthdate\":\"08/06/1945\", \"medications\":[\"tradoxidine:400mg\"], \"allergies\":[] }\n" +
                "        ] \n" +
                "}";

        InputDataEntity data = JsonIterator.deserialize(input, InputDataEntity.class);

        Assert.assertEquals(23, data.getPersons().length);
        Assert.assertEquals(13, data.getFirestations().length);
        Assert.assertEquals(23, data.getMedicalrecords().length);

    }

    @Test
    public void whenParsedInputFile_thenConvertedToJavaObjectCorrectly() throws IOException {
        final String input = "https://s3-eu-west-1.amazonaws.com/course.oc-static.com/projects/DA+Java+EN/P5+/data.json";
        final URL url = new URL(input);

        final Scanner scan = new Scanner(url.openStream());
        final StringBuilder strBuilder = new StringBuilder();
        while (scan.hasNext())
            strBuilder.append(scan.nextLine());
        scan.close();
        final String strIn = strBuilder.toString();
        final InputDataEntity data = JsonIterator.deserialize(strIn, InputDataEntity.class);
        final String strOut = JsonStream.serialize(data);
        System.out.println(strOut);

        Assert.assertEquals(23, data.getPersons().length);
        Assert.assertEquals(13, data.getFirestations().length);
        Assert.assertEquals(23, data.getMedicalrecords().length);

    }

}
