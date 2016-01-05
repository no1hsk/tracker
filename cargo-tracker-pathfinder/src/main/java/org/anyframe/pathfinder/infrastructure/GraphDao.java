package org.anyframe.pathfinder.infrastructure;

import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Repository
public class GraphDao implements Serializable {

	private static final long serialVersionUID = 5373875991411395148L;
	
	private final Random random = new Random();

    public List<String> listLocations() {
        return new ArrayList<>(Arrays.asList("CNHKG", "AUMEL", "SESTO",
                "FIHEL", "USCHI", "JNTKO", "DEHAM", "CNSHA", "NLRTM", "SEGOT",
                "CNHGH", "USNYC", "USDAL"));
    }

    public String getVoyageNumber(String from, String to) {
        int i = random.nextInt(5);

        switch (i) {
            case 0:
                return "0100S";
            case 1:
                return "0200T";
            case 2:
                return "0300A";
            case 3:
                return "0301S";
            default:
                return "0400S";
        }
    }
    
}
