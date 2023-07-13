package com.elk.main.controler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.elk.main.service.LoremDataService;

@RestController
public class LoremDataController {

    private final LoremDataService loremDataService;

    public LoremDataController(LoremDataService loremDataService) {
        this.loremDataService = loremDataService;
    }

    @PostMapping("/lorem-data")
    public ResponseEntity<String> pushLoremData(@RequestBody String text) {
        loremDataService.pushLoremData(text);
        return ResponseEntity.ok("Data pushed successfully");
    }
}
