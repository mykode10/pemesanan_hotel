package com.example.vindi.latihan.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    private static final int COUNT = 25;

    static {
        // Add some sample items.
        addItem(createDummyItem("Batal"));
        addItem(createDummyItem("Wifi"));
        addItem(createDummyItem("Kasur dua"));
        addItem(createDummyItem("Shower"));
        addItem(createDummyItem("TV"));
        addItem(createDummyItem("Ac"));
        addItem(createDummyItem("Lemari"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
    }

    private static DummyItem createDummyItem(String text) {
        return new DummyItem(text, "");
    }


    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String content;
        public final String details;

        public DummyItem(String content, String details) {
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
