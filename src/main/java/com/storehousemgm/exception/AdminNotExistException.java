package com.storehousemgm.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class AdminNotExistException extends  RuntimeException {
    private String message;
}
