package utn.edu.ParcialDemaria.controller;

import io.swagger.annotations.ApiOperation;
import utn.edu.ParcialDemaria.model.PhoneLine;
import utn.edu.ParcialDemaria.service.IntegrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/phoneLine")
public class Controller {

    @Autowired
    IntegrationService integrationService;

    @GetMapping("/exam/{prefix}")
    @ApiOperation(value = "Find phone lines by a prefix", notes = "Get the phone line(s) depending on the prefix we pass")
    public ResponseEntity<List<PhoneLine>> getAllPhoneLines(@PathVariable Integer prefix) {
        return integrationService.getAllPhoneLinesFromApiRest(prefix);
    }

}