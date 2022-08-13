package com.yilmazgokhan.architecture.util;

public class Constants {

    public static final String API_VERSION = "/v1";
    public static final String BASE_URL = "/architecture_api" + API_VERSION;

    public static final class UserPaths {
        public static final String USER_PATH = BASE_URL + "/user";
    }

    public static final class Exception {
        public static final class Common {
            public static final String INVALID_PARAM_CODE = "000001";
            public static final String INVALID_PARAM = "Invalid request params";
        }

        public static final class User {

            public static final String USER_NOT_FOUND_CODE = "000100";
            public static final String USER_NOT_FOUND = "User not found";

            public static final String USER_ALREADY_EXIST_CODE = "000101";
            public static final String USER_ALREADY_EXIST = "User already exist";
        }
    }

    public static final class Client {
        public static final String BASE_URL = "https://yilmazgokhan.github.io/";
    }

}
