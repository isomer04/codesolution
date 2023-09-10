

import java.util.ArrayList;
import java.util.List;

// Question Title: "Launch Sequence Checker"

// Description: SpaceX is preparing for a rocket launch. They need to ensure that the launch sequence is correct. Given a string of events (e.g., "engine start, fuel loading, liftoff, stage separation, payload deployment"), write a function to check if the events are in the correct order as specified by SpaceX's launch protocol.

// Question Title: "Mars Coordinates Transformation"

// Description: SpaceX's Mars rover sends back data with Martian coordinates in the format "X-123.456 Y-789.012." Write a function to convert these coordinates into Earth coordinates, represented as "Latitude: 12.3456, Longitude: 78.9012."

// Question Title: "Rocket Payload Identifier"

// Description: SpaceX's rocket carries multiple payloads, each identified by a unique alphanumeric code. Given a string containing payload codes separated by commas (e.g., "P123,Q456,R789"), write a function to count the number of payloads and return a list of these codes.

// Question Title: "SpaceX Twitter Hashtag Generator"

// Description: SpaceX wants to generate a unique hashtag for each rocket launch. Given the launch date in the format "YYYY-MM-DD" and the rocket name (e.g., "Falcon 9"), create a function that generates a hashtag like "#SpaceXLaunch_20230908_Falcon9."

// Question Title: "Orbit Calculation"

// Description: SpaceX needs to calculate the orbital parameters of a satellite. Given a string containing the satellite's initial altitude and orbital period in the format "Altitude: 500 km, Period: 90 minutes," write a function to compute the satellite's semi-major axis and orbital velocity.

// Question Title: "SpaceX Message Encoder"

// Description: SpaceX wants to send secret messages to its Mars mission team. Write a function that takes a message as input and encodes it using a simple substitution cipher, where each letter is replaced with the letter that comes after it in the alphabet (e.g., 'A' becomes 'B,' 'B' becomes 'C,' and so on).

// Question Title: "Starship Registration Number Generator"

// Description: SpaceX is building Starships for future missions. Each Starship needs a unique registration number. Write a function that generates these numbers based on a pattern, such as "SS-001," "SS-002," and so on, incrementing with each new Starship.

public class spacex2 {
    



public boolean isLaunchSequenceCorrect(String events) {
    String[] expectedEvents = {"engine start", "fuel loading", "liftoff", "stage separation", "payload deployment"};
    String[] actualEvents = events.split(", ");
    for (int i = 0; i < expectedEvents.length; i++) {
        if (!actualEvents[i].equals(expectedEvents[i])) {
            return false;
        }
    }
    return true;
}

public String convertToEarthCoordinates(String marsCoordinates) {
    String[] parts = marsCoordinates.split(" ");
    double marsX = Double.parseDouble(parts[0].substring(2));
    double marsY = Double.parseDouble(parts[1].substring(2));
    double earthLat = marsX / 10.0;
    double earthLong = marsY / 10.0;
    return "Latitude: " + earthLat + ", Longitude: " + earthLong;
}

public List<String> identifyPayloads(String payloadString) {
    String[] payloads = payloadString.split(",");
    List<String> payloadList = new ArrayList<>();
    for (String payload : payloads) {
        payloadList.add(payload.trim());
    }
    return payloadList;
}


public String generateLaunchHashtag(String launchDate, String rocketName) {
    String[] dateParts = launchDate.split("-");
    return "#SpaceXLaunch_" + dateParts[0] + dateParts[1] + dateParts[2] + "_" + rocketName.replace(" ", "");
}

public void calculateOrbitParameters(String orbitalInfo) {
    String[] parts = orbitalInfo.split(",");
    int altitude = Integer.parseInt(parts[0].split(": ")[1].trim().split(" ")[0]);
    int period = Integer.parseInt(parts[1].split(": ")[1].trim().split(" ")[0]);
    double semiMajorAxis = Math.cbrt(Math.pow(period, 2) * 398600.4418 / (4 * Math.pow(Math.PI, 2)));
    double orbitalVelocity = (2 * Math.PI * semiMajorAxis) / (period * 60); // Convert period to seconds
    System.out.println("Semi-Major Axis: " + semiMajorAxis + " km");
    System.out.println("Orbital Velocity: " + orbitalVelocity + " km/s");
}

public String encodeMessage(String message) {
    StringBuilder encodedMessage = new StringBuilder();
    for (char c : message.toCharArray()) {
        if (Character.isLetter(c)) {
            char encodedChar = (char) (c + 1);
            if (encodedChar > 'z') {
                encodedChar = 'a';
            }
            encodedMessage.append(encodedChar);
        } else {
            encodedMessage.append(c);
        }
    }
    return encodedMessage.toString();
}

private int starshipCounter = 1;

public String generateStarshipRegistrationNumber() {
    String registrationNumber = "SS-" + String.format("%03d", starshipCounter);
    starshipCounter++;
    return registrationNumber;
}


}



