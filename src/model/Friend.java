package model;

public class Friend {
    private String id;
    private String URl;
    private String name;


    public Friend(String id, String URl, String name) {
        this.id = id;
        this.URl = URl;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getURl() {
        return URl;
    }

    public void setURl(String URl) {
        this.URl = URl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return id + ". "+ name;
    }
}
