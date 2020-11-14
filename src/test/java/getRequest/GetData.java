package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetData 
{
	@Test (priority = 0)
	public void trafficMapRequest() 
	{
		//Hit on the request
		baseURI = "https://1.traffic.maps.cit.api.here.com/maptile/2.1/traffictile/newest/normal.day/15/16358/10898/256/png8?";
		Response response = RestAssured.given().formParam("app_id", "xxxxx" , "app_code", "xxxxxx").when().get();
		
		//Assert on Status Code
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		System.out.println("Status Code is" + response.getStatusCode());		
		
		//Assert on Response Body
		String responseBody = response.getBody().asString();
		Assert.assertEquals(responseBody, "xxxxxx");
		System.out.println("Response Body is" + response.getBody().asPrettyString());
	}
	
	@Test (priority = 1)
	public void transparentTrafficMap() 
	{
		//Hit on the request
		baseURI = "https://1.traffic.maps.cit.api.here.com/maptile/2.1/flowtile/newest/normal.day/15/16358/10898/256/png8?";
		Response response = RestAssured.given().formParam("app_id", "xxxxx" , "app_code", "xxxxxx").when().get();
		
		//Assert on Status Code
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		System.out.println("Status Code is" + response.getStatusCode());		
		
		//Assert on Response Body
		String responseBody = response.getBody().asString();
		Assert.assertEquals(responseBody, "xxxxxx");
		System.out.println("Response Body is" + response.getBody().asPrettyString());
	}

}
