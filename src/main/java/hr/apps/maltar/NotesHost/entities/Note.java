package hr.apps.maltar.NotesHost.entities;

/**
 * Created by Maltar on 17.9.2017..
 */
public class Note {
    private Long date;
    private String content;
    private int id;

    public Note(Long date, String content, int id) {
        this.date = date;
        this.content = content;
        this.id = id;
    }

    public Note(Long date, String content) {
        this.date = date;
        this.content = content;
        this.id = 0;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Note{" +
                "date=" + date +
                ", content=§" + content + '§' +
                ", id=" + id +
                '}';
    }
}
