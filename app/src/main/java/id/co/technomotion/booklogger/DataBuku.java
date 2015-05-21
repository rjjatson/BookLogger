package id.co.technomotion.booklogger;

/**
 * Created by Thoriq on 5/21/2015.
 */
public class DataBuku {
    private String title, author, page;

    public DataBuku (String title, String author, String page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    public String getPage()
    {
        return page;
    }

    public  void SetJudulBuku(String judulBuku){
        this.title = judulBuku;
    }

    public void SetPengarang(String namaPengarang){
        this.author = namaPengarang;
    }

    public void SetHalaman(String jumlahHalaman){
        this.page = jumlahHalaman;
    }

}
