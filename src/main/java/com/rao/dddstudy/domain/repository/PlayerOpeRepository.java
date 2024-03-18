package com.rao.dddstudy.domain.repository;

import com.rao.dddstudy.domain.entity.PlayerOpeEntity;

/**
 * @author create 2024/3/18 by rao
 */
public interface PlayerOpeRepository {

    PlayerOpeEntity load(String playerId);

    void saveOrUpdate(PlayerOpeEntity playerOpeEntity);
}
