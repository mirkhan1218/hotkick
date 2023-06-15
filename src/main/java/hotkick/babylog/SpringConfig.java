package hotkick.babylog;

import hotkick.babylog.repository.MemberRepository;
import hotkick.babylog.repository.MemoryMemberRepository;
import hotkick.babylog.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}