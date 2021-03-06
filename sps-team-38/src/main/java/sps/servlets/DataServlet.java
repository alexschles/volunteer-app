
package com.google.sps.servlets;

import com.google.gson.Gson;
import java.io.IOException;
import java.util.Date;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.SortDirection;
import com.google.sps.data.UserInfo;

/** Servlet that returns some example content. TODO: modify this file to handle information from user */
@WebServlet("/data")
public class DataServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Query query = new Query("UserInfo").addSort("timestamp", SortDirection.DESCENDING);

        //  DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
        // PreparedQuery results = datastore.prepare(query);

        // List<UserInfo> info = new ArrayList<>();
        // for (Entity entity : results.asIterable()) {
        //     String name = (String) entity.getProperty("name");
        //     long timestamp = (long) entity.getProperty("timestamp");    
        //     UserInfo userName = new UserInfo(name, timestamp);
        //     info.add(userName);
        // }

        // Gson gson = new Gson();
        // String Json = gson.toJson(info);
        // response.setContentType("application/json;");
        // response.getWriter().println(Json);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //get user input from the form
        // String name = request.getParameter("name");
        // long timestamp = System.currentTimeMillis();

        // Entity taskEntity = new Entity("UserInfo");
        // taskEntity.setProperty("name",name);
        // taskEntity.setProperty("timestamp", timestamp);
        // DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
        // datastore.put(taskEntity);
    }
}
