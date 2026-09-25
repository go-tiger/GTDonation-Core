package dev.gotiger.gTDonationCore.event;

import dev.gotiger.gTDonationCore.enums.Platform;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ConnectionEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final Player player;
    private final Platform platform;
    private final boolean connected;

    public ConnectionEvent(Player player, Platform platform, boolean connected) {
        this.player = player;
        this.platform = platform;
        this.connected = connected;
    }

    public Player getPlayer() {
        return player;
    }

    public Platform getPlatform() {
        return platform;
    }

    public boolean isConnected() {
        return connected;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}
