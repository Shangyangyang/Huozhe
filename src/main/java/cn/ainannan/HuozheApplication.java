package cn.ainannan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cn.ainannan")
@SpringBootApplication
public class HuozheApplication {

	public static void main(String[] args) {
		SpringApplication.run(HuozheApplication.class, args);
	}
}
