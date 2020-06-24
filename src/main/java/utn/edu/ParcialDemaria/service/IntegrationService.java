package utn.edu.ParcialDemaria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import utn.edu.ParcialDemaria.model.PhoneLine;
import utn.edu.ParcialDemaria.service.integration.IntegrationComponent;

import java.util.List;

@Service
public class IntegrationService {

    @Autowired
    IntegrationComponent integrationComponent;

    public ResponseEntity<List<PhoneLine>> getAllPhoneLinesFromApiRest(Integer prefix) {
        return integrationComponent.getAllPhonesLinesByPrefix(prefix);
    }
}