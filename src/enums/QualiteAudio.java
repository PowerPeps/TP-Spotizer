public enum QualiteAudio {
    STANDARD(0.02, "256kb/s"),
    HD(0.03, "512kb/s");
    
    private final double tarifPar5Min;
    private final String bitrate;
    
    QualiteAudio(double tarif, String bitrate) {
        this.tarifPar5Min = tarif;
        this.bitrate = bitrate;
    }
    
    public double getTarifPar5Min() {
        return tarifPar5Min;
    }
    
    public String getBitrate() {
        return bitrate;
    }
}
