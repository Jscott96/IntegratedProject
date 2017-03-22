package main.models;



// huh so it uses javax @Entity, i thought spring had its own, but its been working so it must be right haha
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Dean on 15/02/2017.
 */

@Entity
@Table(name = "document_table")
public class Document {

    // An autogenerated id (unique for each document in the database)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    private long revisionNo;
    @NotNull
    private String title;
    @NotNull
    private String filepath = "/user/document";
    private boolean active = false;
    private Date creationDate = new Date();

    public Document() { }

    // Public methods
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getRevisionNo() {
        return revisionNo;
    }

    public void setRevisionNo(long revisionNo) {
        this.revisionNo = revisionNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }


    @Override
    public String toString() {
        return  "Doc(docID: " + this.id + " | revisionNo: " + this.revisionNo + " | title: " + this.title +
                " | filepath: " + this.filepath + " | isActive: " + this.active + " | creationDate: " +
                this.creationDate;
    }
}
