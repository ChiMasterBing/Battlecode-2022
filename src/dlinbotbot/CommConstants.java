package dlinbotbot;

public class CommConstants {
    public final static int ARCHON = 0b111,
            LABORATORY = 0b110,
            CRITICAL = 0b101,
            HIGH = 0b100,
            MEDIUM = 0b011,
            LOW = 0b010,
            VERY_LOW = 0b001,
            UNKNOWN = 0b000;

    public final static int HAS_LEAD = 0b1000,
                            NO_LEAD = 0b0000;

    public final static int SCAN_LEAD = 0b1,
                            SCAN_ENEMY = 0b10,
                            SCAN_FRIENDLY = 0b100;

    public final static int HORIZONTAL = 0b01,
                            VERTICAL = 0b10,
                            ROTATIONAL = 0b11;
}
