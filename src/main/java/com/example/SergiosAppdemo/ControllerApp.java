package com.example.SergiosAppdemo;

import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/v2")
public class ControllerApp {
    @GetMapping(path = "/ciao/Lombardia")
    public UserData requestParam(@RequestParam(defaultValue = "Lombardia") String provincia, @RequestParam(defaultValue = "Giuseppe") String nome) {
        return new UserData(nome, provincia);
    }

}
