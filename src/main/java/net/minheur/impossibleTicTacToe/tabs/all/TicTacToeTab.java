package net.minheur.impossibleTicTacToe.tabs.all;

import javafx.scene.layout.VBox;
import net.minheur.potoflux.screen.tabs.BaseVTab;
import net.minheur.potoflux.translations.Translations;

public class TicTacToeTab extends BaseVTab<VBox> {
    @Override
    protected void instantiate() {
        PANEL = new VBox();
    }

    @Override
    protected void setPanel() {
        // add here content
    }

    @Override
    protected String getTitle() {
        return Translations.get("impossibleTicTacToe:tabs.ticTacToeTab.title");
    }

    @Override
    public String getName() {
        return Translations.get("impossibleTicTacToe:tabs.ticTacToeTab.name");
    }
}
