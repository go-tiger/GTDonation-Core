package dev.gotiger.gTDonationCore.event;

import dev.gotiger.gTDonationCore.enums.Platform;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ChatEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final Player player;
    private final String chatterName;
    private final String message;
    private final Platform platform;

    public ChatEvent(Player player, String chatterName, String message, Platform platform) {
        this.player = player;
        this.chatterName = chatterName;
        this.message = message;
        this.platform = platform;
    }

    public Player getPlayer() {
        return player;
    }

    public String getChatterName() {
        return chatterName;
    }

    public String getMessage() {
        return message;
    }

    public Platform getPlatform() {
        return platform;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}
