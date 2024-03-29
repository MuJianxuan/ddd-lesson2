package com.rao.dddstudy.domain.player;

import com.rao.dddstudy.domain.dp.PlayerId;
import com.rao.dddstudy.domain.player.PlayerOpeEntity;

/**
 * @author create 2024/3/18 by rao
 */
public interface PlayerOpeRepository {

    PlayerOpeEntity load(PlayerId playerId);

    void saveOrUpdate(PlayerOpeEntity playerOpeEntity);
}
