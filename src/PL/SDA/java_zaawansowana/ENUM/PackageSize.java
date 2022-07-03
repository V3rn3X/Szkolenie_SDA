package PL.SDA.java_zaawansowana.ENUM;

public enum PackageSize {

    SMALL(10,20),
    MEDIUM(21, 40),
    LARGE(41, 61);

        private final int minSize;
        private final int maxSize;

    PackageSize(int min, int max) {
        this.minSize = min;
        this.maxSize = max;
    }

    public static PackageSize getPackageSize(int maxSize){
        if(maxSize > LARGE.maxSize){
            throw new IllegalArgumentException("The package is too big");
        }
        if(maxSize <= SMALL.maxSize){
            return SMALL;
        }
        if(maxSize <= MEDIUM.maxSize){
            return MEDIUM;
        }
        return LARGE;
    }

    public String toString(){
        return "PackageSize " + "min=" + minSize + ", max=" + maxSize;
    }

}
