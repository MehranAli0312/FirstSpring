package com.example.sample.model;

public class GameDto {
    private String compTeam;
private String userTeam;
private String result;

    public String getCompTeam() {
        return compTeam;
    }

    public void setCompTeam(String compTeam) {
        this.compTeam = compTeam;
    }

    public String getUserTeam() {
        return userTeam;
    }

    public void setUserTeam(String userTeam) {
        this.userTeam = userTeam;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
