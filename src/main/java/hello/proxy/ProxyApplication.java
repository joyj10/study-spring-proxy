package hello.proxy;

import hello.proxy.config.AppV1Config;
import hello.proxy.config.AppV2Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import({AppV1Config.class, AppV2Config.class}) // 클래스를 스프링 빈으로 등록(수동등록)
@SpringBootApplication(scanBasePackages = "hello.proxy.app") //이렇게 하는 경우 지정 폴더와 하위 폴더만 component scan 대상(스프링이 뜰때 해당 패키지만 등록) : 버전 별로 config 스캔하려고 지정
public class ProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProxyApplication.class, args);
	}

}
