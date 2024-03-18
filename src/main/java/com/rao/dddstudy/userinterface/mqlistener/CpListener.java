package com.rao.dddstudy.userinterface.mqlistener;

import com.alibaba.fastjson2.JSON;
import com.rao.dddstudy.application.PlayerOpeApplicationService;
import com.rao.dddstudy.application.command.CpCommand;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

/**
 * CP消息监听器
 */
@Component
public class CpListener {

    @Resource
    private PlayerOpeApplicationService playerOpeApplicationService;

    public void messageHandler(String message) {
        CpCommand cmd = JSON.parseObject(message, CpCommand.class);
        playerOpeApplicationService.handleCpCount(cmd);
    }

}
