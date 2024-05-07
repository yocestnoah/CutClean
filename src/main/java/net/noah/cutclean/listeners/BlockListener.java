package net.noah.cutclean.listeners;

import net.noah.cutclean.CutClean;

import org.bukkit.GameMode;
import org.bukkit.block.Block;
import org.bukkit.entity.ExperienceOrb;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockListener implements Listener {

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        if (CutClean.status) {

            Player player = event.getPlayer();
            Block block = event.getBlock();

            if(player.getGameMode() != GameMode.CREATIVE) {

                ExperienceOrb experience = player.getWorld().spawn(player.getLocation(), ExperienceOrb.class);

                switch(block.getType()) {
                    case IRON_ORE:
                    case DEEPSLATE_IRON_ORE:
                    case COPPER_ORE:
                    case DEEPSLATE_COPPER_ORE:
                        experience.setExperience(1);
                        break;
                    case RAW_IRON_BLOCK:
                    case RAW_COPPER_BLOCK:
                        experience.setExperience(9);
                        break;
                    case GOLD_ORE:
                    case DEEPSLATE_GOLD_ORE:
                        experience.setExperience(2);
                        break;
                    case RAW_GOLD_BLOCK:
                        experience.setExperience(18);
                        break;
                }
            }
        }
    }
}
