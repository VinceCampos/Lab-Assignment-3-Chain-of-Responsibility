public class WasteManagementSystem {
    public static void main(String[] args) {
        WasteCollector organicCollector = new OrganicWaste();
        WasteCollector recyclableCollector = new RecyclableWaste();
        WasteCollector hazardousCollector = new HazardousWaste();

        organicCollector.setNextCollector(recyclableCollector);
        recyclableCollector.setNextCollector(hazardousCollector);

        WasteContainer organicBin = new WasteContainer("Organic", 20, true);
        WasteContainer recyclableBin = new WasteContainer("Recyclable", 25, true);
        WasteContainer hazardousBin = new WasteContainer("Hazardous", 10, true);

        organicCollector.collectWaste(organicBin);
        organicCollector.collectWaste(recyclableBin);
        organicCollector.collectWaste(hazardousBin);
        recyclableCollector.collectWaste(organicBin); //It will not accept the Organic Bin because it only accepts recyclable materials
    }
}