package com.korona.dto;

import java.util.List;

public class InfectionsResponse {
    private List<UserData> users;

    public List<UserData> getUsers() {
        return users;
    }

    public void setUsers(List<UserData> users) {
        this.users = users;
    }
}
