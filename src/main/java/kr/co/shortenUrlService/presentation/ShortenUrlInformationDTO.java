package kr.co.shortenUrlService.presentation;

public class ShortenUrlInformationDTO {
    private String originalUrl;
    private String shortenedUrlKey;
    private Integer redirectCount;

    public String getOriginalUrl() {
        return originalUrl;
    }

    public String getShortenedUrlKey() {
        return shortenedUrlKey;
    }

    public Integer getRedirectCount() {
        return redirectCount;
    }
}
