package com.korona.services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.korona.dto.InfectionResponse;
import com.korona.dto.InfectionStatus;
import com.korona.dto.InfectionsResponse;
import com.korona.dto.UserData;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/v1/infection")
public class InfectionService {

    public static final Gson gson = new GsonBuilder()
            .disableHtmlEscaping()
            .setPrettyPrinting().create();
    @GET
    @Path("{user-name}")
    public Response isUserInfected() {
        InfectionResponse response = new InfectionResponse();
        response.setStatus(InfectionStatus.CURED);
        return Response.status(200).entity(gson.toJson(response)).build();
    }

    @GET
    public Response infections() {
        List<UserData> users = new ArrayList<>();
        users.add(new UserData("Jan", "Kowalski", "Zarazona 1 95-300 Legedzin"));
        users.add(new UserData("Mariola", "Zieba", "Zarazona 34 95-300 Legedzin"));
        InfectionsResponse infectionsResponse = new InfectionsResponse();
        infectionsResponse.setUsers(users);
        return Response.status(200).entity(gson.toJson(infectionsResponse)).build();
    }
}
