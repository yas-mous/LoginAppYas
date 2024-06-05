package demo.model;

import jakarta.persistence.*;

@Entity
public class Node {
    @Id
    private String hostname;
   List<Worker> workers;

    public Node() {
    }
    public Node(String hostname) {
        this.hostname = hostname;
    }

    public String getHostname() {
        return hostname;
    }
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }


}
