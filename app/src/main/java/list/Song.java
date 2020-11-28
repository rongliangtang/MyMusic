package list;

import java.io.Serializable;

public class Song implements Serializable {
    private String name;
    private String uri;
    private String downUri;

    public Song(String name, String uri, String downUri) {
        this.name = name;
        this.uri = uri;
        this.downUri = downUri;
    }

    public String getName() {
        return name;
    }

    public String getDownUri() {
        return downUri;
    }

    public void setDownUri(String downUri) {
        this.downUri = downUri;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
