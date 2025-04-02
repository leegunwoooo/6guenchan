package kr.co.shortenUrlService.presentation;

import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.URL;

public class ShortenUrlCreateRequestDTO {

    @NotNull
    @URL(regexp = "/^(https?|ftp):\\/\\/(-\\.)?([^\\s\\/?\\.#-]+\\.?)+(\\/[^\\s]*)?$/i;")
    private String originalUrl;
}

