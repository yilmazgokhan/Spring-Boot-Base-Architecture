package com.yilmazgokhan.architecture.exception.user;

import com.yilmazgokhan.architecture.exception.core.ArchitectureException;
import org.springframework.http.HttpStatus;

import static com.yilmazgokhan.architecture.util.Constants.Exception.User.USER_NOT_FOUND;
import static com.yilmazgokhan.architecture.util.Constants.Exception.User.USER_NOT_FOUND_CODE;

public class UserNotFoundException extends ArchitectureException {

    //region
    private static final long serialVersionUID = 1L;
    //endregion

    public UserNotFoundException() {
        super();
        this.code = USER_NOT_FOUND_CODE;
        this.msg = USER_NOT_FOUND;
        this.status = HttpStatus.NOT_FOUND;
    }
}