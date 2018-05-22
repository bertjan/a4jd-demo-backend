package nl.revolution.a4jd.demo.talks;

import java.util.List;

public class Talk {

    private String id;
    private String name;
    private List<Speaker> speakers;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Speaker> getSpeakers() {
        return speakers;
    }

    public Talk withId(String id) {
        this.id = id;
        return this;
    }

    public Talk withName(String name) {
        this.name = name;
        return this;
    }

    public Talk withSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
        return this;
    }
}
