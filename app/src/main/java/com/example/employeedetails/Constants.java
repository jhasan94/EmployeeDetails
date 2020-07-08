package com.example.employeedetails;

public class Constants {

    //DB name
    public static final String DB_NAME = "EMPLOYEE_INFO_DB";
    //DB VERSION
    public static final int DB_VERSION = 3;
    //DB TABLE
    public static final String TABLE_NAME = "EMPLOYEE_INFO_TABLE";
    //TABLE COLUMN
    public static final String C_ID = "ID";
    public static final String C_NAME = "NAME";
    public static final String C_AGE = "AGE";
    public static final String C_GENDER = "GENDER";
    public static final String C_IMAGE = "IMAGE";
    public static final String C_ADD_TIMESTAMP = "ADD_TIMESTAMP";
    public static final String C_UPDATE_TIMESTAMP = "UPDATE_TIMESTAMP";

    //CREATE QUERY FOR TABLE
    public static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " ("
            + C_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + C_NAME + " TEXT,"
            + C_AGE + " TEXT,"
            + C_GENDER + " TEXT,"
            + C_IMAGE + " TEXT,"
            + C_ADD_TIMESTAMP + " TEXT,"
            + C_UPDATE_TIMESTAMP + " TEXT"
            + ");";


}
