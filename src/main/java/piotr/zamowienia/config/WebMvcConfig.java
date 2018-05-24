package piotr.zamowienia.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Controller
public class WebMvcConfig extends WebMvcConfigurerAdapter {
	
	@Bean
	public BCryptPasswordEncoder pwdEnc() {
		BCryptPasswordEncoder bcp = new BCryptPasswordEncoder();
		
		return bcp;
	}

}
