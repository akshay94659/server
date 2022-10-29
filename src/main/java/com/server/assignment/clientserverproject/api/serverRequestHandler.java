package com.server.assignment.clientserverproject.api;

import com.google.gson.JsonObject;
import com.server.assignment.clientserverproject.model.workloadRfd;
import com.server.assignment.clientserverproject.model.workloadRfw;
import com.server.assignment.clientserverproject.service.serverRequestHandlerService;
import java.io.FileNotFoundException;
import org.h2.util.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/workload")
public class serverRequestHandler {

    @Autowired
    serverRequestHandlerService  requestHandlerService;

    @PostMapping(value = "/rfw")
    public JsonObject sendReceiveRequest(@RequestBody MultiValueMap multiValueMap) throws FileNotFoundException {
        return requestHandlerService.sendRfd(multiValueMap);
    }
}
