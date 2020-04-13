package patty.springpetclinic.spclearning.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by patrickskelley on Apr, 2020
 */


@Controller
public class OwnerController {

    @RequestMapping({"/owners", "owners/index", "owners/index.html"})
    public String listOwners(){ return "owners/index"; }
}
