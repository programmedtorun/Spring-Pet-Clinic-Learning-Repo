package patty.springpetclinic.spclearning.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import patty.springpetclinic.spclearning.services.VetService;

/**
 * Created by patrickskelley on Apr, 2020
 */

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String listVets(Model model){

        model.addAttribute("vets", vetService.findAll());

        return "vets/index";
    }

}
