package HW4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class MarkersList {

	// MarkersList marker= new ArrayList ();

	public static void main(String[] args) {

		ObjectMapper objectMapper = new ObjectMapper();
		try {

			FileInputStream fis = new FileInputStream("Googlemaps.json");
			Markers mp = objectMapper.readValue(fis, Markers.class);
			System.out.println(mp.getMarkers());

		} catch (FileNotFoundException exception) {
			System.out.println("FileNotFoundException " + exception.getMessage());

		}

		catch (IOException exception) {
			System.out.println("Caught IOException: " + exception.getMessage());
		} finally {

		}

	}
}
