package com.xxxcrash.xxxcrash.feature.game.service;

import com.xxxcrash.xxxcrash.feature.game.entity.GameEntity;

import java.util.List;

public interface GameService {

    GameEntity createGame(GameEntity gameEntity);

    List<GameEntity> getAllGames();

    void deleteGame(Integer gameId);
}
