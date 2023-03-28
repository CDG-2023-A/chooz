package com.cdg.chooz.controller.user.request;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
public class SignUpRequest {
    @NotBlank
    private String name;

    @Email
    private String email;

    @NotBlank
    private String password;

//    private Providers provider;

    private String providerId;
}