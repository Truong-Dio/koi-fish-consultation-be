package com.fengshui.corebusiness.resource;

import com.fengshui.common.repository.postgresql.dto.FengShuiConsulationDTO;
import com.fengshui.common.repository.postgresql.dto.FengshuiYearGenderDTO;
import com.fengshui.common.services.FengshuiYearGenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/fengshui")
@ComponentScan(basePackages = "com.fengshui.common.services")
public class FengshuiYearGenderResource {

    private final FengshuiYearGenderService fengShuiService;

    @Autowired
    public FengshuiYearGenderResource(FengshuiYearGenderService fengShuiService) {
        this.fengShuiService = fengShuiService;
    }

    @PostMapping("/calculate")
    public ResponseEntity<FengShuiConsulationDTO> calculateFengShui(@RequestBody FengshuiYearGenderDTO request) {
        int year = request.getYear();
        return fengShuiService.calculateFengShui(year);  // Returns the full Feng Shui data
    }
}
