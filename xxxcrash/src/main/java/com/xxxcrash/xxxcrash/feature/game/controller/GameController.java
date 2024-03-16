package com.xxxcrash.xxxcrash.feature.game.controller;

import com.xxxcrash.xxxcrash.feature.game.entity.GameEntity;
import com.xxxcrash.xxxcrash.feature.game.service.GameService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/games")
public class GameController {

    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @PostMapping
    public GameEntity createGame(@RequestBody GameEntity gameEntity) {
        return gameService.createGame(gameEntity);
    }

    @GetMapping
    public List<GameEntity> getAllGames() {
        return gameService.getAllGames();
    }

    @DeleteMapping("/{gameId}")
    public void deleteGame(@PathVariable Integer gameId) {
        gameService.deleteGame(gameId);
    }
}
