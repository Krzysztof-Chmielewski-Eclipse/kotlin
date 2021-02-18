package uk.co.eclipsegroup.kotlin;

public class Main {
    public static void main(String[] args) {
        Beer beer = new Beer("Krzysztof IPA", "KIPA", 90);
        KotlinBeer kBeer = new KotlinBeer("Krzysztof IPA", "KIPA", 90);

        System.out.println(beer.getName());
        System.out.println(kBeer.getName());

        System.out.println(beer);
        System.out.println(kBeer);
    }
}
