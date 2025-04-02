package kr.co.shortenUrlService.presentation;

import jakarta.validation.Valid;
import kr.co.shortenUrlService.application.SimpleShortenUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ShortenUrlRestController {

    private final SimpleShortenUrlService simpleShortenUrlService;

    @Autowired
    public ShortenUrlRestController(SimpleShortenUrlService simpleShortenUrlService) {
        this.simpleShortenUrlService = simpleShortenUrlService;
    }
    //단축 url을 생성하는 api

    @PostMapping("/shortenUrl")
    public ShortenUrlCreateResponseDTO createShortenUrl(
            @RequestBody @Valid ShortenUrlCreateRequestDTO shortenUrlCreateRequestDTO) {
        //서비스 코드를 추가해야한다. 그리고 dto타입으로 반환해야하나다
        ShortenUrlCreateResponseDTO shortenUrlCreateResponseDTO = simpleShortenUrlService.createShortenUrl(shortenUrlCreateRequestDTO);
        return ShortenUrlCreateResponseDTO;
    }

    //key를 넘겨주면 리다이렉트해주는 api
    @GetMapping("{shortenUrlKey}")
    public ResponseEntity<?> retrieveShortenUrl(){
        return ResponseEntity.ok(null);
    }


    @GetMapping("/shortenUrl/{shortenUrlKey}")
    public ShortenUrlInformationDTO getShortenUrlInformation(@PathVariable String shortenUrlKey) {
        return null;
    }
}
