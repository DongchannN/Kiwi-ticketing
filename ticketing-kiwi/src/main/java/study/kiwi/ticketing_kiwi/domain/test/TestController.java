package study.kiwi.ticketing_kiwi.domain.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.kiwi.ticketing_kiwi.global.exception.CommonException;
import study.kiwi.ticketing_kiwi.global.exception.CommonResponseStatus;

@Slf4j
@RestController
public class TestController {

    @RequestMapping("/test-member-v1/{name}")
    public TestMember testExceptionHandler(@PathVariable("name") String name) {
        log.info("TestController :: testExceptionHandler :: name = {}", name);
        if ("ex".equals(name))
            throw new CommonException(CommonResponseStatus.BAD_REQUEST);
        return (new TestMember(name, 20));
    }
}
