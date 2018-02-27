public enum GenreType {

    THRILLER("It'll thrill you!"),
    CRIME("Full of nasty characters"),
    HORROR("WooooOOOOooooOOOOOooo"),
    FANTASY("Dragons and shiz"),
    SCIFI("The robots are taking over");

    private final String blurb;

    GenreType(String blurb) {
        this.blurb = blurb;
    }

    public String getBlurb() {
        return blurb;
    }

}
