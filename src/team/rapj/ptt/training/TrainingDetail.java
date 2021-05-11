package team.rapj.ptt.training;

import java.util.Date;

public class TrainingDetail {
    private Date date;
    private String location;
    private String title;
    private String content;

    public TrainingDetail(Date _date, String _location, String _title, String _content) {
        this.date = _date;
        this.location = _location;
        this.title = _title;
        this.content = _content;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public String getContent() {
        return content;
    }

    public String getLocation() {
        return location;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "TrainingDetail {\n" +
                "date = " + date +
                ", location = '" + location + '\'' +
                ", title = '" + title + '\'' +
                ", content = '" + content + '\'' + '\n' +
                '}';
    }

    public static void main(String[] args) {
        TrainingDetail t1 = new TrainingDetail(new Date(), "1", "2", "1");

        System.out.println(t1.toString());
    }
}
