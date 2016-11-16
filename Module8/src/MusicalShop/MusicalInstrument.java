package MusicalShop;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Олесь on 16.11.2016.
 */
public class MusicalInstrument {

   static Piano piano = new Piano();
    static Trumpet trumpet = new Trumpet();
    static Guitar guitar = new Guitar();

    String sound;

    public static void main(String[] args) {

        final List<MusicalInstrument>musicalInstrumetnList = new ArrayList<>();
        musicalInstrumetnList.add(piano);

        musicalInstrumetnList.add(trumpet);

        musicalInstrumetnList.add(guitar);


        for (MusicalInstrument musicalInstrument : musicalInstrumetnList) {
            System.out.println(musicalInstrument);

        }


        piano.sound = "pianoSound";
        trumpet.sound = "trumpetSound";
        guitar.sound = "guitarSound";




    }
}
