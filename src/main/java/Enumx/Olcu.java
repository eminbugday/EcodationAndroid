package Enumx;

public enum Olcu {
    KUCUK(1,"kucuk"),ORTA(2,"orta"),BUYUK(3,"buyuk");

    //final yazmamdaki sebeb sadece getter gelmesi i�indir
    private final long key;
    private final String value;

    //parametreli constructor
    //constructor private yazal�m ki instance olu�turulmas�
   private Olcu(long key, String value) {
        this.key = key;
        this.value = value;
    }

    //getter :Sadece getter olur ��nk� private final yazd���m�z i�in
    public long getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
