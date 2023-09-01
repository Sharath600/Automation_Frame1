package Generic;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import.restassured.Specification.RequestSpecification;
public class SpecBuilder 
{
 public static Request Specification Req_Spec()
{
 RequestSpecBuilder r = new RequestSpecBuilder();
 RequestSpecification req = r.setBaseUrl("https://reqres.in/").setContentType.JSON).SpecBuilder();
 return req;	
}
}

