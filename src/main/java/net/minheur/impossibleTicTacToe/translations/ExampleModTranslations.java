package net.minheur.impossibleTicTacToe.translations;

import net.minheur.impossibleTicTacToe.ImpossibleTicTacToe;
import net.minheur.potoflux.translations.AbstractTranslationsRegistry;

public class ExampleModTranslations extends AbstractTranslationsRegistry {
    public ExampleModTranslations() {
        super(ImpossibleTicTacToe.MOD_ID);
    }

    @Override
    protected void makeTranslation() {
        addYourTab("name")
                .en("TicTacToe");
        addYourTab("title")
                .en("Welcome to Impossible TicTacToe!");
    }

    // tabs helper
    private TranslationBuilder addYourTab(String... children) {
        return addTab("ticTacToeTab", children);
    }
}
