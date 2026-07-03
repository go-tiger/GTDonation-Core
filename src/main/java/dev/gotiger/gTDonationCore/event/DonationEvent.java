package dev.gotiger.gTDonationCore.event;

import dev.gotiger.gTDonationCore.enums.Platform;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class DonationEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final Player player;
    private final String donorName;
    private final int amount;
    private final String message;
    private final Platform platform;

    public DonationEvent(Player player, String donorName, int amount, String message, Platform platform) {
        this.player = player;
        this.donorName = donorName;
        this.amount = amount;
        this.message = message;
        this.platform = platform;
    }

    public Player getPlayer() {
        return player;
    }

    public String getDonorName() {
        return donorName;
    }

    public int getAmount() {
        return amount;
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
