package com.server.assignment.clientserverproject.service;

import com.google.gson.JsonObject;
import java.io.FileNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;

@Component
public class serverRequestHandlerService {
    public int id;
    public String benchType;
    public String metric;
    public int batchID;
    public int batchUnit;
    public  int batchsize;

    public JsonObject sendRfd(MultiValueMap multiValueMap) throws FileNotFoundException {

        id = (int) multiValueMap.getFirst("id");
        benchType = (String) multiValueMap.getFirst("benchType");
        metric = (String) multiValueMap.getFirst("metric");
        batchID = (int) multiValueMap.getFirst("batchID");
        batchUnit = (int) multiValueMap.getFirst("batchUnit");
        batchsize = (int) multiValueMap.getFirst("batchsize");
//        Scanner sc = new Scanner(new File("../csvfiles/DVD-testing.csv"));
//        sc.useDelimiter(",");   //sets the delimiter pattern
        int dataSamples=batchUnit*batchsize;
        JsonObject obj=new JsonObject();
        obj.addProperty("id",id);
        obj.addProperty("batchID",batchID-1);
        obj.addProperty("dataSamples",dataSamples);
        obj.addProperty("dataAnalytics","dataAnalytics");
 return obj;

    }

}
