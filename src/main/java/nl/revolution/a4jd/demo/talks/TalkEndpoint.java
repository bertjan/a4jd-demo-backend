package nl.revolution.a4jd.demo.talks;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TalkEndpoint {

    private TalkService talkService;

    public TalkEndpoint(TalkService talkService) {
        this.talkService = talkService;
    }

    @GetMapping("/talks")
    @CrossOrigin
    public List<Talk> getTalks() {
        return talkService.getTalks();
    }
}
