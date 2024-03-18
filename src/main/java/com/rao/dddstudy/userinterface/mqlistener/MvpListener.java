package com.rao.dddstudy.userinterface.mqlistener;

import com.alibaba.fastjson2.JSON;
import com.rao.dddstudy.application.PlayerOpeApplicationService;
import com.rao.dddstudy.application.command.MvpCommand;
import jakarta.annotation.Resource;

public class MvpListener {

    @Resource
    private PlayerOpeApplicationService playerOpeApplicationService;

    public void messageHandler(String message) {
        MvpCommand cmd = JSON.parseObject(message, MvpCommand.class);
        playerOpeApplicationService.handleMvp(cmd);
    }
}
