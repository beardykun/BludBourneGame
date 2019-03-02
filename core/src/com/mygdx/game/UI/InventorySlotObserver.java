package com.mygdx.game.UI;

public interface InventorySlotObserver {
    enum SlotEvent{
        ADDED_ITEM,
        REMOVED_ITEM
    }

    void onNotify(final InventorySlot slot, SlotEvent event);
}
