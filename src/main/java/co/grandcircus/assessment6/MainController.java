package co.grandcircus.assessment6;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.grandcircus.assessment6.model.Plant;
import co.grandcircus.assessment6.repository.PlantRepository;

@Controller
public class MainController {
	
	@Autowired
	PlantRepository plantRepo;

	@RequestMapping("/")
	public String homepage(Model model) {
		List<Plant> plants = plantRepo.findAll();
		model.addAttribute("plants", plants);
		
		return "home";
	}
}
