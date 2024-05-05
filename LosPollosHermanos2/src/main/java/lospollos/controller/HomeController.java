package lospollos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import lospollos.service.ProductoService;



@RestController
public class HomeController {
	
	@Autowired
	private ProductoService productoService;
	
	 @GetMapping("/hello")
	    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
	      return String.format("Hello %s!", name);
	    }
	    
	    @GetMapping(value = "/")
	    public ModelAndView products() {
	    	ModelAndView modelAndView = new ModelAndView("products");
	    	modelAndView.getModelMap().addAttribute("productos",productoService.getAllProducts());
	    	return modelAndView;
	    }
	    
	    @GetMapping(value = "/login")
		public ModelAndView login() {
	    	ModelAndView modelAndView = new ModelAndView("login");
	    	return modelAndView;

		}
}
