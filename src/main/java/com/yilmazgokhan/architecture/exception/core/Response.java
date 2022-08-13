package com.yilmazgokhan.architecture.exception.core;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Response {
    protected boolean result;
    protected int status;
    protected String error_code;
    protected String msg;
}
