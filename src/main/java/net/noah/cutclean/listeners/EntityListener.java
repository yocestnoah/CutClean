package net.noah.cutclean.listeners;

import net.noah.cutclean.CutClean;

import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ItemSpawnEvent;
import org.bukkit.inventory.ItemStack;

public class EntityListener implements Listener {

    @EventHandler
    public void onItemDrop(ItemSpawnEvent event) {
        if(CutClean.status){

            Item droppedItem = event.getEntity();

            switch (droppedItem.getItemStack().getType()) {

                case RAW_IRON:
                case IRON_ORE:
                    droppedItem.setItemStack(new ItemStack(Material.IRON_INGOT));
                    break;
                case RAW_IRON_BLOCK:
                    droppedItem.setItemStack(new ItemStack(Material.IRON_BLOCK));
                    break;
                case RAW_GOLD:
                case GOLD_ORE:
                    droppedItem.setItemStack(new ItemStack(Material.GOLD_INGOT));
                    break;
                case RAW_GOLD_BLOCK:
                    droppedItem.setItemStack(new ItemStack(Material.GOLD_BLOCK));
                    break;
                case RAW_COPPER:
                case COPPER_ORE:
                    droppedItem.setItemStack(new ItemStack(Material.COPPER_INGOT));
                    break;
                case RAW_COPPER_BLOCK:
                    droppedItem.setItemStack(new ItemStack(Material.COPPER_BLOCK));
                    break;

                case BEEF:
                    droppedItem.setItemStack(new ItemStack(Material.COOKED_BEEF));
                    break;
                case PORKCHOP:
                    droppedItem.setItemStack(new ItemStack(Material.COOKED_PORKCHOP));
                    break;
                case MUTTON:
                    droppedItem.setItemStack(new ItemStack(Material.COOKED_MUTTON));
                    break;
                case CHICKEN:
                    droppedItem.setItemStack(new ItemStack(Material.COOKED_CHICKEN));
                    break;
                case RABBIT:
                    droppedItem.setItemStack(new ItemStack(Material.COOKED_RABBIT));
                    break;
                case COD:
                    droppedItem.setItemStack(new ItemStack(Material.COOKED_COD));
                    break;
                case SALMON:
                    droppedItem.setItemStack(new ItemStack(Material.COOKED_SALMON));
                    break;
                case POTATO:
                    droppedItem.setItemStack(new ItemStack(Material.BAKED_POTATO));
                    break;
                case KELP:
                    droppedItem.setItemStack(new ItemStack(Material.DRIED_KELP));
                    break;
            }
        }
    }
}