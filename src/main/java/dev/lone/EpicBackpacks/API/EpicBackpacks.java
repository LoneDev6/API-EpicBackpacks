package dev.lone.EpicBackpacks.API;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.inventory.ItemStack;

public class EpicBackpacks
{
    public static boolean autoPickupToAnyBackpack(PlayerPickupItemEvent e)
    {
        throw new NotActuallyEpicBackpacksException();
    }

    public static boolean autoPickupToAnyBackpack(Player player, ItemStack item)
    {
        throw new NotActuallyEpicBackpacksException();
    }
}
