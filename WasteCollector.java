abstract class WasteCollector {
    private WasteCollector nextCollector;

    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    protected WasteCollector getNextCollector() {
        return nextCollector;
    }

    public void collectWaste(WasteContainer container) {
        if (nextCollector != null) {
            nextCollector.collectWaste(container);
        } else {
            System.out.println("No suitable collector found for: " + container.getType());
        }
    }
}
