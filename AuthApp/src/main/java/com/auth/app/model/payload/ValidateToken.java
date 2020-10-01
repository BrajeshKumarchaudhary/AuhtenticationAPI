package com.auth.app.model.payload;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ValidateToken {
	@ApiModelProperty(value = "Device info", required = true, dataType = "String", allowableValues = "A valid " +
            "deviceId")
    private String deviceId;
	private String emailId;
}
