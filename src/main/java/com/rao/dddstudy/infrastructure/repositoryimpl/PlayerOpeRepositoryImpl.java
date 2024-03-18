package com.rao.dddstudy.infrastructure.repositoryimpl;

import com.rao.dddstudy.domain.dp.EntityId;
import com.rao.dddstudy.domain.entity.PlayerOpeEntity;
import com.rao.dddstudy.domain.repository.PlayerOpeRepository;
import com.rao.dddstudy.infrastructure.datamodel.PlayerOpe;
import com.rao.dddstudy.infrastructure.mapper.PlayOpeMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author create 2024/3/18 by rao
 */
@Component
public class PlayerOpeRepositoryImpl implements PlayerOpeRepository {

    @Autowired
    private PlayOpeMapper playOpeMapper;

    @Override
    public PlayerOpeEntity load(String playerId) {
        PlayerOpe playerOpe = playOpeMapper.getByPlayId(playerId);
        PlayerOpeEntity playerOpeEntity = new PlayerOpeEntity();
        if(playerOpe != null){
            BeanUtils.copyProperties(playerOpe,playerOpeEntity);
            playerOpeEntity.setEntityId(new EntityId(playerOpe.getId()));
        }
        else {
            EntityId entityId = new EntityId(1L);
            playerOpeEntity.setEntityId(entityId);
        }
        return playerOpeEntity;
    }

    @Override
    public void saveOrUpdate(PlayerOpeEntity playerOpeEntity) {
        Long value = playerOpeEntity.getEntityId().getValue();
        PlayerOpe playerOpe = playOpeMapper.getByPlayId(playerOpeEntity.getPlayerId());
        if(playerOpe ==null){
            playerOpe = new PlayerOpe();
            BeanUtils.copyProperties(playerOpeEntity,playerOpe);
            playerOpe.setId(value);
            playOpeMapper.insert(playerOpe);
        }
        else{
            BeanUtils.copyProperties(playerOpeEntity,playerOpe);
            playerOpe.setId(value);
            playOpeMapper.updateCpIdAndCount(playerOpe);
        }

    }
}
