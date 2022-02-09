package com.example.webapi;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
public class CPEController {
    private final List<CPE> resources = generateResources();

    @GetMapping("cpes")
    public List<CPE> getAll() {
        return resources;
    }

    @GetMapping("cpes/{ruc}/{fechaEmision}/{codTipoDocumento}/{serie}/{correlativo}")
    public CPE getOne(@PathVariable String ruc,
                      @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate fechaEmision,
                      @PathVariable String codTipoDocumento,
                      @PathVariable String serie,
                      @PathVariable String correlativo) {
        return resources.stream()
                .filter(cpe -> cpe.getRuc().equals(ruc) &&
                        cpe.getFechaEmision().toLocalDate().equals(fechaEmision) &&
                        cpe.getCodTipoDocumento().equals(codTipoDocumento) &&
                        cpe.getSerie().equals(serie) &&
                        cpe.getCorrelativo().equals(correlativo))
                .findFirst()
                .orElse(null);
    }

    private List<CPE> generateResources() {
        final List<CPE> resources = new ArrayList<>();
        resources.add(new CPE(
                1L,
                1L,
                "20604084092",
                "SYSVENT SAC",
                "F001",
                "1",
                LocalDateTime.now(),
                null,
                null,
                null,
                "20604084092-01-F001-1",
                "R-20604084092-01-F001-1",
                1.0,
                true,
                "1",
                "1"));
        resources.add(new CPE(
                2L,
                1L,
                "20604084092",
                "SYSVENT SAC",
                "F001",
                "2",
                LocalDateTime.now(),
                null,
                null,
                null,
                "20604084092-01-F001-2",
                "R-20604084092-01-F001-2",
                2.0,
                true,
                "1",
                "1"));
        resources.add(new CPE(
                3L,
                1L,
                "20604084092",
                "SYSVENT SAC",
                "F001",
                "3",
                LocalDateTime.now(),
                null,
                null,
                null,
                "20604084092-01-F001-3",
                "R-20604084092-01-F001-3",
                3.0,
                true,
                "1",
                "1"));
        return resources;
    }
}
