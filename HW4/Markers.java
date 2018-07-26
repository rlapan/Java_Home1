package HW4;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Markers {

	@JsonProperty("markers")
	private ArrayList<Marker> markers;

	public ArrayList<Marker> getMarkers() {
		return markers;
	}

}
