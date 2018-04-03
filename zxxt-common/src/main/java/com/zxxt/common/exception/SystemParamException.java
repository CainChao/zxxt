package com.zxxt.common.exception;

import java.io.Serializable;

/**
 * 参数异常
 */
public final class SystemParamException extends RuntimeException implements Serializable {
	private static final long serialVersionUID = 1030931998999674664L;

	public static final SystemParamException DEFALUT_NULL_OR_EMPTY_EXCETION = new SystemParamException("参数为空！");

	public static SystemParamException getNullOrEmptyException(String message) {
		return new SystemParamException(message);
	}

	public SystemParamException() {
		super();
	}

	public SystemParamException(String message) {
		super(message);
	}

	public SystemParamException(Throwable e) {
		super(e);
	}
}