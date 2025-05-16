package net.threemp.hardrecipes.customitem;

import com.google.common.collect.Sets;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.extensions.IForgeBlock;
import net.minecraftforge.common.extensions.IForgeItem;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ModToolActions {
    public static final ToolAction SHEARS_HARVEST = ToolAction.get("shears_harvest");

    public static final Set<ToolAction> DEFAULT_SCRAPER_ACTIONS = of (SHEARS_HARVEST);

    private static Set<ToolAction> of(ToolAction... actions) {
        return Stream.of(actions).collect(Collectors.toCollection(Sets::newIdentityHashSet));
    }
}
