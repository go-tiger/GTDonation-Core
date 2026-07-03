package dev.gotiger.gTDonationCore.api;

import dev.gotiger.gTDonationCore.enums.Platform;
import dev.gotiger.gTDonationCore.event.ChatEvent;
import dev.gotiger.gTDonationCore.event.DonationEvent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public final class GTDonationAPI {

    private GTDonationAPI() {
    }

    public static void callDonationEvent(Player player, String donorName, int amount, String message, Platform platform) {
        Bukkit.getPluginManager().callEvent(new DonationEvent(player, donorName, amount, message, platform));
    }

    public static void callChatEvent(Player player, String chatterName, String message, Platform platform) {
        Bukkit.getPluginManager().callEvent(new ChatEvent(player, chatterName, message, platform));
    }
}
