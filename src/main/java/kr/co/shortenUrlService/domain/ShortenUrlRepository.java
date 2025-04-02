package kr.co.shortenUrlService.domain;

import org.springframework.stereotype.Repository;

//레포지토리의 역할은 서비스로부터 받아온 데이터를 저장하는 역할이다.
//예외적으로 컬렉션 프레임워크를 활용하역 구현
//헐 어떤 레포지토리는 데이터베이스에 저장하고 어떤 레포지토리는 자바 자료구조에 저장하도록 유연하게 코드를 짜두면
//레포지토리를 인터페이스로 만들어주는 것이 적절해 보인다.
@Repository
public interface ShortenUrlRepository {

}
