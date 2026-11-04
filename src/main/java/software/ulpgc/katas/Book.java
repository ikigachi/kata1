package software.ulpgc.katas;

public record Book(String title, int pages) {
    public boolean isLong() {
        return pages > 300;
    }
}
