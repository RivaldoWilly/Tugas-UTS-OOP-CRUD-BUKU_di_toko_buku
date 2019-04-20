package Entity;


public class Buku {

    private String id;
    private String judul;
    private String pengarang;
    private String harga;

    public Buku(String id, String judul, String pengarang, String harga) {
        this.id = id;
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
    }

    public boolean equals(Object object) {
        Buku bk = (Buku) object;
        return id.equals(bk.getId());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) { this.harga = harga; }
}