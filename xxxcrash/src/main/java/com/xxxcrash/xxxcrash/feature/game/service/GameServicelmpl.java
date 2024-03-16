package com.xxxcrash.xxxcrash.feature.game.service;

import com.xxxcrash.xxxcrash.feature.game.entity.GameEntity;
import com.xxxcrash.xxxcrash.feature.game.repository.GameRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServicelmpl implements GameService {

    private final GameRepository gameRepository;

    public GameServicelmpl(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Override
    public GameEntity createGame(GameEntity gameEntity) {
        return gameRepository.save(gameEntity);
    }

    @Override
    public List<GameEntity> getAllGames() {
        return gameRepository.findAll();
    }

    @Override
    public void deleteGame(Integer gameId) {
        gameRepository.deleteById(gameId);
    }
}
