class OrganicWaste extends WasteCollector {
    public void collectWaste(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("Organic") && container.isFull()) {
            System.out.println("Collecting and disposing of organic waste.");
        } else {
            super.collectWaste(container);
        }
    }
}