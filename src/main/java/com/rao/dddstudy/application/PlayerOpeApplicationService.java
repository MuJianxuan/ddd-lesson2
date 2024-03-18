package com.rao.dddstudy.application;

import com.rao.dddstudy.application.command.CpCommand;
import com.rao.dddstudy.application.command.MvpCommand;
import com.rao.dddstudy.domain.entity.PlayerOpeEntity;
import com.rao.dddstudy.domain.repository.PlayerOpeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 玩家操作应用服务
 * @author create 2024/3/18 by rao
 */
@Slf4j
@Component
public class PlayerOpeApplicationService {

    @Autowired
    private PlayerOpeRepository playerOpeRepository;

    /**
     * 处理 cp 的数
     * @param cmd
     */
    public void handleCpCount(CpCommand cmd) {
        // 创建 找实体
        PlayerOpeEntity playerOpeEntity = playerOpeRepository.load(cmd.getPlayerId());
        // 实体调用业务处理方法
        playerOpeEntity.handleCpCount(cmd.getCpPlayerId());
        // 保存实体
        playerOpeRepository.saveOrUpdate(playerOpeEntity);
    }

    public void handleMvp(MvpCommand cmd) {
        PlayerOpeEntity playerOpeEntity = playerOpeRepository.load(cmd.getPlayerId());
        playerOpeEntity.handleMvp(cmd.getMvpTime());
        playerOpeRepository.saveOrUpdate(playerOpeEntity);
    }
}
