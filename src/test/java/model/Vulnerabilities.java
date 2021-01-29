package model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Vulnerabilities {
    @JsonProperty("Vulnerabilities")
    List<Vulnerability> vulnerabilities;

    public List<Vulnerability> getVulnerabilities() {
        return vulnerabilities;
    }

    public void setVulnerabilities(List<Vulnerability> vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
    }
}
