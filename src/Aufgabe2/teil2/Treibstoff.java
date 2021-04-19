package Aufgabe2.teil2;

public enum Treibstoff {
    DIESEL {
        @Override
        public String toString() {
            return "Diesel";
        }
    },
    BENZIN {
        @Override
        public String toString() {
            return "Benzin";
        }
    },
    KOELSCH {
        @Override
        public String toString() {
            return "Kölsch";
        }
    },
    ELEKTRO {
        @Override
        public String toString() {
            return "Elektro";
        }
    }
}
