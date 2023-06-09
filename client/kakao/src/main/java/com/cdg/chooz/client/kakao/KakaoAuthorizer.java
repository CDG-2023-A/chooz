package com.cdg.chooz.client.kakao;

import com.cdg.chooz.client.kakao.request.BearerAuthHeader;
import com.cdg.chooz.client.kakao.response.KakaoTokenResponse;
import com.cdg.chooz.client.kakao.response.KakaoUserInfo;
import com.cdg.chooz.domain.user.ProviderType;
import com.cdg.chooz.domain.user.ThirdPartyAuthorizer;
import com.cdg.chooz.domain.user.ThirdPartySignupInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class KakaoAuthorizer implements ThirdPartyAuthorizer {

    @Value("${spring.security.oauth2.client.registration.kakao.client-id:대충 기본 클라이언트아이디}")
    private String clientId;

    @Value("${spring.security.oauth2.client.registration.kakao.client-secret:대충 시크릿키}")
    private String client_secret;

    private final KakaoAuthClient kakaoAuthClient;
    private final KakaoApiClient kakaoApiClient;

    @Override
    public String getAccessToken(ThirdPartySignupInfo signupInfo) {
        Map<String, String> propertiesValues = signupInfo.getPropertiesValues();

        KakaoTokenResponse response = kakaoAuthClient.generateToken(
                "authorization_code",
                clientId,
                propertiesValues.get("redirectUrl"),
                propertiesValues.get("code"),
                client_secret
        );

        return response.getAccess_token();
    }

    @Override
    public Map<String, String> getUserInfo(String accessToken) {
        KakaoUserInfo kakaoUserInfo = kakaoApiClient.getUserInfo(new BearerAuthHeader(accessToken).getAuthorization());

        Map<String, String> result = new HashMap<>();
        result.put("id", kakaoUserInfo.getId().toString());
        result.put("nickname", kakaoUserInfo.getNickName());
        result.put("profile_image", kakaoUserInfo.getProfileImage());
        return result;
    }

    @Override
    public ProviderType getProviderType() {
        return ProviderType.KAKAO;
    }

}
