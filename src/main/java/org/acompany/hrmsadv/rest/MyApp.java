package org.acompany.hrmsadv.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

//no need to add servlet in web xml. Jas rx will knoew that's it's a  jax rs app by looking at this Application class


// creating the root api, can be given any name, it's the startig point of the application url.
@ApplicationPath("webapi") 
public class MyApp extends Application{

}
