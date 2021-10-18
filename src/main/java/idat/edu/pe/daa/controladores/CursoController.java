package idat.edu.pe.daa.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cursos")
public class CursoController {
	
	// Verbos más usados http: 1.GET --> Consulta, 2.POST --> Registro o guardado de datos 
							// 3.PUT --> Modificación o actualización y 4. DELETE --> Eliminar
	@GetMapping("/inicio")  //--> //localhost:8080/cursos/inicio
	public String greeting (Model model) {
		model.addAttribute("nombreModulo", "Consulta de Cursos");
		return "resultado";
	}
	

}
