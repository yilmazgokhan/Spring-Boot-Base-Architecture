package com.yilmazgokhan.architecture.exception.core;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ErrorResponse extends Response {

    public ErrorResponse(ArchitectureException exception) {
        this.result = false;
        this.status = exception.status.value();
        this.error_code = exception.getCode();
        this.msg = exception.getMsg();
    }
}
