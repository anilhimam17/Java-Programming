public enum Apple {
    iPhone, iPad, Mac, Airpods, AppleWatch;

    public int get_price() {
        return switch (this) {
            case iPhone, iPad -> 799;
            case Mac -> 1299;
            default -> 299;
        };
    }
}
