package com.ace.town.pojo;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AppError {

    private String status;
    private String message;
    private String timeStamp;

}
