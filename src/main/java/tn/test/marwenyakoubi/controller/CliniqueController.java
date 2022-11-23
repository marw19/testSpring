package tn.test.marwenyakoubi.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.test.marwenyakoubi.entities.Clinique;
import tn.test.marwenyakoubi.service.Iclinique;

@RequestMapping("Clinique")
@RestController
@AllArgsConstructor
public class CliniqueController {
    Iclinique iclinique;
    @PostMapping("/add")
    @ResponseBody
    public Clinique addClinique (@RequestBody Clinique c){return iclinique.addClinique(c);
    }
}
