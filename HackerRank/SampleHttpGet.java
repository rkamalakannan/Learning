import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.http.HttpClient;
import java.text.NumberFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class SampleHttpGet {

    public int solution(int year, String team) throws MalformedURLException, IOException, ProtocolException {
   
        NumberFormat format = new NumberFormat();
        NumberFormat.getCurrencyInstance().




        URL url = new URL("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        
        connection.setRequestMethod("GET");
        connection.setRequestProperty("accept", "application/json");

        connection.setDoInput(true);

        // InputStream responStream = connection.getInputStream();


        // BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        int responsecode = connection.getResponseCode();
			System.out.println("Response code is: " +responsecode);

        if(responsecode != 200)
				throw new RuntimeException("HttpResponseCode: " +responsecode);
			else
			{
				//Scanner functionality will read the JSON data from the stream
				Scanner sc = new Scanner(url.openStream());
				while(sc.hasNext())
				{
					inline+=sc.nextLine();
				}
				System.out.println("\nJSON Response in String format"); 
				System.out.println(inline);
				//Close the stream when reading the data has been finished
				sc.close();
			}

			JSONParser parse = new JSONParser();




        return year;      
    }

    public static void main(String[] args) throws MalformedURLException, IOException, ProtocolException{

        SampleHttpGet sol = new SampleHttpGet();

        sol.solution(2021,"Barcelona");

    }

}
