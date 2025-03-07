class RecyclableWaste extends WasteCollector {
    public void collectWaste(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("Recyclable") && container.isFull()) {
            System.out.println("Collecting and processing recyclable waste.");
        } else {
            super.collectWaste(container);
        }
    }
}