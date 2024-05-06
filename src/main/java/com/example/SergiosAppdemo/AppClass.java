package com.example.SergiosAppdemo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class AppClass {
    @GetMapping(path = "/ciao/Lombardia")
    public parameterRiquest requestParam(
            @RequestParam(defaultValue = "Lombardia") String provincia
            , @RequestParam(defaultValue = "Giuseppe") String nome) {
        return new parameterRiquest(nome, provincia);
    }

}
