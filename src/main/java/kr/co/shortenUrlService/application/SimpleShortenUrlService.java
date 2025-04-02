package kr.co.shortenUrlService.application;

import kr.co.shortenUrlService.domain.ShortenUrl;
import kr.co.shortenUrlService.domain.ShortenUrlRepository;
import kr.co.shortenUrlService.presentation.ShortenUrlCreateRequestDTO;
import kr.co.shortenUrlService.presentation.ShortenUrlCreateResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SimpleShortenUrlService {
    private ShortenUrlRepository shortenUrlRepository;

    @Autowired
    public SimpleShortenUrlService(ShortenUrlRepository shortenUrlRepository) {
        this.shortenUrlRepository = shortenUrlRepository;
    }

    public ShortenUrlCreateResponseDTO createShortenUrl(ShortenUrlCreateRequestDTO shortenUrlCreateRequestDTO) {
        String originalUrl = shortenUrlCreateRequestDTO.getOriginalUrl();
        String shortenUrlkey = ShortenUrl.generateShortenUrlKey();

        ShortenUrl shortenUrl = new ShortenUrl(originalUrl, shortenUrlkey);

        shortenUrlRepository.saveShortenUrl(shortenUrl);

        //ShortenUrlCreateResponseDTO shortenUrlCreateResponseDTO = new ShortenUrlCreateResponseDTO(shortenUrl);

        return new ShortenUrlCreateResponseDTO(shortenUrl);
    }

}
