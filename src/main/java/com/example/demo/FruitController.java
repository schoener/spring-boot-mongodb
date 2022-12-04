package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class FruitController {

    private final FruitService fruitService;

    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    @PostMapping("/fruits")
    public ResponseEntity addFruit(@RequestBody FruitRequest fruitRequest) {
        log.info("Request : {}", fruitRequest);
        fruitService.saveFruit(fruitRequest.toFruitModel());
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/fruits")
    public List<FruitModel> getAllFruit() {
        List<FruitModel> fruits = fruitService.findAll();
        log.info("Request : {}", fruits);
        return fruits;
    }

    @GetMapping("/fruits/delete/all")
    public String deleteAllFruits() {
        log.info("deleteAllFruits Request");
        fruitService.deleteAll();
        return "All records deleted Successfully";
    }
}
