package com.ace.town.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utilities {

    public static String getTimestampDDMMYYY(){

        LocalDateTime now = LocalDateTime.now();

        // Define the desired format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");

        // Format the current date and time
        return now.format(formatter);
    }
}
