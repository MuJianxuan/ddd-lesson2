package com.rao.dddstudy.infrastructure.repositoryimpl;

import com.rao.dddstudy.domain.dp.EntityId;
import com.rao.dddstudy.domain.dp.PlayerId;
import com.rao.dddstudy.domain.player.PlayerOpeEntity;
import com.rao.dddstudy.domain.player.PlayerOpeRepository;
import com.rao.dddstudy.infrastructure.datamodel.PlayerOpe;
import com.rao.dddstudy.infrastructure.mapper.PlayOpeMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author create 2024/3/18 by rao
 */
@Component
public class PlayerOpeRepositoryImpl implements PlayerOpeRepository {

    @Autowired
    private PlayOpeMapper playOpeMapper;

    @Override
    public PlayerOpeEntity load(PlayerId playerId) {
        PlayerOpe playerOpe = playOpeMapper.getByPlayId(playerId.getValue());
        if(playerOpe == null){
            return null;
        }

        PlayerOpeEntity playerOpeEntity = new PlayerOpeEntity();
        BeanUtils.copyProperties(playerOpe,playerOpeEntity);
        playerOpeEntity.setPlayerId(new PlayerId(playerOpe.getPlayerId()));
        return playerOpeEntity;
    }

    @Override
    public void saveOrUpdate(PlayerOpeEntity playerOpeEntity) {
        // save or update
        //Long value = playerOpeEntity.getEntityId().getValue();
        //PlayerOpe playerOpe = playOpeMapper.getByPlayId(playerOpeEntity.getPlayerId());
        //if(playerOpe ==null){
        //    playerOpe = new PlayerOpe();
        //    BeanUtils.copyProperties(playerOpeEntity,playerOpe);
        //    playerOpe.setId(value);
        //    playOpeMapper.insert(playerOpe);
        //}
        //else{
        //    BeanUtils.copyProperties(playerOpeEntity,playerOpe);
        //    playerOpe.setId(value);
        //    playOpeMapper.updateCpIdAndCount(playerOpe);
        //}

    }
}
