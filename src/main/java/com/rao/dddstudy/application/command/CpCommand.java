package com.rao.dddstudy.application.command;

import lombok.Data;
import org.springframework.util.Assert;

import java.io.Serializable;

/**
 * @author create 2024/3/18 by rao
 */
@Data
public class CpCommand implements Serializable {

    private String playerId;

    private String cpPlayerId;


    public CpCommand(String playerId, String cpPlayerId) {
        Assert.notNull(playerId,"playerId 参数缺失");
        Assert.notNull(cpPlayerId,"cpPlayerId 参数缺失");
        this.playerId = playerId;
        this.cpPlayerId = cpPlayerId;
    }
}
