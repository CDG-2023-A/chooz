package com.cdg.chooz.controller.user.request;

import com.cdg.chooz.domain.user.ProviderType;
import com.cdg.chooz.domain.user.ThirdPartySignupInfo;

import javax.validation.constraints.NotBlank;
import java.util.HashMap;
import java.util.Map;

public class GetNaverTokenRequest {
    @NotBlank
    String code;

    @NotBlank
    String state;

    public ThirdPartySignupInfo toDomain() {
        Map<String, String> propertiesValues = new HashMap<>();
        propertiesValues.put("code", code);
        propertiesValues.put("state", state);
        return new ThirdPartySignupInfo(ProviderType.NAVER, propertiesValues);
    }
}
