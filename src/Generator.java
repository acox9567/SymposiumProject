//Alexander Cox
//Monday, February 25, 2019

import org.jfugue.pattern.Pattern;

public class Generator {

    public static String genKey() {
        int rand = (int) (Math.random() * 100) + 1;
        String type;

        if (rand < 33.7)
            type = "min";
        else
            type = "maj";

        rand = (int) (Math.random() * 102) + 1;

        if (rand <= 26) {
            if (type.equals("maj")) {
                return "KCmaj";
            } else {
                return "KAmin";
            }
        }

        if (rand <= 38) {
            if (type.equals("maj")) {
                return "KGmaj";
            } else {
                return "KEmin";
            }
        }

        if (rand <= 48) {
            if (type.equals("maj")) {
                return "KEbmaj";
            } else {
                return "KCmin";
            }
        }

        if (rand <= 57) {
            if (type.equals("maj")) {
                return "KFmaj";
            } else {
                return "KDmin";
            }
        }
        if (rand <= 65) {
            if (type.equals("maj")) {
                return "KDmaj";
            } else {
                return "KBmin";
            }
        }

        if (rand <= 73) {
            if (type.equals("maj")) {
                return "KAmaj";
            } else {
                return "KF#min";
            }
        }

        if (rand <= 80) {
            if (type.equals("maj")) {
                return "KEmaj";
            } else {
                return "KC#min";
            }
        }

        if (rand <= 87) {
            if (type.equals("maj")) {
                return "KDbmaj";
            } else {
                return "KBbmin";
            }
        }
        if (rand <= 92) {
            if (type.equals("maj")) {
                return "KBbmaj";
            } else {
                return "KGmin";
            }
        }

        if (rand <= 96) {
            if (type.equals("maj")) {
                return "KAbmaj";
            } else {
                return "KFmin";
            }
        }

        if (rand <= 99) {
            if (type.equals("maj")) {
                return "KBmaj";
            } else {
                return "KG#min";
            }
        }

        if (rand <= 102) {
            if (type.equals("maj")) {
                return "KF#maj";
            } else {
                return "KD#min";
            }
        }

        return "genKey error";
    }

    public static int genTempo() {
        return (int) (Math.random() * 100) + 80;
    }

    public static Pattern genTheme(Composition piece) {
        Pattern theme = new Pattern();
        Pattern A = new Pattern();
        Pattern B = new Pattern();

        A = genSection(piece);
        B = genSection(piece);

        theme.add(A, A, B, A);

        return theme;
    }

    public static Pattern genSection(Composition piece) {
        Pattern section = new Pattern();

        section.setTempo(piece.getTempo());

        section.add(genChords(piece, 8));
        section.add(genMelody(piece, 8));

        return section;
    }

    public static String genChords(Composition piece, int length) {
        String chords = "V0 [Piano] ";

        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * 7);

            if (rand == 0)
                chords += piece.getI() + "w | ";
            if (rand == 1)
                chords += piece.getII() + "w | ";
            if (rand == 2)
                chords += piece.getIII() + "w | ";
            if (rand == 3)
                chords += piece.getIV() + "w | ";
            if (rand == 4)
                chords += piece.getV() + "w | ";
            if (rand == 5)
                chords += piece.getVI() + "w | ";
            if (rand == 6)
                chords += piece.getVII() + "w | ";
        }

        return chords;
    }

    public static String genMelody(Composition piece, int length) {
        String[] notes = piece.getNotes();
        String melody = "V1 [Piano] ";
        int measureLength = 0;

        for (int i = 0; i < length; i++) {
            while (measureLength < 16) {
                String value = genValue(measureLength);

                if (value.equals("w"))
                    measureLength += 16;
                if (value.equals("h"))
                    measureLength += 8;
                if (value.equals("q"))
                    measureLength += 4;
                if (value.equals("e"))
                    measureLength += 2;
                if (value.equals("s"))
                    measureLength += 1;

                melody += genPitch(piece, melody) + value + " ";
            }

            melody += " | ";
        }

        return melody;
    }

    public static String genValue(int measureLength) {
        String value = "none";
        while (value.equals("none")) {
            int rand = (int) (Math.random() * 100) + 1;

            if (rand <= 20 && measureLength == 0)
                value = "w";
            if (rand <= 40 && measureLength <= 8)
                value = "h";
            if (rand <= 60 && measureLength <= 12)
                value = "q";
            if (rand <= 80 && measureLength <= 14)
                value = "e";
            else
                value = "s";
        }

        return value;
    }

    public static String genPitch(Composition piece, String melody)
    {
        String note;

        if (melody.substring(melody.length() - 3).equals(" | ") || melody.substring(melody.length() - 2).equals("] "))
        {
            note = piece.getNotes((int)(Math.random() * 15));
        }
        else
        {
            int newIdx = -1;
            int lastIdx = -1;
            String[] notes = piece.getNotes();
            String lastNote = melody.substring(melody.length() - 5).trim();
            lastNote = lastNote.substring(0, lastNote.length() - 1);

            for (int i = 0; i < notes.length; i++)
            {
                if(notes[i].equals(lastNote))
                    lastIdx = i;
            }

            int rand = (int)(Math.random() * 100);

            if (rand < 80)
            {
                if (rand < 40 && lastIdx >= 1)
                    newIdx = lastIdx - 1;
                else if (lastIdx < 14)
                    newIdx = lastIdx + 1;
                else
                    newIdx = lastIdx - 1;
            }
            else if (rand < 90)
            {
                if (rand < 85 && lastIdx >= 3)
                    newIdx = lastIdx - 3;
                else if (lastIdx < 12)
                    newIdx = lastIdx + 3;
                else
                    newIdx = lastIdx - 3;
            }
            else if (rand < 95)
            {
                if (rand < 93 && lastIdx >= 5)
                    newIdx = lastIdx - 5;
                else if (lastIdx < 10)
                    newIdx = lastIdx + 5;
                else
                    newIdx = lastIdx - 5;
            }
            else
            {
                newIdx = (int)(Math.random() * 15);
            }

            note = notes[newIdx];
        }

        return note;
    }
}