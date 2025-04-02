package kr.co.shortenUrlService.domain;

import java.util.Random;

//여기에 비밀리에 매우 중요하게 수행되는 핵심 비즈니스 로직들이 저장되어야함
//이를 테면 . 생성 알고리즘 코드를 적절해보임
public class ShortenUrl {
    private String originalUrl;
    private String shortenUrlKey;
    private Long redirectCount;

    public ShortenUrl(String originalUrl, String shortenUrlKey){
        this.originalUrl = originalUrl;
        this.shortenUrlKey = shortenUrlKey;
    }

    public static String generateShortenUrlKey(){
        String base = "23456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnpqrstuvwxyz";
        Random random = new Random();
        StringBuilder result = new StringBuilder();


        for(int count = 0; count < 8; count++){
            char ch = base.charAt(random.nextInt(base.length()));
            result.append(ch);
        }

        return result.toString();
    }
}
