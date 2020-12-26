public enum ClothingSize {

    XXS(32){
        @Override
        public String getDescription() { return this.euroSize + "equals 81-86 cm"; }
    },
    XS(34){
        @Override
        public String getDescription() {
            return this.euroSize + "equals 86-91 cm";
        }
    },
    S(36){
        @Override
        public String getDescription() {
            return this.euroSize + "equals 91-96 cm";
        }
    },
    M(40){
        @Override
        public String getDescription() {
            return this.euroSize + "equals 96-101 cm";
        }
    },
    L(44){
        @Override
        public String getDescription() {
            return this.euroSize + "equals 101-106 cm";
        }
    };

    int euroSize;

    ClothingSize(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public void setEuroSize(int euroSize) {
        this.euroSize = euroSize;
    }

    public abstract String getDescription();
}
