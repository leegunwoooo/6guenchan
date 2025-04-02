package kr.co.shortenUrlService.presentation;

import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.URL;

//사용자가 요청할 때 사용하는 데이터 형식 이 형식이 요청이 와야한다. json -> java객체
//이 역할을 수행해주는게 @RequestBody
public class ShortenUrlCreateRequestDTO {

    @NotNull
    @URL(regexp = "/^(https?|ftp):\\/\\/(-\\.)?([^\\s\\/?\\.#-]+\\.?)+(\\/[^\\s]*)?$/i;")
    private String originalUrl;

    public String getOriginalUrl() {
        return originalUrl;
    }
}

