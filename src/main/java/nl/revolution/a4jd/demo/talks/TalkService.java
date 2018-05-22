package nl.revolution.a4jd.demo.talks;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

@Service
public class TalkService {

    private static final List<Talk> TALKS = asList(
            new Talk().withId("0").withName("Hacking the connected car").withSpeakers(asList(new Speaker().withName("Daan Keuper"))),
            new Talk().withId("1").withName("The definite guide to reactive programming in Java").withSpeakers(asList(new Speaker().withName("Erwin de Gier"))),
            new Talk().withId("2").withName("Common vulnerabilities you wish your Java app didn't have!").withSpeakers(asList(new Speaker().withName("Simon Maple"))),
            new Talk().withId("3").withName("Fostering an evolving architecture in the agile world").withSpeakers(asList(new Speaker().withName("Roy van Rijn"))),
            new Talk().withId("4").withName("Bulletproof, resilient Java Enterprise applications for the hard production life").withSpeakers(asList(new Speaker().withName("Sebastian Daschner"))),
            new Talk().withId("5").withName("Arm Based Servers and Java: Synergizing Performance").withSpeakers(asList(new Speaker().withName("Monica Beckwith"))),
            new Talk().withId("6").withName("Dancing services: Choreographed architectures with Axon Framework").withSpeakers(asList(new Speaker().withName("Frans van Buul"), new Speaker().withName("Christophe Bouhier"))),
            new Talk().withId("7").withName("Enabling Global Transportation Through Cash Services").withSpeakers(asList(new Speaker().withName("Thijs Niks"))),
            new Talk().withId("8").withName("The Diabolical Developer’s Guide to Performance Tuning").withSpeakers(asList(new Speaker().withName("Martijn Verburg"))),
            new Talk().withId("9").withName("Thinking about my doorbell").withSpeakers(asList(new Speaker().withName("Bert Ertman"))),
            new Talk().withId("10").withName("Hyperledger Fabric and Java").withSpeakers(asList(new Speaker().withName("Emond Papegaaij"))),
            new Talk().withId("11").withName("Making Microservices Micro with Istio and Kubernetes").withSpeakers(asList(new Speaker().withName("Ray Tsang"))),
            new Talk().withId("12").withName("Making cookies healthy. Security in a web based world.").withSpeakers(asList(new Speaker().withName("Siren Hofvander"))),
            new Talk().withId("13").withName("A journey from Java EE to cloud-native microservices").withSpeakers(asList(new Speaker().withName("Vincent Oostindië"))),
            new Talk().withId("15").withName("Continuous Delivery Patterns for Modern Architecture and Java").withSpeakers(asList(new Speaker().withName("Daniel Bryant"))),
            new Talk().withId("16").withName("Beautiful code: typography and visual programming").withSpeakers(asList(new Speaker().withName("Peter Hilton"))),
            new Talk().withId("17").withName("Angular for Java developers").withSpeakers(asList(new Speaker().withName("Bert Jan Schrijver")))
    );

    public List<Talk> getTalks() {
        return TALKS;
    }
}
