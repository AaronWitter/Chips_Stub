package com.chips.stub.resources;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import java.io.InputStream;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by Aaron.Witter on 14/03/2016.
 */
@Path("/chips")
public class RestResource {

  @GET
  public String getMessage(){
    return "Hello World";
  }

  @POST
  @Consumes(MediaType.MULTIPART_FORM_DATA)
  public Response getResponse(     @FormDataParam("form") String form,
                                   @FormDataParam("file") InputStream file,
                                   @FormDataParam("file") FormDataContentDisposition fileDisposition){
    return Response.ok().entity("<data contentType=\"text/plain\" contentLength=\"1\"><![CDATA[0]]></data>").build();
  }
}
