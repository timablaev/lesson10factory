package nix_solutions;

public class Main {

    public static void main(String[] args) {
	Build[] builds = {new HouseBuild(), new StadiumBuild()};
	for (Build build : builds) {
	    Building building = build.factory();
        System.out.printf("Created {%s}\n", build.getClass());
        System.out.println( build.factory());
    }
    }
}
