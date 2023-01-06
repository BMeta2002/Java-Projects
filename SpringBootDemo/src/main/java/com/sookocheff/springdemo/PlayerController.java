package com.sookocheff.springdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {
        @GetMapping("/player")
        public Player getPlayer(@RequestParam(value = "playerId", defaultValue = "12345") final String playerId) {
            return new Player(playerId, "soofaloofa", "Kevin Sookocheff");
        }
    }
