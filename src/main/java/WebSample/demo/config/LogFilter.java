package WebSample.demo.config;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Slf4j
public class LogFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        //외부 -> filter (-> 처리 ->) filter -> 외부
        //chain.doFilter를 통해서 다음 filter 로직을 실행하도록 해준다.

        log.info("hello LogFilter : " + Thread.currentThread());
        chain.doFilter(request, response);
        log.info("goodbye LogFilter : " + Thread.currentThread());
    }
}
