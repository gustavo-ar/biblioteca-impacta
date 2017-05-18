package br.com.impacta.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import br.com.impacta.model.Funcionario;
import br.com.impacta.model.Pessoa;

@Controller
public class BibliotecaController extends WebMvcConfigurerAdapter {
	@RequestMapping("admin")
	public String homeAdmin(Model model) throws ClassNotFoundException, SQLException {		
		Pessoa logado = new Funcionario();
		logado.setIdpessoa(1600559);
		logado.loadById();
		model.addAttribute("pessoa",logado);
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
