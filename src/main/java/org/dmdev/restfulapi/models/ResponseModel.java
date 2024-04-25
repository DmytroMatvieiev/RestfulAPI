package org.dmdev.restfulapi.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseModel {
    public static final String SUCCESS_STATUS = "success";
    public static final String FAIL_STATUS = "fail";
    private String status;
    private String message;
    private Object data;
}
