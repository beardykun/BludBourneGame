package com.mygdx.game.UI;

public interface StoreInventoryObserver {
    enum StoreInventoryEvent {
        PLAYER_GP_TOTAL_UPDATED,
        PLAYER_INVENTORY_UPDATED
    }

    void onNotify(String value, StoreInventoryEvent event);
}
