package javaocp.IOExamples.LocationExample;


public class LocationClassWriteAndRead {
    private Locations locationsBase=new Locations();

    public void readLocations() {
        for(Location location:locationsBase.values()){
            System.out.println("Locations: "+location.getLocationID()+","+location.getDescription());
            for(String exit:location.getExits().keySet()){
                System.out.println("exits: "+exit+","+location.getExits().get(exit));
            }
        }
    }

    public static void main(String[] args) {

          //readLocations();
    }



}
