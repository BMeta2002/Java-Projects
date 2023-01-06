package com.sookocheff.springdemo;

public class Player {

    private final String playerId;
    private final String alias;
    private final String displayName;

    public Player(final String id,
                  final String alias,
                  final String displayName) {
        this.playerId = id;
        this.alias = alias;
        this.displayName = displayName;
    }

    public String getPlayerId() {
        return playerId;
    }

    public String getAlias() {
        return alias;
    }

    public String getDisplayName() {
        return displayName;
    }
}

