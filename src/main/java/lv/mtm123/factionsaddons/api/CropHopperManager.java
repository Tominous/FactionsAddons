package lv.mtm123.factionsaddons.api;

import org.bukkit.Chunk;
import org.bukkit.Location;

/**
 * Interface for getting information about {@link CropHopper}s
 */
public interface CropHopperManager {

    /**
     * Returns {@link CropHopper} at the given chunk if found.
     * @param chunk Chunk for the {@link CropHopper}
     * @return {@link CropHopper} at that chunk if foun otherwise null.
     */
    CropHopper getCropHopperAtChunk(Chunk chunk);

    /**
     * Checks if block at given locations is a CropHopper
     * @param loc Location for the block that needs to be checked
     * @return True if block is a CropHopper
     */
    boolean isCropHopper(Location loc);

}