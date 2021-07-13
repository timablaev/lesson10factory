package nix_solutions;

public class HouseBuild extends Build{
    @Override
    public Building factory() {
        return new BuildingHouse();
    }
}
