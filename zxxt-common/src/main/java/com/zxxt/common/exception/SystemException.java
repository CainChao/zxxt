package com.zxxt.common.exception;

import java.io.Serializable;

public class SystemException extends RuntimeException implements Serializable{

    private static final long serialVersionUID = 1030931998999674664L;

    public SystemException() {
        super();
    }

    public SystemException(Exception e) {
        super(e);
    }

    public SystemException(String message) {
        super(message);
    }
}
