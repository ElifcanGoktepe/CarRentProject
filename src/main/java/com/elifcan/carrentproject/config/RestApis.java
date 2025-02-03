package com.elifcan.carrentproject.config;

public class RestApis {

    private static final String VERSION = "/v1";
    private static final String DEV = "/dev";
    private static final String PROD = "/prod";
    private static final String TEST = "/test";
    private static final String API = "/api";
    private static final String BASE_URL = DEV + API;

    public static final String CAR = BASE_URL + "/car";

    public static final String REGISTER = BASE_URL + "/register";
    public static final String LIST = BASE_URL + "/list";
    public static final String CAR_BY_BRAND = BASE_URL + "/car-by-brand";
    public static final String CAR_BY_COLOR = BASE_URL + "/car-by-color";


}
