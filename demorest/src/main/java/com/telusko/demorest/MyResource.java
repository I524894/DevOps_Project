package com.telusko.demorest;

import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sun.tools.sjavac.Log;




/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
    	int a;
    	String sql = "select * from sap.iot.table";
    	Log.debug(sql);
    	System.out.println("Hello");
    	a=3/0;
    	System.out.println(a);
        return "Hello World!";
    }
    public static void main(String [] args) {
    	String s = " ";
    	s = null;
    	System.out.println(s);
    }
}
