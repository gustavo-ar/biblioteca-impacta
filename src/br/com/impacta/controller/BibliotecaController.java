package br.com.impacta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Controller
public class BibliotecaController extends WebMvcConfigurerAdapter {
	@RequestMapping("admin")
	public String homeAdmin() {
		return "admin/index";
	}
	
	@RequestMapping("admin/login")
	public String loginAdmin() {
		return "admin/login";
	}

	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
}
