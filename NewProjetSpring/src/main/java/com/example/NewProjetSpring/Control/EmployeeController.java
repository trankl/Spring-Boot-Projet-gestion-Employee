package com.example.NewProjetSpring.Control;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.NewProjetSpring.ResourceNotFoundException;
import com.example.NewProjetSpring.Model.Employee;
import com.example.NewProjetSpring.Service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
    private EmployeeService employeeService;

	// Injectez (inject) de l'application.properties.
	@Value("${welcome.message}")
	private String message;

	@Value("${error.message}")
	private String errorMessage;	 
 
 @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
	public String index(Model model) {

		model.addAttribute("message", message);
		System.out.println(message);
		return "index";
	}
 
 @RequestMapping(value = { "/employeesList" }, method = RequestMethod.GET)
	public String personList(Model model) {
	 	
		model.addAttribute("ListEmployees", employeeService.getAllEmployees());
		System.out.println("List Employees : " + employeeService.getAllEmployees());
		return "employeesList";
	}
 
 	@GetMapping("/addEmployee")
 		public String formGet(Model model) {
     model.addAttribute("employee", new Employee());
     return "addEmployee";
 }

 	@PostMapping("/addEmployee")
 public String formPost(@Validated Employee employee, BindingResult bindingResult, Model model) {
     if (!bindingResult.hasErrors()) {
         model.addAttribute("noErrors", true);
         
     }
     model.addAttribute("employee", employeeService.saveEmployee(employee));
     return "addEmployee";
 }
 	
 	  @DeleteMapping (path="/deleteEmployee/{id}")
 	    public void deleteEmployee(@PathVariable("id") final Long id) {
 	    	employeeService.deleteEmployee(id);
 	    }
 	
  
}

