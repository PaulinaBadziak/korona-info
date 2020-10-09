package com.korona.services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.korona.dto.InfectionResponse;
import com.korona.dto.InfectionStatus;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

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
}
