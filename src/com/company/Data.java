package com.company;

public @interface Data {
    public String day() default "Monday";
    public int number() default 5;
    public int year() default 2021;
    public String month() default "October";
    public String format() default "05.10.2021";

}
