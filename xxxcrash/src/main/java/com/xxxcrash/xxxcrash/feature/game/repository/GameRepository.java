package com.xxxcrash.xxxcrash.feature.game.repository;

import com.xxxcrash.xxxcrash.feature.game.entity.GameEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<GameEntity, Integer> {

}
