package com.rao.dddstudy.application.command;

import lombok.Data;

import java.io.Serializable;

/**
 * @author create 2024/3/18 by rao
 */
@Data
public class CpCommand implements Serializable {

    private String playerId;

    private String cpPlayerId;

}
