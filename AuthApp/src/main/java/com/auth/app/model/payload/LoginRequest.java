package com.auth.app.model.payload;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.auth.app.validation.annotation.NullOrNotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "Login Request", description = "The login request payload")
public class LoginRequest {

    @NullOrNotBlank(message = "Login Username can be null but not blank")
    @ApiModelProperty(value = "Registered username", allowableValues = "NonEmpty String", allowEmptyValue = false)
    private String username;

    @NullOrNotBlank(message = "Login Email can be null but not blank")
    @ApiModelProperty(value = "User registered email", required = true, allowableValues = "NonEmpty String")
    private String email;

    @NotNull(message = "Login password cannot be blank")
    @ApiModelProperty(value = "Valid user password", required = true, allowableValues = "NonEmpty String")
    private String password;
    
    @NotNull(message = "Login on multiDevice")
    @ApiModelProperty(value = "allow login on multpleDevice", required = true, allowableValues = "true/false")
    private boolean loginAllowMultipleDevice;

    @Valid
    @NotNull(message = "Device info cannot be null")
    @ApiModelProperty(value = "Device info", required = true, dataType = "object", allowableValues = "A valid " +
            "deviceInfo object")
    private DeviceInfo deviceInfo;
}
