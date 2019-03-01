package in.the;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Whiskey {

    public static void main(final String... args) {
        new Whiskey().printDescription();
    }

    public void printDescription() {
        try (final var reader = new BufferedReader(new InputStreamReader(Whiskey.class.getResourceAsStream("/lyrics.md")))) {
            reader.lines().forEach(line -> {
                System.out.println(line.replace("<br />", ""));
            });
        } catch (final IOException e) {
            System.err.println("Oops... no description. Sorry and cheers.");
        }
    }
}
