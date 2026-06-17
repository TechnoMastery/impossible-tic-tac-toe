package net.minheur.impossibleTicTacToe.tabs;

import net.minheur.impossibleTicTacToe.ImpossibleTicTacToe;
import net.minheur.potoflux.loader.mod.events.RegisterTabsEvent;
import net.minheur.potoflux.registry.RegistryList;
import net.minheur.potoflux.screen.tabs.Tab;
import net.minheur.potoflux.utils.SmartSupplier;
import net.minheur.potoflux.utils.ressourcelocation.ResourceLocation;
import net.minheur.impossibleTicTacToe.tabs.all.YourTabClass;

public class Tabs {
    private static final RegistryList<Tab> LIST = new RegistryList<>();

    // example tab
    public static final SmartSupplier<Tab> MY_TAB = LIST.add(() -> new Tab(new ResourceLocation(ImpossibleTicTacToe.MOD_ID, "ticTacToeTab"), YourTabClass.class));

    public static void register(RegisterTabsEvent event) {
        LIST.register(event.reg);
    }
}
