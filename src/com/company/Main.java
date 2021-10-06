package com.company;

public class Main {
    @SerializeData(dates ={
            @Data(day = "Tuesday",number=3,year=2022,month = "october",format = "03.10.2021"),
            @Data(day = "Wednesday",number=4,year=2022,month = "october",format = "03.10.2021"),
            @Data(day = "Friday",number=6,year=2022,month = "october",format = "03.10.2021"),


    }
            )


    public static void main(String[] args) {
        System.out.println("ss");    }
}
//TODO CREATE ARRAY OF ANNITAION
//TODO CREATE THE LAST TASK