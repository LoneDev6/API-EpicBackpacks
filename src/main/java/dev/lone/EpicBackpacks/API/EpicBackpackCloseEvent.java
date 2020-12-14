package dev.lone.EpicBackpacks.API;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class EpicBackpackCloseEvent extends PlayerEvent
{
    public EpicBackpackCloseEvent(Player player, ItemStack backpack, Inventory gui)
    {
        super(player);
        throw new NotActuallyEpicBackpacksException();
    }

    @NotNull
    public HandlerList getHandlers()
    {
        throw new NotActuallyEpicBackpacksException();
    }

    @NotNull
    public static HandlerList getHandlerList()
    {
        throw new NotActuallyEpicBackpacksException();
    }

    public ItemStack getBackpack()
    {
        throw new NotActuallyEpicBackpacksException();
    }

    public String getBackpackID()
    {
        throw new NotActuallyEpicBackpacksException();
    }

    public Inventory getGui()
    {
        throw new NotActuallyEpicBackpacksException();
    }
}