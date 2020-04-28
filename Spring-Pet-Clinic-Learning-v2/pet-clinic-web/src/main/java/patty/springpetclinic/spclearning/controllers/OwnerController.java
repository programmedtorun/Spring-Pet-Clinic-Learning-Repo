package patty.springpetclinic.spclearning.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import patty.springpetclinic.spclearning.services.OwnerService;

/**
 * Created by patrickskelley on Apr, 2020
 */


@Controller
public class OwnerController {

    // get handle on owner service - constructor injection. declare final so
    // obj can never be changed.
    private final OwnerService ownerService;

    // don't need @Autowired
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/owners", "owners/index", "owners/index.html"})
    public String listOwners(Model model){
        model.addAttribute("owners", ownerService.findAll()); // add owners attribute which is ret from findAll

        return "owners/index";
    }
}
