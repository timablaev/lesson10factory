package nix_solutions;

public class StadiumBuild extends Build{
    @Override
    public Building factory() {
        return new BuildingStadium();
    }
}
