package com.auth.app.model.payload;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

import com.auth.app.validation.annotation.NullOrNotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "Registration Request", description = "The registration request payload")
public class RegistrationRequest {

    @NullOrNotBlank(message = "Registration username can be null but not blank")
    @ApiModelProperty(value = "A valid username", allowableValues = "NonEmpty String")
    private String username;

    @NullOrNotBlank(message = "Registration email can be null but not blank")
    @ApiModelProperty(value = "A valid email", required = true, allowableValues = "NonEmpty String")
    private String email;

    @NotNull(message = "Registration password cannot be null")
    @ApiModelProperty(value = "A valid password string", required = true, allowableValues = "NonEmpty String")
    private String password;

    @NotNull(message = "Specify whether the user has to be registered as an admin or not")
    @ApiModelProperty(value = "Flag denoting whether the user is an admin or not", required = true,
            dataType = "boolean", allowableValues = "true, false")
    private Boolean registerAsAdmin;
    
    @NullOrNotBlank(message = "Registration username can be null but not blank")
    @ApiModelProperty(value = "A valid firstname",required = false, allowableValues = "NonEmpty String")
    private String firstname;

    @NullOrNotBlank(message = "Registration username can be null but not blank")
    @ApiModelProperty(value = "A valid lastname",required = false, allowableValues = "NonEmpty String")
    private String lasttname;    
}
