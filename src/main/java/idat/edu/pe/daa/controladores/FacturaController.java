package idat.edu.pe.daa.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/facturas")
public class FacturaController {
	
	// Verbos más usados http: 1.GET --> Consulta, 2.POST --> Registro o guardado de datos 
	// 3.PUT --> Modificación o actualización y 4. DELETE --> Eliminar
	@GetMapping("/inicio")  //--> //localhost:8080/facturas/inicio
	public String greeting (Model model) {
		model.addAttribute("nombreModulo", "Emisión de Facturas");
		return "resultado";
	}


}
